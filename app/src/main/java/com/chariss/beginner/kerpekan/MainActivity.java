package com.chariss.beginner.kerpekan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.chariss.beginner.kerpekan.adapter.ListMateriAdapter;
import com.chariss.beginner.kerpekan.materi.Materi;
import com.chariss.beginner.kerpekan.materi.MateriData;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMateri;
    private ArrayList<Materi> list = new ArrayList<>();


    public static int index = -1;
    public static int top = -1;
    LinearLayoutManager mLayoutManager;

    public MainActivity() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
   public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.openProfile) {
            Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(profileIntent);
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMateri = findViewById(R.id.rv_materi);
        rvMateri.setHasFixedSize(true);

        list.addAll(MateriData.getListData());
        showRecyclerList();

        AppCenter.start(getApplication(), "554bbcca-0493-49c2-993b-1dc79707a23f",
                Analytics.class, Crashes.class);
    }

    private void showRecyclerList() {
        mLayoutManager = new LinearLayoutManager(this);
        rvMateri.setLayoutManager(mLayoutManager);
        //rvMateri.setLayoutManager(new LinearLayoutManager(this));
        ListMateriAdapter listMateriAdapter = new ListMateriAdapter(list);
        rvMateri.setAdapter(listMateriAdapter);

        listMateriAdapter.setOnItemClickCallback(new ListMateriAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Materi data) {
                String detailJudul = data.getJudul();
                String detailDetail = data.getDetail();
                int detailGambar = data.getPhoto();

                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);

                detailIntent.putExtra(DetailActivity.EXTRA_JUDUL, detailJudul);
                detailIntent.putExtra(DetailActivity.EXTRA_DETAIL, detailDetail);
                detailIntent.putExtra(DetailActivity.EXTRA_GAMBAR, detailGambar);
                startActivity(detailIntent);
            }
        });
    }

    @Override
    public void onPause()
    {
        super.onPause();
        //read current recyclerview position
        index = mLayoutManager.findFirstVisibleItemPosition();
        View v = rvMateri.getChildAt(0);
        top = (v == null) ? 0 : (v.getTop() - rvMateri.getPaddingTop());
    }

    @Override
    public void onResume()
    {
        super.onResume();
        //set recyclerview position
        if(index != -1)
        {
            mLayoutManager.scrollToPositionWithOffset( index, top);
        }
    }

}

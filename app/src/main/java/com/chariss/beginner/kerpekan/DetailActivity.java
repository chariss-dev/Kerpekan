package com.chariss.beginner.kerpekan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_JUDUL = "judul";
    public static final String EXTRA_DETAIL = "detail";
    public static final String EXTRA_GAMBAR = "gambar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvJudulReceived = findViewById(R.id.detail_judul);
        tvJudulReceived.setText(getIntent().getStringExtra(EXTRA_JUDUL));

        TextView tvDetailReceived = findViewById(R.id.detail_detail);
        tvDetailReceived.setText(getIntent().getStringExtra(EXTRA_DETAIL));

        ImageView ivGambarReceived = findViewById(R.id.img_item_photo);
        int ivReceived = getIntent().getIntExtra(EXTRA_GAMBAR,0);

        Glide.with(this)
                .load(ivReceived)
                .apply(new RequestOptions()
                        .override(475, 550)
                        .fitCenter())
                .into(ivGambarReceived);
    }
}

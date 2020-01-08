package com.chariss.beginner.kerpekan.materi;

import com.chariss.beginner.kerpekan.R;

import java.util.ArrayList;

public class MateriData {
    private static String[] materiNames = {
            "Apa Itu Android",
            "Apa Itu Java",
            "Android Studio",
            "Run Emulator",
            "Build APK",
            "Activity",
            "Intent",
            "Views dan View Group",
            "Theme dan Style",
            "Recycler View"
    };

    private static String[] materiDetails = {
      "Android adalah sistem operasi yang dikeluarkan oleh Google. Android dibuat khusus untuk smartphone dan tablet.\n\n" +
              " Berbagai macam produsen telah menggunakan Android sebagai sistem operasi untuk peranti (device) yang mereka produksi. Android juga mempunyai store dengan lebih dari 2 miliar pengguna aktif per bulannya, per Januari 2018.",
      "Salah satu Bahasa yang bisa digunakan untuk development Android adalah Java. Selain Java ada beberapa Bahasa lain yang bisa digunakan seperti C/C++, Go, dan Kotlin (per Mei 2017).\n\n" +
              "Pada akademi ini kita hanya akan fokus menggunakan Java sebagai Bahasa pemrograman. Oleh karena itu mari instal dulu software yang harus kita gunakan untuk coding (menuliskan baris code). Siapkan senjata Anda sebelum berperang.",
      "Pada akademi kali ini kita akan menggunakan Android Studio sebagai IDE (Integrated Development Environment). Android Studio dirilis 16 Mei 2013 saat Google IO berlangsung.\n\n" +
              "Android Studio berbasiskan JetBrains Intellij IDEA, dan dikhususkan untuk pengembangan software berplatform Android.",
      "Uji coba aplikasi wajib dilakukan seorang developer. Proses running atau debugging bisa dilakukan dengan dua cara, yaitu running dengan emulator atau peranti (device).\n\n" +
              "Baik emulator maupun peranti memiliki kelebihan dan kekurangan masing-masing. Kita sebagai developer tinggal pilih mana yang sesuai  keperluan.",
      "Salah satu langkah terakhir yang perlu dilakukan setelah mengembangkan aplikasi Android adalah membuat berkas executable dalam format APK (Android Application Package). Berkas ini yang akan didistribusikan oleh Google Play ke pengguna.\n\n" +
              "Jadi, ketika Anda hendak mempublikasikan Aplikasi Anda ke Google Play, berkas inilah yang harus Anda unggah.",
      "Merupakan satu komponen yang berhubungan dengan pengguna. Activity menangani window (tampilan) mana yang akan di tampilkan ke dalam interface (antarmuka).\n\n" +
              "Activity memiliki daur hidup (life cycle) tersendiri yang dimulai dari onCreate hingga onDestroy.",
      "Komunikasi antar komponen di dalam sebuah aplikasi merupakan hal yang sangat sering dilakukan. Inilah peran dari suatu intent.\n\n" +
              "Beberapa fungsi dari intent adalah dapat digunakan untuk menjalankan sebuah activity, mengirimkan pesan ke broadcast receiver, dan dapat juga digunakan untuk berkomunikasi dengan service yang sedang berjalan.",
      "Pada dasarnya semua elemen antar pengguna di aplikasi Android dibangun menggunakan dua buah komponen inti, yaitu view dan viewgroup. Sebuah view adalah obyek yang menggambar komponen tampilan ke layar yang mana pengguna dapat melihat dan berinteraksi langsung.\n\n" +
              "Contoh komponen turunan dari view seperti :\n" +
              "1. TextView, komponen yang berguna untuk menampilkan teks ke layar.\n\n" +
              "2. Button, komponen yang membuat pengguna dapat berinteraksi dengan cara ditekan untuk melakukan sesuatu.\n\n" +
              "3. ImageView, Komponen untuk menampilkan gambar.\n\n" +
              "4. ListView, komponen untuk menampilkan informasi dalam bentuk list.\n\n" +
              "5. GridView, komponen untuk menampilkan informasi dalam bentuk grid.\n\n" +
              "6. RadioButton, komponen yang memungkinkan pengguna dapat memilih satu pilihan dari berbagai pilihan yang disediakan.\n\n" +
              "7. Checkbox, komponen yang memungkinkan pengguna dapat memilih lebih dari satu dari pilihan yang ada.",
      "Prinsip dasar dalam merancang antarmuka aplikasi Android harus mematuhi kaidah yang ditetapkan oleh Design Guideline. Guideline ini dibuat oleh tim Android di Google.\n\n" +
              "Beberapa prinsipnya adalah:\n" +
              "1. Menampilkan informasi yang hanya dibutuhkan.\n\n" +
              "2. Jika aplikasi meminta izin pengguna untuk melakukan sebuah aksi, maka pengembang harus menyediakan mekanisme untuk membatalkan izin tersebut.\n\n" +
              "3. Lakukan interupsi jika diperlukan.\n\n" +
              "4. Menggunakan teks secara singkat. Gunakan gambar untuk menjelaskan informasi secara lebih deskriptif.\n\n" +
              "5. Jaga data pengguna.\n\n" +
              "6. Permudah pengguna untuk melakukan sesuatu yang penting secara cepat.\n\n" +
              "7. Jika terlihat sama, maka perilaku haruslah sama.\n\n" +
              "8. Bantu pengguna untuk membuat keputusan tapi tetap biarkan pengguna menentukan keputusannya.",
      "RecyclerView adalah sebuah komponen tampilan (widget) yang lebih canggih ketimbang pendahulunya listview. Ia bersifat lebih fleksibel.\n\n" +
              "RecyclerView memiliki kemampuan untuk menampilkan data secara efisien dalam jumlah yang besar. Terlebih jika Anda memiliki koleksi data dengan elemen yang mampu berubah-ubah sewaktu dijalankan (runtime)."
    };

    private static int[]    materiImages = {
            R.drawable.materi1,
            R.drawable.materi2,
            R.drawable.materi3,
            R.drawable.materi4,
            R.drawable.materi5,
            R.drawable.materi6,
            R.drawable.materi7,
            R.drawable.materi8,
            R.drawable.materi9,
            R.drawable.materi10
    };

    public static ArrayList<Materi> getListData() {
      ArrayList<Materi> list = new ArrayList<>();
      for (int position =0;position < materiNames.length; position++) {
          Materi materi = new Materi();
          materi.setJudul(materiNames[position]);
          materi.setDetail(materiDetails[position]);
          materi.setPhoto(materiImages[position]);
          list.add(materi);
      }
      return list;
    }
}

# Sistem Informasi Pengelolaan Kebun Hidroponik

## Deskripsi Singkat Program
  Program ini adalah aplikasi berbasis konsol (CLI) yang dibangun menggunakan bahasa pemrograman Java dengan menerapkan konsep Object-Oriented Programming (OOP). Aplikasi ini berfungsi untuk mengelola data kebun hidroponik yang terdiri dari tiga entitas utama, yaitu: Tanaman, Perawatan, dan Pekerja. Pengguna dapat melakukan operasi CRUD (Create, Read, Update, Delete) pada ketiga entitas tersebut, sehingga mempermudah pencatatan dan pengelolaan kebun secara digital.

## Penjelasan Alur Program
  Alur jalannya program ini dirancang agar sederhana dan interaktif bagi pengguna:
* Inisialisasi:
  
  Saat program dijalankan melalui kelas utama (MINPRO.java), program akan membuat objek Scanner untuk input dan objek manajemenKebun sebagai pengelola data (menyimpan ArrayList).

* Menu Utama:

  Program akan menampilkan 13 pilihan menu yang dibagi menjadi 3 kategori utama (Menu Tanaman, Menu Perawatan, Menu Pekerja) beserta opsi untuk keluar.

* Input Pengguna:

  Pengguna diminta memasukkan angka (1-13) sesuai menu yang ingin diakses.

* Eksekusi Perintah (CRUD):

  Berdasarkan angka yang diinput, program akan memanggil metode yang sesuai di dalam kelas manajemenKebun (misalnya: tambahTanaman(), hapusPekerja(), dll).

* Perulangan (Loop):

  Setelah satu operasi selesai dilakukan, program akan terus mengulang dan menampilkan kembali menu utama hingga pengguna memilih opsi nomor 13 (Keluar).

## Penjelasan Letak Penerapan Nilai Tambah

  Berikut adalah beberapa fitur nilai tambah (value-added) yang diterapkan di dalam kode program beserta letaknya:

1. Menerapkan Access Modifier

* Letak:

  Pada seluruh deklarasi atribut dan metode di kelas entitas (Tanaman.java, Perawatan.java, Pekerja.java) serta di kelas pengelola (manajemenKebun.java).

* Penjelasan:

  Atribut disembunyikan dan dibungkus di dalam kelas, sehingga satu-satunya cara untuk melihat atau mengubah isi data tersebut adalah melalui metode yang telah disediakan, yaitu getter (misal: getNamaTanaman()) dan setter (misal: setNamaTanaman()).

2. Encapsulation

* Letak: 

  pada seluruh kelas entitas data (Tanaman.java, Perawatan.java, Pekerja.java).
  
* Penjelasan:

  Atribut disembunyikan dan dibungkus di dalam kelas, sehingga satu-satunya cara untuk melihat atau mengubah isi data tersebut adalah melalui metode yang telah disediakan, yaitu getter (misal: getNamaTanaman()) dan setter (misal: setNamaTanaman())

3. Validasi Input

* Letak:

  ada metode setter di kelas entitas, serta pada metode operasi CRUD di manajemenKebun.java dan main class MINPRO.java.

* Penjelasan:

    * Validasi Kosong:

      Di dalam metode setter, terdapat fungsi kontrol alur (seperti if (namaTanaman.isEmpty())) yang akan menolak input jika pengguna tidak memasukkan teks apa pun.

    * Validasi Tipe Data:

      Menggunakan blok try-catch saat program meminta input berupa angka (seperti ID atau Pilihan Menu). Jika pengguna memasukkan huruf, program tidak akan crash, melainkan akan menangkap error tersebut dan menampilkan pesan peringatan "Error Pilihan harus pakai angka".

    * Validasi Relasi Data:

      Saat menambahkan data "Perawatan", program akan memvalidasi apakah idTanaman yang diinputkan benar-benar ada di dalam daftar menggunakan perulangan (loop).
  

# PROJEK APLIKASI MOBILE "PEMESANAN TIKET & HOTEL"
## NAMA   : AINUN DWI PERMANA
## NIM    : 312310013
## KELAS  : TI 23 A1

### STORY BOARD 
#### Storyboard untuk Aplikasi Pemesanan Tiket & Hotel

1. Menu Utama
   
- Tujuan: Memungkinkan pengguna memilih jenis tiket yang ingin dipesan.
-	Elemen:
-	Judul: "Pemesanan Tiket"
-	Tombol/Item Daftar:
1. Pemesanan Tiket Pesawat
2. Pemesanan Tiket Kapal Laut
3. Pemesanan Tiket Kereta
4. Pemesanan Hotel
-	Navigasi: Klik tombol akan menuju ke Form Pemesanan.
  
2. Form Pemesanan
-	Tujuan: Pengguna mengisi detail untuk memesan tiket.
-	Elemen:
-	Judul: "Form Pemesanan Tiket"
-	Kolom Input:
1. Nama (EditText)
2. Tujuan (EditText)
3. Jumlah Pemesan Tiket (EditText)
4. Kelas (EditText)
5. Tanggal (EditText)
6. Nomor Telepon (EditText)
- Tombol: "Pesan Sekarang"
- Judul: "Form Pemesanan Hotel"
- Kolom Input:
1. Nama (EditText)
2. Nomer KTP
3. Jumlah Pemesan Hotel (EditText)
4. Kelas (EditText)
5. Tanggal (EditText)
6. Nomor Telepon (EditText)
7. Tombol: "Pesan Sekarang"
-	Navigasi:
-	Mengklik "Pesan Sekarang" menyimpan pemesanan dan kembali ke Menu Utama atau menampilkan pesan konfirmasi.
  
3. Layar Konfirmasi
•	Tujuan: Mengonfirmasi bahwa pemesanan tiket berhasil.
•	Elemen:
-	Pesan: "Pemesanan Tiket Berhasil!"
-	Menampilkan detail pemesanan (misalnya, Nama, Tujuan, Tanggal).
-	Tombol: "Kembali ke Menu Utama"
-	Navigasi: Kembali ke Menu Utama.
  
4. Layar Profil
-	Tujuan: Menampilkan riwayat pemesanan pengguna.
-	Elemen:
-	Judul: "Riwayat Pemesanan"
-	RecyclerView/Daftar yang menunjukkan pemesanan sebelumnya.
-	Setiap item menampilkan:
1. Nama pengguna
2. enis tiket (Pesawat/Kapal/Kereta)
3. Tujuan
4. Tanggal
5. History Harga Pesanan
o	Gestur gesek untuk menghapus.
•	Navigasi:
o	Mengklik item dapat menuju ke layar detail (opsional) atau mengizinkan pengeditan.

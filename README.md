#Percobaan 1#
1. Apakah fungsi tanpa parameter selalu bertipe void?
>Jawab: Tidak, fungsi tanpa parameter bisa mengembalikan nilai, misalnya int, double, String. Void digunakan jika fungsi tidak mengembalikan nilai.
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu
tanpa menggunakan fungsi!
>Jawab: Bisa, dengan menulis perintah langsung di main()
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
perintah penampilan menu langsung di dalam fungsi main.
>Jawab:keuntungan menggunakan fungsi menu() adalah jika daftar menu akan ditampilkan di banyak tempat maka cukup memanggil fungsi menu() dan jika terjadi perubahan kode maka cukup mengubah kode program pada fungsi main(), dan program lebih terstruktur
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).
>Jawab: Program dijalankan -> program membaca baris menu(); di dalam main() -> program menuju fungsi menu(); -> semua perintah dalan fungsi menu(); dijalankan -> setelah fungsi selesai, program kembali ke baris setelah menu(); di main() -> program berakhir

#Percobaan 2#
1. Apakah kegunaan parameter di dalam fungsi?
>Jawab: parameter di dalam fungsi digunakan untuk menerima nilai dari luar fungsi, membuat fungsi jadi lebih fleksibel, dan fungsi yang sama dapat bekerja dengan nilai berbeda tanpa perlu menulis ulang kodenya.
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter
namaPelanggan dan isMember?
>Jawab: karena namaPelanggan dibutuhkan agar program dapat menampilkan nama yang sedang menggunakan aplikasi, isMember digunakan untuk mengecek apakah pelanggan adalah member atau bukan sehingga dapat diberi informasi diskon
3. Apakah parameter sama dengan variabel? Jelaskan.
>Jawab: iya, tetapi fungsinya berbeda: Parameter didefinisikan di dalam tanda kurung fungsi sedangkan variabel di dalam isi fungsi, parameter menerima nilai dari luar fungsi sedangkan variabel menyimpan nilai selama fungsi berjalan, dan parameter bersifat input untuk fungsi sedangkan variabel digunakan untuk perhitungan atau proses
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu().Apa
perbedaan output ketika isMember bernilai true dan ketika false?
>Jawab: isMember bertipe boolean sehingga hanya menerima input true & false. Perbedaan input, jika isMember = true maka program akan menampilkan teks diskon untuk member dan jika isMember = false maka program tidak menampilkan teks diskon untuk member
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter
namaPelanggan dan isMember?
>Jawab: muncul error "message": "The method menu(String, boolean) in the type Kafe22 is not applicable for the arguments ()", karena Java mengharuskan pemanggilan fungsi sesuai jumlah dan tipe parameter
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang
berlaku, tampilkan kode invalid.
>Jawab: 
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris
perintah pemanggilan fungsi menu yang benar.
>Jawab: menu("Budi", true, "DISKON30");
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
>Jawab: menurut saya ya, sangat membantu karena penggunaan parameter seperti namaPelanggan dan isMember membuat fungsi menu() lebih mudah dibaca dan dikembangkan karena nilai-nilainya tidak ditulis langsung di dalam fungsi. Parameter membuat fungsi lebih fleksibel, dapat dipakai untuk berbagai data berbeda, serta mempermudah pengelolaan dan penambahan fitur tanpa harus mengubah banyak kode.

#Percobaan 3#
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
>Jawab: Fungsi membutuhkan return value ketika fungsi tersebut harus menghasilkan suatu nilai yang akan dipakai kembali oleh program, contoh dari program Kafe adalah pada line 30: public static int hitungTotalHarga(int pilihanMenu, int banyakItem), fungsi ini mengembalikan nilai total harga, karena nilai tersebut perlu diproses lagi (ditampilkan atau dihitung diskon). Fungsi tidak membutuhkan return value (void) ketika
Fungsi hanya menjalankan aksi, seperti menampilkan teks, tanpa perlu menghasilkan nilai, contoh dari program Kafe adalah pada line 5: public static void menu(String namaPelanggan, boolean isMember, String kodePromo), fungsi ini memakai void karena hanya menampilkan menu dan informasi pelanggan, tidak menghasilkan nilai apa pun untuk dipakai program.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
>Jawab: tipe data nilai kembalian adalah int, berfungsi mengembalikan totalHarga dalam bentuk bilangan bulat. Dua parameter yang digunakan adalah yang pertama int pilihanMenu yang berisi nomor menu yang dipilih pelanggan (1 -6) dan digunakan untuk mengambil harga item dari array hargaItems, yang kedua int banyakItem, berisi jumlah pesanan yang ingin dibeli pelanggan dan digunakan untuk mengalikan harga item dengan jumlah porsi.

#Percobaan 4#
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...namaPengunjung!
>Jawab: Karena varargs (...) memungkinkan method menerima jumlah argumen yang tidak terbatas bahkan tanpa argumen daftarPengunjung(), jadi String... digunakan karena jumlah nama pengunjung tidak tetap dan ditentukan saat pemanggilan fungsi.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
>Jawab: tidak bisa karena Java hanya mengizinkan satu parameter varargs dalam satu method dan harus berada di posisi paling akhir, 
>contoh yang benar -> void contoh(int angka, String... teks) { }
>contoh yang salah -> void contoh(String... nama, int usia)
{ }  // ERROR karena varargs bukan di posisi terakhir, 
>contoh yang salah -> void contoh(String... nama, int... umur) { }   // ERROR karena java hanya mengizinkan satu parameter varargs, Java tidak bisa membedakan batas antara dua varargs karena keduanya dapat menerima jumlah argumen tak terbatas
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?
Jika tetap berjalan, bagaimana output yang dihasilkan?
>Jawab: program tetap berjalan tanpa error, varargs(String...) akan menjadi array kosong dan outputnya akan seperti ini -> Daftar Nama Pengunjung: (tidak ada nama yang tampil karena array kosong)

#Percobaan 5#
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
>Jawab: START dari fungsi main() -> program membuat objek scanner untuk menerima input -> program meminta user menginputkan panjang(p), lebar(l), tinggi(t) -> program memanggil fungsi hitungLuas(p, l) -> fungsi menerima parameter pjg = p dan lb = l -> menghitung Luas = p * l -> return nilai luas ke main() -> fungsi main menampilkan "Luas persegi panjang adalah..." -> program memanggil fungsi hitungVolume(t, p, l) -> fungsi memanggil hitungLuas(a, b) -> nilai luas digunakan untuk menghitung volume = luas*tinggi -> nilai volume dikembalikan ke main() -> fungsi main menampilkan "Volume balok adalah..." -> END
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur
jalannya program sampai output tersebut muncul.
>Jawab: Output yang muncul -> Masukkan Panjang: 4 Masukkan lebar: 3 Masukkan tinggi: 5 Luas persegi panjang adalah 12 Volume balok adalah 60, alur singkatnya adalah program membaca tiga input, memanggil fungsi hitungLuas() untuk menghitung luas, lalu memanggil fungsi hitungVolume() yang memanfaatkan fungsi hitungLuas() untuk menghitung volume. Setelah hasil diterima kembali ke main dan hasil ditampilkan.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program
tersebut!
>Jawab: output -> 1234567, alur jalannya program START -> program menjalankan fungsi main() -> int temp = Jumlah(1, 1); -> memanggil fungsi Jumlah(1, 1) -> menghasilkan nilai 2 -> disimpan ke variabel temp -> Memanggil fungsi TampilJumlah(2, 5) -> dalam fungsi TampilJumlah Hitung Jumlah(2,5) = 7 -> maka program memanggil TampilHinggaKei(7) -> melakukan perulangan j dari 1 hingga 7 -> menampilkan 1234567 -> END
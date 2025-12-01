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
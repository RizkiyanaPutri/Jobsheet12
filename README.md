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
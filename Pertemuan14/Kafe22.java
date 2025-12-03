package Pertemuan14;
import java.util.Scanner;

public class Kafe22 {
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) { 
            System.out.println("Kode promo valid: Diskon 50%!"); } 
        else if (kodePromo.equals("DISKON30")) { 
            System.out.println("Kode promo valid: Diskon 30%!"); } 
        else { 
            System.out.println("Kode promo invalid."); }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

public static int hitungTotalHarga22(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            System.out.println("Menu tidak valid!");
            return 0;
        }

        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            totalHarga -= totalHarga * 0.50;
        } 
        else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            totalHarga -= totalHarga * 0.30;
        } 
        else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("Budi", true, "DISKON50");

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        String kodePromo = "DISKON50";
        int totalHarga = hitungTotalHarga22(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }
}

package Pertemuan14;
import java.util.Scanner;

public class Kafe22 {

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) { 
            System.out.println("Kode promo valid: Diskon 50%!"); 
        } else if (kodePromo.equals("DISKON30")) { 
            System.out.println("Kode promo valid: Diskon 30%!"); 
        } else { 
            System.out.println("Kode promo invalid."); 
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static int hitungTotalHarga22(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int terapkanDiskon(int total, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            return total - (int)(total * 0.50);
        } 
        else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            return total - (int)(total * 0.30);
        }

        System.out.println("Kode promo invalid. Tidak ada diskon.");
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodePromo = "DISKON30";

        menu("Budi", true, kodePromo);

        int totalKeseluruhan = 0;
        char tambah;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin dipesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalPerMenu = hitungTotalHarga22(pilihanMenu, banyakItem);
            totalKeseluruhan += totalPerMenu;

            System.out.println("Subtotal menu ini: Rp " + totalPerMenu);

            System.out.print("Apakah ingin menambah pesanan lain? (y/n): ");
            tambah = sc.next().charAt(0);

        } while (tambah == 'y' || tambah == 'Y');

        System.out.println("\nTotal sebelum diskon: Rp " + totalKeseluruhan);
        int totalAkhir = terapkanDiskon(totalKeseluruhan, kodePromo);

        System.out.println("\nTotal yang harus dibayar: Rp " + totalAkhir);
    }
}

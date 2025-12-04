package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe22 {

    static Scanner input = new Scanner(System.in);

    static String[] menu;   
    static int[][] penjualan; 

    static void inputData() {
        System.out.println("\n=== INPUT DATA PENJUALAN MENU KAFE ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);

            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanData() {
        System.out.println("\n===================== REKAP PENJUALAN =====================");

        System.out.printf("| %-15s |", "Menu");
        for (int h = 1; h <= penjualan[0].length; h++) {
            System.out.printf(" Hari %d |", h);
        }
        System.out.println();
        System.out.println("============================================================");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("| %-15s |", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf(" %-7d |", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    static void cariPenjualanTertinggi() {
        int maxTotal = -1;
        int indexMax = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu           : " + menu[indexMax]);
        System.out.println("Total penjualan: " + maxTotal);
    }

    static void hitungRataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            double rata = (double) total / penjualan[i].length;
            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = input.nextInt();
        input.nextLine();
        
        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n=== INPUT NAMA MENU ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();
        }

        inputData();  
        tampilkanData();
        cariPenjualanTertinggi();
        hitungRataRata();
    }
}

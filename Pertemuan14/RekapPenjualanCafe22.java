package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe22 {

    static Scanner input = new Scanner(System.in);

    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    static void inputData(int[][] data) {
        System.out.println("=== INPUT DATA PENJUALAN MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanData(int[][] data) {
        System.out.println("\n===================== REKAP PENJUALAN =====================");
        System.out.printf("| %-15s |", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf(" Hari %d |", h);
        }
        System.out.println();
        System.out.println("==============================================================");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("| %-15s |", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf(" %-7d |", data[i][j]);
            }
            System.out.println();
        }
        System.out.println("==============================================================");
    }

    static void cariPenjualanTertinggi(int[][] data) {
        int maxTotal = 0;
        int indexMax = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexMax]);
        System.out.println("Total penjualan selama 7 hari: " + maxTotal);
    }

    static void hitungRataRata(int[][] data) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }
            double rata = total / 7.0;
            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {

        int[][] penjualan = new int[5][7]; 

        inputData(penjualan);

        tampilkanData(penjualan);

        cariPenjualanTertinggi(penjualan);

        hitungRataRata(penjualan);
    }
}

package Pertemuan14;

public class Kubus22 {
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;   
    }

    public static void main(String[] args) {
        int sisi = 4;

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Luas dan Volume Kubus");
        System.out.println("Sisi          : " + sisi);
        System.out.println("Volume        : " + volume);
        System.out.println("Luas permukaan: " + luasPermukaan);
    }
}

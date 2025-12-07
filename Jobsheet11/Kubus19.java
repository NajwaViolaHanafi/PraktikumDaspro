package Jobsheet11;

public class Kubus19 {
    static double volumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    static double luasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        double sisi = 5;

        System.out.println("Volume kubus      : " + volumeKubus(sisi));
        System.out.println("Luas permukaan    : " + luasPermukaanKubus(sisi));
    }
}
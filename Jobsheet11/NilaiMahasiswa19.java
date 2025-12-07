package Jobsheet11;
import java.util.Scanner;

public class NilaiMahasiswa19 {
    static void isianArray(double[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextDouble();
        }
    }

    static void tampilArray(double[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (double n : nilai) {
            System.out.println(n);
        }
    }

    static double hitTot(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        double[] nilai = new double[N];

        isianArray(nilai);
        tampilArray(nilai);

        double total = hitTot(nilai);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + total);
    }
}
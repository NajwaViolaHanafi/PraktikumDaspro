package Jobsheet09;
import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
        nilaiMhs[i] = sc.nextInt();

        if (nilaiMhs[i] > 70) {
            totalLulus += nilaiMhs[i];
            jumlahLulus++;
        } else {
            totalTidakLulus += nilaiMhs[i];
            jumlahTidakLulus++;
        }
    }
        double rataLulus = 0, rataTidakLulus = 0;
        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
    }
        if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
    }
    int nilaiTertinggi = nilaiMhs[0];
    int nilaiTerendah = nilaiMhs[0];

    for (int i = 1; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i] > nilaiTertinggi) {
            nilaiTertinggi = nilaiMhs[i];
        }
        if (nilaiMhs[i] < nilaiTerendah) {
            nilaiTerendah = nilaiMhs[i];
        }
    }
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);
    }
}

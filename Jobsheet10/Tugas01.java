package Jobsheet10;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Input nilai responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Rata-rata setiap responden: ");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }
            System.out.println("Responden " + (i + 1) + ": " + (total / jumlahPertanyaan));
        }

        System.out.println("Rata-rata setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + ": " + (total / jumlahResponden));
        }
        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("Rata-rata keseluruhan: " + rataRataKeseluruhan);
    }
}

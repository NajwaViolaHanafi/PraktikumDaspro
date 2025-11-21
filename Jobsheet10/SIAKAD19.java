package Jobsheet10;
import java.util.Scanner;

public class SIAKAD19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahMatkul][jumlahMatkul];

    for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.println("Input nilai mahasiswa ke-" + (i + 1));
        double totalPersiswa = 0;

        for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("Nilai mata kuliah " + (j+1) + ": ");
            nilai[i][j] = sc.nextInt();
            totalPersiswa += nilai[i][j];
        }

        System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": "
                + (totalPersiswa / jumlahMatkul));
    }

    System.out.println("\n=============================");
    System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

    for (int j = 0; j < jumlahMatkul; j++) {
        double totalPerMatkul = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            totalPerMatkul += nilai[i][j];
        }

        System.out.println("Mata Kuliah " + (j +1) + ": " 
                + (totalPerMatkul / jumlahMahasiswa));
        }
    }
}

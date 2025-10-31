package Jobsheet07;

import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0;
        int jumlahTiket;
        double diskon, totalHarga;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
        if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang");
                continue;
            }
        if (jumlahTiket == 0) {
                break;
            }
        if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalHarga = jumlahTiket * hargaTiket * (1 - diskon);
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

        } while (true);

            System.out.println("Total tiket terjual : " + totalTiket);
            System.out.println("Total penjualan     : Rp " + totalPenjualan);
    }
}

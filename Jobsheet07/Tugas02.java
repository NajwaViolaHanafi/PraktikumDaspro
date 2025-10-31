package Jobsheet07;

import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

        if (jenis == 0) {
            break;
        }

        if (jenis != 1 && jenis != 2) {
            System.out.println("Jenis kendaraan tidak valid! Silakan ulangi");
            continue;
        }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

        if (durasi > 5) {
            total += 12500;
    }   else if (jenis == 1) {
            total += durasi * 3000;
    }   else if (jenis == 2) {
            total += durasi * 2000;
    }

            System.out.println("Data parkir berhasil ditambahkan");

    }   while (true);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}

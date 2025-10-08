package Jobsheet05;

import java.util.Scanner;
public class CetakKRS20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variabel UKT Lunas
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = sc.nextBoolean();

       // Ternary operator untuk menentukan pesan
        String pesan = uktLunas ?
            "Pembayaran UKT sudah terverfikasi.\nSilahkan cetak KRS Anda dan minta tanda tangan DPA" :
            "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
}    
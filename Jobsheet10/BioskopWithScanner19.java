package Jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[] [] penonton = new String[4] [2];

    do {
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.println("Pilih menu: ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
            while (true) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                while (true) {
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > penonton.length ||
                    kolom < 1 || kolom > penonton[0].length) {
                        
                        System.out.println("Kursi tidak tersedia, silahkan masukkan kembali. ");
                    continue;
                    }
                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi oleh: "
                        + penonton[baris - 1][kolom - 1]);
                    System.out.println("Silahkan pilih kursi lain.");
                    continue;
                }

                break;
            }
                penonton[baris - 1][kolom - 1] = nama;

                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();

                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
        break;
            case 2:
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {

                    if (penonton[i][j] == null) {
                        System.out.print("***\t");
                    } else {
                    System.out.println(penonton[i][j] + "\t");
                }
            }
            System.out.println();
        }
        break;
            case 3:
            System.out.println("Program selesai.");
            break;

        default:
            System.out.println("Pilihan  tidak valid");
        }
    } while (menu != 3);
    }
}
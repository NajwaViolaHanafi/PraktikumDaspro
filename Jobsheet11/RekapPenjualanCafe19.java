package Jobsheet11;
import java.util.Scanner;

public class RekapPenjualanCafe19 {

    Scanner input = new Scanner(System.in);

    int jumlahMenu;
    int jumlahHari;
    String[] menu;
    int[][] penjualan;

    void setup() {
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = input.nextInt();
        input.nextLine();  

        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = input.nextInt();
        input.nextLine();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\nMasukkan nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i+1) + ": ");
            menu[i] = input.nextLine();
        }
    }
    void inputData() {
        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }
    void tampilkanTabel() {
        System.out.println("\n=== Tabel Rekap Penjualan ===");

        System.out.print("Menu\t\t");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t");

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
    void menuTertinggi() {
        int maxTotal = -1;
        int indexMenu = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        System.out.println("Menu: " + menu[indexMenu]);
        System.out.println("Total Penjualan: " + maxTotal);
    }
    void rataRataMenu() {
        System.out.println("\n=== Rata-rata Penjualan Setiap Menu ===");

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            double rata = (double) total / jumlahHari;
            System.out.println(menu[i] + " : " + rata);
        }
    }
    public static void main(String[] args) {
        RekapPenjualanCafe19 cafe = new RekapPenjualanCafe19();

        cafe.setup();
        cafe.inputData();
        cafe.tampilkanTabel();
        cafe.menuTertinggi();
        cafe.rataRataMenu();
    }
}

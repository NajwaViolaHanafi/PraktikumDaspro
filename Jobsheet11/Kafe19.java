package Jobsheet11;
import java.util.Scanner;

public class Kafe19 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 30% untuk setiap pembelian");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("====== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("5. Teh Tarik - Rp 12,000");
        System.out.println("4. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("0. Selesai");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Budi", true, "-");
       
        int totalKeseluruhan = 0;
        int pilihanMenu;

        while (true) {
            System.out.println("\nMasukkan nomor menu (0 untuk selesai): ");
            pilihanMenu = sc.nextInt();

        if (pilihanMenu == 0) {
            break;
        }
        System.out.print("Masukkan jumlah item: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Subtotal menu ini: Rp" + totalHarga);
        totalKeseluruhan += totalHarga;
    }
    System.out.println("Total keseluruhan pesanan: Rp" + totalKeseluruhan);
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
       int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

    if (kodePromo.equals("DISKON50")) {
        System.out.println("Diskon 50% diterapkan!");
        totalHarga *= 0.5;
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Diskon 30% diterapkan!");
        totalHarga *= 0.7;
    } else {
        System.out.println("Kode promo invalid. Tidak ada diskon.");
    }

    return totalHarga;
}
    }

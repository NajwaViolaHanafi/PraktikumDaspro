package Jobsheet09;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daftarMenu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
    };
        double[] daftarHarga = {
            20000, 22000, 15000, 17000, 13000, 18000, 20000
    };
        int[] daftarPesanan = new int[daftarMenu.length];

    while (true) {
        System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        if (jumlahPesanan == 0) {
            System.out.println("Terima kasih telah memesan di kafe kami!");
            break;
        }
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan menu " + (i + 1) + ": ");
            String namaMenu = sc.nextLine();
            int indeksMenu = -1;
        for (int j = 0; j < daftarMenu.length; j++) {
            if (daftarMenu[j].equalsIgnoreCase(namaMenu)) {
                indeksMenu = j;
                break;
            }
        }
            if (indeksMenu != -1) {
                System.out.print("Masukkan jumlah: ");
                int jumlahItem = sc.nextInt();
                sc.nextLine(); 
                daftarPesanan[indeksMenu] += jumlahItem;
            } else {
                System.out.println("Maaf, menu \"" + namaMenu + "\" tidak tersedia.");
            }
        }
            double total = 0;
            for (int i = 0; i < daftarMenu.length; i++) {
                total += daftarPesanan[i] * daftarHarga[i];
            }
            System.out.println("Total: " + (int) total);
            System.out.println();
        }
    }
}

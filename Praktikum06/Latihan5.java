import java.util.Scanner;
public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaTetap = 50000;
        int tarifListrik = 0; // sesuaikan dengan daya nya
        double ppn = 0.10;
        int daya, pemakaian, totalBiayaListrik, biayaPelanggan;
        double totalBiaya;

    
        System.out.print("Masukkan daya listrik pelanggan (VA): ");
        daya = sc.nextInt();

        if (daya == 900) {
            tarifListrik = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tarifListrik = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tarifListrik = 1700;
        } else {
            System.out.println("Daya tidak dikenali! Gunakan 900, 1300, 2200, 3500, atau 5500 VA.");
            return; 
        }

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        pemakaian = sc.nextInt();

        totalBiayaListrik = tarifListrik * pemakaian;
        biayaPelanggan = totalBiayaListrik + biayaTetap;
        totalBiaya = biayaPelanggan + (biayaPelanggan * ppn);

        System.out.println("\n=== RINCIAN BIAYA LISTRIK ===");
        System.out.println("Tarif per kWh       : Rp" + tarifListrik);
        System.out.println("Biaya listrik       : Rp" + totalBiayaListrik);
        System.out.println("Biaya tetap         : Rp" + biayaTetap);
        System.out.println("PPN (10%)           : Rp" + (biayaPelanggan * ppn));
        System.out.println("Total biaya         : Rp" + totalBiaya);
    }
}

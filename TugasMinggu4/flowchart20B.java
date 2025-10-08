import java.util.Scanner;
public class flowchart20B {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int biayaTetap = 50000;
        int tarifListrik = 1500; // per kWh
        double ppn = 0.10;
        int dayaListrik, totalBiayaListrik, biayaPelanggan;
        double totalBiaya;

        System.out.print("Masukkan daya listrik (kWh): ");
        dayaListrik = sc.nextInt();

        totalBiayaListrik = tarifListrik * dayaListrik;
        biayaPelanggan = totalBiayaListrik + biayaTetap;
        totalBiaya = biayaPelanggan + (biayaPelanggan * ppn);

        System.out.println("total biaya : Rp" + totalBiaya);


    }
}

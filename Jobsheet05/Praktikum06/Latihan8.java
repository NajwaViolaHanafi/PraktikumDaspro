import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int biayaPerHalaman = 200;
        double beratPerHalaman = 1.5; 
        double totalBeratGram,totalBeratKg, biayaKirim, totalBiaya;
        int beratKemasan = 300;
        int biayaKirimPerKg = 15000;
        int biayaCover, beratCover, halaman,biayaCetak;

        System.out.print("Masukkan jumlah halaman: ");
        halaman = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan jenis cover (hard/soft): ");
        String jenisCover = sc.nextLine().toLowerCase();

        if (jenisCover.equals("hard")) {
            biayaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            biayaCover = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak valid!");
            return;
        }

      
        biayaCetak = halaman * biayaPerHalaman;
        totalBeratGram = (halaman * beratPerHalaman) + beratCover + beratKemasan;
        totalBeratKg = (totalBeratGram / 1000.0);
        biayaKirim = totalBeratKg * biayaKirimPerKg;
        totalBiaya = biayaCetak + biayaCover + biayaKirim;

        System.out.println("Jumlah halaman      : " + halaman);
        System.out.println("Jenis cover         : " + jenisCover);
        System.out.println("Biaya cetak         : Rp " + biayaCetak);
        System.out.println("Biaya cover         : Rp " + biayaCover);
        System.out.println("Total berat paket   : " + totalBeratKg + " kg");
        System.out.println("Biaya kirim         : Rp " + biayaKirim);
        

        System.out.println("TOTAL BIAYA         : Rp " + totalBiaya);
    }
}

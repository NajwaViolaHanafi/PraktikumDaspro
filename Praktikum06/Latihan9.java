<<<<<<< HEAD
import java.util.Scanner;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPerHalaman = 200;
        double beratPerHalaman = 1.5; 
        double totalBeratGram, totalBeratKg, biayaKirim, totalBiaya;
        int beratKemasan = 300;
        int biayaKirimPerKg = 15000;
        int biayaKurirLokal = 20000; //untuk malang
        int biayaCover, beratCover, halaman, biayaCetak;

        System.out.print("Masukkan jumlah halaman: ");
        halaman = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan jenis cover (hard/soft): ");
        String jenisCover = sc.nextLine().toLowerCase();
        System.out.print("Masukkan kota tujuan: ");
        String kota = sc.nextLine().toLowerCase();

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

        if (kota.equals("malang") || kota.equals("batu")) {
            biayaKirim = biayaKurirLokal;
        } else {
            biayaKirim = totalBeratKg * biayaKirimPerKg;
        }
        totalBiaya = biayaCetak + biayaCover + biayaKirim;

        System.out.println("Jumlah halaman      : " + halaman);
        System.out.println("Jenis cover         : " + jenisCover);
        System.out.println("Kota tujuan         : " + kota);
        System.out.println("Biaya cetak         : Rp " + biayaCetak);
        System.out.println("Biaya cover         : Rp " + biayaCover);
        System.out.println("Total berat paket   : " + totalBeratKg + " kg");
        System.out.println("Biaya pengiriman    : Rp " + biayaKirim);
        System.out.println("TOTAL BIAYA         : Rp " + totalBiaya);
    }
}
=======
import java.util.Scanner;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPerHalaman = 200;
        double beratPerHalaman = 1.5; 
        double totalBeratGram, totalBeratKg, biayaKirim, totalBiaya;
        int beratKemasan = 300;
        int biayaKirimPerKg = 15000;
        int biayaKurirLokal = 20000; //untuk malang
        int biayaCover, beratCover, halaman, biayaCetak;

        System.out.print("Masukkan jumlah halaman: ");
        halaman = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan jenis cover (hard/soft): ");
        String jenisCover = sc.nextLine().toLowerCase();
        System.out.print("Masukkan kota tujuan: ");
        String kota = sc.nextLine().toLowerCase();

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

        if (kota.equals("malang") || kota.equals("batu")) {
            biayaKirim = biayaKurirLokal;
        } else {
            biayaKirim = totalBeratKg * biayaKirimPerKg;
        }
        totalBiaya = biayaCetak + biayaCover + biayaKirim;

        System.out.println("Jumlah halaman      : " + halaman);
        System.out.println("Jenis cover         : " + jenisCover);
        System.out.println("Kota tujuan         : " + kota);
        System.out.println("Biaya cetak         : Rp " + biayaCetak);
        System.out.println("Biaya cover         : Rp " + biayaCover);
        System.out.println("Total berat paket   : " + totalBeratKg + " kg");
        System.out.println("Biaya pengiriman    : Rp " + biayaKirim);
        System.out.println("TOTAL BIAYA         : Rp " + totalBiaya);
    }
}
>>>>>>> 4225b789d9df135cde1bb822b125604d9fd1b785

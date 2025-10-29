<<<<<<< HEAD
import java.util.Scanner;
public class Latihan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int biayaPublikasi = 300000;
    int Dekorasi = 500000;
    int konsumsiPanitia = 500000;
    int Hadiah = 4000000;
    int biayaOperasional = 500000;
    int konsumsiPeserta;
    int Honorarium;
    int tiapPeserta = 3;
    int biayaPendaftaran = 50000;
    int totalAnggaran;
    int totalAnggaranSemua;
    int jumlahTimIkut = 0;
    int jumlahPeserta;
    double persenDanaBantuan;
    double danaPolinema = 0.6;
    double danaDariSponsorship;

    jumlahPeserta = jumlahTimIkut * 3;
        konsumsiPeserta = jumlahPeserta * 25000;
        Honorarium = jumlahTimIkut * 75000;
        totalAnggaran = biayaPublikasi + Dekorasi + konsumsiPanitia + Hadiah + biayaOperasional + konsumsiPeserta;
        totalAnggaranSemua = totalAnggaran + Honorarium;

        System.out.print("Apakah Polinema memberi dana bantuan? (ya/tidak): ");
        String jawaban = sc.next();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan persentase dana bantuan (misal 60 tanpa persen ): ");
            persenDanaBantuan = sc.nextDouble();
            danaPolinema = totalAnggaranSemua * (persenDanaBantuan / 100);
        } else {
            danaPolinema = 0;
        }

        biayaPendaftaran = jumlahTimIkut * 50000;
        danaDariSponsorship = totalAnggaranSemua - danaPolinema - biayaPendaftaran;

         System.out.println("Total anggaran           : Rp " + totalAnggaranSemua);
         System.out.println("Dana dari Polinema (60%) : Rp " + danaPolinema);
         System.out.println("Dana dari Sponsorship    : Rp " + danaDariSponsorship);


    }
=======
import java.util.Scanner;
public class Latihan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int biayaPublikasi = 300000;
    int Dekorasi = 500000;
    int konsumsiPanitia = 500000;
    int Hadiah = 4000000;
    int biayaOperasional = 500000;
    int konsumsiPeserta;
    int Honorarium;
    int tiapPeserta = 3;
    int biayaPendaftaran = 50000;
    int totalAnggaran;
    int totalAnggaranSemua;
    int jumlahTimIkut = 0;
    int jumlahPeserta;
    double persenDanaBantuan;
    double danaPolinema = 0.6;
    double danaDariSponsorship;

    jumlahPeserta = jumlahTimIkut * 3;
        konsumsiPeserta = jumlahPeserta * 25000;
        Honorarium = jumlahTimIkut * 75000;
        totalAnggaran = biayaPublikasi + Dekorasi + konsumsiPanitia + Hadiah + biayaOperasional + konsumsiPeserta;
        totalAnggaranSemua = totalAnggaran + Honorarium;

        System.out.print("Apakah Polinema memberi dana bantuan? (ya/tidak): ");
        String jawaban = sc.next();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan persentase dana bantuan (misal 60 tanpa persen ): ");
            persenDanaBantuan = sc.nextDouble();
            danaPolinema = totalAnggaranSemua * (persenDanaBantuan / 100);
        } else {
            danaPolinema = 0;
        }

        biayaPendaftaran = jumlahTimIkut * 50000;
        danaDariSponsorship = totalAnggaranSemua - danaPolinema - biayaPendaftaran;

         System.out.println("Total anggaran           : Rp " + totalAnggaranSemua);
         System.out.println("Dana dari Polinema (60%) : Rp " + danaPolinema);
         System.out.println("Dana dari Sponsorship    : Rp " + danaDariSponsorship);


    }
>>>>>>> 4225b789d9df135cde1bb822b125604d9fd1b785
}
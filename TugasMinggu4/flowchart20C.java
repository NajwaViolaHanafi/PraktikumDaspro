import java.util.Scanner;
public class flowchart20C {
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
    int jumlahTimIkut;
    int jumlahPeserta;
    double danaPolinema = 0.6;
    double danaDariSponsorship;

    System.out.print("Masukkan jumlah tim yang ikut: ");
    jumlahTimIkut= sc.nextInt();
    jumlahPeserta = jumlahTimIkut * 3;
    konsumsiPeserta = jumlahPeserta * 25000;
    Honorarium = jumlahTimIkut * 75000;
    totalAnggaran = biayaPublikasi + Dekorasi + konsumsiPanitia + Hadiah + biayaOperasional + konsumsiPeserta;
    totalAnggaranSemua = totalAnggaran +  Honorarium;
    danaPolinema = 0.6 * totalAnggaranSemua;
    biayaPendaftaran = jumlahTimIkut * 50000;
    danaDariSponsorship = totalAnggaranSemua - danaPolinema - biayaPendaftaran;


    System.out.println("Total anggaran           : Rp " + totalAnggaranSemua);
    System.out.println("Dana dari Polinema (60%) : Rp " + danaPolinema);
    System.out.println("Dana dari Sponsorship    : Rp " + danaDariSponsorship);



    }
}
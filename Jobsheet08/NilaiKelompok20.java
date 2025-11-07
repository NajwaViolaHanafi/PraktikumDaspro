import java.util.Scanner;

public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalNilai, rataNilai, nilai;
        double rataNilaiTertinggi = 0; 
        int kelompokTertinggi = 0;     

    for (int i = 1; i <= 6; i++) {
        totalNilai = 0; 
        System.out.println("Kelompok " + i);

    for (int j = 1; j <= 5; j++) {
        System.out.print("Masukkan nilai dari penilai ke-" + j + ": ");
        nilai = sc.nextDouble();
        totalNilai += nilai;
    }
        rataNilai = totalNilai / 5;
        System.out.println("Rata-rata nilai kelompok " + i + " = " + rataNilai);
        
    if (rataNilai > rataNilaiTertinggi) {
        rataNilaiTertinggi = rataNilai;
        kelompokTertinggi = i;
        }
    }
        System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok "
                + kelompokTertinggi + " dengan nilai rata-rata " + rataNilaiTertinggi);
    }
}

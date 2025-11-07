import java.util.Scanner;

public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j; 
        double totalNilai, rataNilai, nilai;
        double rataNilaiTertinggi = 0;       
        int kelompokTertinggi = 0; 

        i = 1;
        while (i <= 6) { 
            totalNilai = 0; 
            System.out.println("\nKelompok " + i);
        for (j = 1; j <= 5; j++) {
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
            i++;
        }
            System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok "
                + kelompokTertinggi + " dengan nilai rata-rata " + rataNilaiTertinggi);
    }
}

import java.util.Scanner;

public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        double totalNilai, rataNilai, nilai;

    for (j=1;j<=5;j++) {
        totalNilai = 0;

    for (j = 1; j<= 5; j++) {
        System.out.println("Masukkan nilai ke-" + j + ": ");
        nilai = sc.nextDouble();
        totalNilai += nilai;
        rataNilai=totalNilai/5;

        i = 1;

    while (i <= 6) {
        System.out.println("Kelompok " + i);
        totalNilai = 0;

        for (j = 1; j <= 5; j++) {
            System.out.print("Masukkan nilai ke-" + j + ": ");
            nilai = sc.nextDouble();
            totalNilai += nilai;
        }
        rataNilai = totalNilai/5;
        System.out.println("Rata-rata: " + rataNilai);
        i++;
    }
    }
    }
    }
}
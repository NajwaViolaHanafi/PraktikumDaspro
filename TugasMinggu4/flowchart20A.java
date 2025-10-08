import java.util.Scanner;
public class flowchart20A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh, biayaTotal;

        System.out.print("Masukkan lama sewa: ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan jarak tempuh: ");
        jarakTempuh = sc.nextInt();
        System.out.print("Masukkan biaya supir: ");
        biayaSupir = sc.nextInt();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        bahanBakar = 1000 * jarakTempuh;
        biayaTotal = biayaSewa + biayaSupir + bahanBakar;

        System.out.println("totalBiaya: Rp " + biayaTotal);

    }
}          
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh;
        double ppn = 0.05, biayaTotal;

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

         //kalau total biaya lebih dari 2000000 berikan diskon 5%
        if (biayaTotal > 2000000);
            double diskon = 0.05 * biayaTotal;
            biayaTotal = biayaTotal - diskon;
        
            biayaTotal = biayaTotal + (biayaTotal * ppn);
        System.out.println("totalBiaya: Rp " + biayaTotal);

    }
}          
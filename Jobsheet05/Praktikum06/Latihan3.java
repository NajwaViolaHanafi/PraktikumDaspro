import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh, biayaTotal;

        System.out.print("Masukkan lama sewa: ");
        lamaSewa = sc.nextInt();
        if (lamaSewa > 30)  {
            System.out.println("lama sewa maksimal 30 hari");
        } else {
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
}          
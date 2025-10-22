import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int biayaSewa, biayaSupir, lamaSewa, jarakTempuh, biayaTotal, bahanBakar;
        String jenisBahanBakar;

        System.out.print("Masukkan lama sewa: ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan jarak tempuh: ");
        jarakTempuh = sc.nextInt();
        System.out.print("Masukkan jenis bahan bakar (pertalite/pertamax): ");
        jenisBahanBakar = sc.next();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        
        if (jenisBahanBakar.equals("pertalite")) {
            bahanBakar = 1000 * jarakTempuh;
        } else if (jenisBahanBakar.equals("pertamax")) {
            bahanBakar = 1300 * jarakTempuh;
        } else {
            System.out.println("Jenis bahan bakar tidak valid! Gunakan pertalite atau pertamax.");
            return;
        }

        biayaTotal = biayaSewa + biayaSupir + bahanBakar;
        System.out.println("\n=== RINCIAN BIAYA ===");
        System.out.println("Biaya sewa mobil : Rp " + biayaSewa);
        System.out.println("Biaya supir      : Rp " + biayaSupir);
        System.out.println("Biaya bahan bakar: Rp " + bahanBakar);
        System.out.println("totalBiaya: Rp " + biayaTotal);

    }
}          
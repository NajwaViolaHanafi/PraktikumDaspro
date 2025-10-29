import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh;
        double biayaTotal, diskon = 0, ppn = 0.05;
        String jenisBahanBakar;

        System.out.print("Masukkan lama sewa: ");
        lamaSewa = sc.nextInt();

        // batasan lama sewanya
        if (lamaSewa > 30) {
            System.out.println("Lama sewa maksimal 30 hari.");
            return;
        }

        System.out.print("Masukkan jarak tempuh: ");
        jarakTempuh = sc.nextInt();

        System.out.print("Masukkan jenis bahan bakar (pertalite/pertamax): ");
        jenisBahanBakar = sc.next();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;

        if (jenisBahanBakar.equalsIgnoreCase("pertalite")) {
            bahanBakar = 1000 * jarakTempuh;
        } else if (jenisBahanBakar.equalsIgnoreCase("pertamax")) {
            bahanBakar = 1300 * jarakTempuh;
        } else {
            System.out.println("Jenis bahan bakar tidak valid! Gunakan pertalite atau pertamax.");
            return;
        }

        biayaTotal = biayaSewa + biayaSupir + bahanBakar;

        // jika total biaya lebih dari 2000000 berikan diskon 5%
        if (biayaTotal > 2000000) {
            diskon = 0.05 * biayaTotal;
            biayaTotal -= diskon;
        }

        biayaTotal += biayaTotal * ppn;

        System.out.println("\n=== RINCIAN BIAYA SEWA MOBIL ===");
        System.out.println("Lama sewa        : " + lamaSewa + " hari");
        System.out.println("Jarak tempuh     : " + jarakTempuh + " km");
        System.out.println("Jenis bahan bakar: " + jenisBahanBakar);
        System.out.println("Biaya sewa mobil : Rp " + biayaSewa);
        System.out.println("Biaya supir      : Rp " + biayaSupir);
        System.out.println("Biaya bahan bakar: Rp " + bahanBakar);
        if (diskon > 0) {
            System.out.println("Diskon 5%        : -Rp " + diskon);
        }
        System.out.println("PPN 5%           : +Rp " + (biayaTotal * 0.05));
        System.out.println("Total Biaya      : Rp " + biayaTotal);
    }
}

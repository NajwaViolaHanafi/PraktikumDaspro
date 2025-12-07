package Jobsheet11;

public class PengunjungKafe19 {
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    
    System.out.println();
}
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Galih");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

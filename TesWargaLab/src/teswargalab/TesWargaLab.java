package teswargalab;
import java.util.Scanner;
/**
 *
 * @author Muhammad Yusri
 */
public class TesWargaLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        
        System.out.println("SEWA KAMAR");
        System.out.println("============================");
        
        
        System.out.println("Pilih tipr kamar yang anda inginkan");
        System.out.println("1. Reguler (kapasitas : 1 orang)");
        System.out.println("Harga : Rp. 100.000");
        
        System.out.println("2. double reguler (kapasitas : 2 orang)");
        System.out.println("Harga : Rp. 200.000");
        
        System.out.println("3. Premium (kapasitas : 2 orang)");
        System.out.println("Harga : Rp. 250.000");
        
        System.out.println("4. Deluxe (kapasitas : 2 orang)");
        System.out.println("Harga : Rp. 500.000");System.out.println("============================");
        
        System.out.println("SEWA KAMAR");
        System.out.println("============================");
        
        
        System.out.println("Pilih tipr kamar yang anda inginkan");
        System.out.println("1. Reguler (kapasitas : 1 orang)");
        System.out.println("Harga : Rp. 100.000");
        
        System.out.println("2. double reguler (kapasitas : 2 orang)");
        System.out.println("Harga : Rp. 200.000");
        
        System.out.println("3. Premium (kapasitas : 2 orang)");
        System.out.println("Harga : Rp. 250.000");
        
        System.out.println("4. Deluxe (kapasitas : 2 orang)");
        System.out.println("Harga : Rp. 500.000");

        // Inisialisasi tipe kamar dan harga
        Kamar reguler = new Kamar("Reguler", 100000);
        Kamar doubleReguler = new Kamar("Double Reguler", 200000);
        // ... inisialisasi kamar lainnya

        System.out.print("Masukkan nama penyewa: ");
        String namaPenyewa = scanner.nextLine();

        System.out.print("Masukkan lama sewa (hari): ");
        int lamaSewa = scanner.nextInt();

        System.out.print("Apakah memiliki kartu member? (true/false): ");
        boolean kartuMember = scanner.nextBoolean();

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        // Hitung total harga
        double totalHarga = reguler.hitungTotalHarga(lamaSewa, kartuMember, usia);
        System.out.println("Total harga: Rp. " + totalHarga);
    }
}

import java.util.Scanner;

/**
 * Program utama yang menjalankan Kalkulator Keuangan.
 * Pengguna dapat menambahkan pemasukan, pengeluaran, menampilkan saldo,dan melihat riwayat transaksi.
 *
 */
public class Main {
    /**
     * Metode utama yang menjalankan program.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        KalkulatorKeuangan kalkulator = new KalkulatorKeuangan();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Kalkulator Keuangan ===");
            System.out.println("1. Pemasukan");
            System.out.println("2. Pengeluaran");
            System.out.println("3. Tampilkan Saldo Saya");
            System.out.println("4. Tampilkan Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah pemasukan: Rp");
                    double pemasukan = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Keterangan: ");
                    String ketPemasukan = scanner.nextLine();
                    kalkulator.tambahPemasukan(pemasukan, ketPemasukan);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah pengeluaran: Rp");
                    double pengeluaran = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Keterangan: ");
                    String ketPengeluaran = scanner.nextLine();
                    kalkulator.tambahPengeluaran(pengeluaran, ketPengeluaran);
                    break;
                case 3:
                    kalkulator.tampilkanSaldo();
                    break;
                case 4:
                    kalkulator.tampilkanRiwayat();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator keuangan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
import java.util.ArrayList;

/**
 * Kelas KalkulatorKeuangan digunakan untuk mengelola pemasukan, pengeluaran, saldo,
 * dan riwayat transaksi keuangan.
 */
public class KalkulatorKeuangan {
    private double saldo;
    private ArrayList<Transaksi> riwayat;

    /**
     * Konstruktor untuk membuat objek KalkulatorKeuangan dengan saldo awal 0
     * dan riwayat transaksi kosong.
     */
    public KalkulatorKeuangan() {
        this.saldo = 0;
        this.riwayat = new ArrayList<>();
    }

    /**
     * Menambahkan pemasukan ke saldo dan menyimpan transaksi pemasukan ke dalam riwayat.
     *
     * @param jumlah     jumlah uang yang akan ditambahkan sebagai pemasukan
     * @param keterangan keterangan atau deskripsi pemasukan
     */
    public void tambahPemasukan(double jumlah, String keterangan) {
        saldo += jumlah;
        riwayat.add(new Transaksi("Pemasukan", jumlah, keterangan));
        System.out.println("Pemasukan berhasil ditambahkan!");
    }

    /**
     * Menambahkan pengeluaran dari saldo jika saldo mencukupi dan menyimpan transaksi
     * pengeluaran ke dalam riwayat. Jika saldo tidak mencukupi, tampilkan pesan.
     *
     * @param jumlah     jumlah uang yang akan dikurangi sebagai pengeluaran
     * @param keterangan keterangan atau deskripsi pengeluaran
     */
    public void tambahPengeluaran(double jumlah, String keterangan) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk melakukan pengeluaran ini!");
        } else {
            saldo -= jumlah;
            riwayat.add(new Transaksi("Pengeluaran", jumlah, keterangan));
            System.out.println("Pengeluaran berhasil ditambahkan!");
        }
    }

    /**
     * Menampilkan saldo saat ini.
     */
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: Rp" + saldo);
    }

    /**
     * Menampilkan riwayat transaksi. Jika tidak ada transaksi, tampilkan pesan.
     */
    public void tampilkanRiwayat() {
        if (riwayat.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            System.out.println("Riwayat Transaksi:");
            for (Transaksi t : riwayat) {
                System.out.println(t);
            }
        }
    }
}
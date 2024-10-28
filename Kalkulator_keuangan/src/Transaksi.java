/**
 * Kelas yang merepresentasikan transaksi keuangan.
 * Setiap transaksi memiliki tipe (pemasukan atau pengeluaran), jumlah, dan keterangan.
 */
public class Transaksi {
    private String tipe;
    private double jumlah;
    private String keterangan;

    /**
     * Konstruktor untuk membuat objek Transaksi baru.
     *
     * @param tipe       tipe transaksi, bisa berupa "Pemasukan" atau "Pengeluaran"
     * @param jumlah     jumlah uang pada transaksi
     * @param keterangan keterangan atau deskripsi transaksi
     */
    public Transaksi(String tipe, double jumlah, String keterangan) {
        this.tipe = tipe;
        this.jumlah = jumlah;
        this.keterangan = keterangan;
    }

    /**
     * Mengembalikan tipe transaksi.
     *
     * @return tipe transaksi
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * Mengembalikan jumlah uang pada transaksi.
     *
     * @return jumlah uang
     */
    public double getJumlah() {
        return jumlah;
    }

    /**
     * Mengembalikan keterangan atau deskripsi transaksi.
     *
     * @return keterangan transaksi
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * Mengembalikan representasi string dari transaksi.
     *
     * @return string yang merepresentasikan transaksi dalam format "tipe: Rp[jumlah] - keterangan"
     */
    @Override
    public String toString() {
        return tipe + ": Rp" + jumlah + " - " + keterangan;
    }
}
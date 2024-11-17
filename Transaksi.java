// Kelas anak yang mewarisi dari kelas Barang
public class Transaksi extends Barang {
    String noFaktur;
    int jumlahBeli;
    double total;

    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil konstruktor kelas induk
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        this.total = jumlahBeli * hargaBarang;
    }

    // Method untuk menampilkan detail transaksi
    public void tampilkanTransaksi() {
        System.out.println("No Faktur: " + noFaktur);
        super.tampilkanBarang(); // Memanggil method dari kelas induk
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: " + total);
    }
}

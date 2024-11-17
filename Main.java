import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input data
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();
            if (hargaBarang <= 0) {
                throw new IllegalArgumentException("Harga barang harus lebih dari 0.");
            }

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0.");
            }

            // Membuat objek Transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan hasil
            System.out.println("\n===== Detail Transaksi =====");
            transaksi.tampilkanTransaksi();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Menangkap exception dan menampilkan pesan
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

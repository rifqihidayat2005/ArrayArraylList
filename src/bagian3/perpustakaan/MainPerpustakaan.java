package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        // Membuat objek perpustakaan
        Perpustakaan perpus = new Perpustakaan();

        // Menambahkan buku
        perpus.tambahBuku(
                new Buku(
                        "Laskar Pelangi",
                        "Andrea Hirata",
                        2005));

        perpus.tambahBuku(
                new Buku(
                        "Bumi Manusia",
                        "Pramoedya",
                        1980));

        perpus.tambahBuku(
                new Buku(
                        "Negeri 5 Menara",
                        "Ahmad Fuadi",
                        2009));

        // Menampilkan koleksi awal
        perpus.tampilkanKoleksi();

        System.out.println();

        // Meminjam buku
        perpus.pinjamBuku("Bumi Manusia");

        // Mencoba meminjam lagi
        perpus.pinjamBuku("Bumi Manusia");

        System.out.println();

        // Mengembalikan buku
        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println();

        // Mencari buku berdasarkan penulis
        perpus.cariPenulis("Pramoedya");

        System.out.println();

        // Menampilkan koleksi akhir
        perpus.tampilkanKoleksi();

        System.out.println();
        System.out.println(
                "Buku tersedia: "
                + perpus.jumlahTersedia());
    }
}
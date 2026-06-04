package tugas;

/*
Nama : Muhammad Rifqi Hidayat
NPM  : 2410010611
*/

public class MainTugas {

    public static void main(String[] args) {

        // Array Mata Kuliah
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Basis Data",
            "Kecerdasan Buatan"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");

        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Membuat objek kelas
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa(
                        "Andi",
                        "231001",
                        80));

        kelas.tambahMahasiswa(
                new Mahasiswa(
                        "Budi",
                        "231002",
                        55));

        kelas.tambahMahasiswa(
                new Mahasiswa(
                        "Citra",
                        "231003",
                        90));

        kelas.tambahMahasiswa(
                new Mahasiswa(
                        "Dina",
                        "231004",
                        70));

        kelas.tambahMahasiswa(
                new Mahasiswa(
                        "Eko",
                        "231005",
                        45));

        // Menampilkan data mahasiswa
        kelas.tampilkanSemua();

        // Menampilkan rata-rata
        System.out.println(
                "Rata-rata Nilai : "
                + kelas.hitungRataRata());

        // Menampilkan jumlah lulus
        System.out.println(
                "Jumlah Mahasiswa Lulus : "
                + kelas.jumlahLulus());

        System.out.println();

        // Menambahkan mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa(
                        "Fajar",
                        "231006",
                        85));

        System.out.println(
                "Mahasiswa baru berhasil ditambahkan.");

        System.out.println(
                "Jumlah Mahasiswa Terbaru : "
                + kelas.jumlahMahasiswa());
    }
}
package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa =
            new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tampilkanSemua() {

        System.out.println("=== DATA MAHASISWA ===");

        for (Mahasiswa m : daftarMahasiswa) {

            String status;

            if (m.lulus()) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }

            System.out.println(
                    "Nama  : " + m.getNama());
            System.out.println(
                    "NPM   : " + m.getNpm());
            System.out.println(
                    "Nilai : " + m.getNilai());
            System.out.println(
                    "Status: " + status);
            System.out.println();
        }
    }

    public double hitungRataRata() {

        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {

        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {

            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
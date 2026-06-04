package bagian3.perpustakaan;

public class Buku {

    // Atribut
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Setter status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Informasi buku
    public String info() {

        String status;

        if (dipinjam) {
            status = "Dipinjam";
        } else {
            status = "Tersedia";
        }

        return judul + " oleh "
                + penulis
                + " (" + tahunTerbit + ") "
                + "[" + status + "]";
    }
}
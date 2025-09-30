package model;

// Abstract 1
public abstract class Pelanggan {
    private String nama;
    private int durasi;
    private int nomorPC;
    private int totalHarga; // disimpan setelah dihitung

    public Pelanggan(String nama, int durasi, int nomorPC) {
        this.nama = nama;
        this.durasi = durasi;
        this.nomorPC = nomorPC;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getDurasi() {
        return durasi;
    }

    public int getNomorPC() {
        return nomorPC;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setNomorPC(int nomorPC) {
        this.nomorPC = nomorPC;
    }

    protected void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    // Abstract 2
    public abstract int hitungTotal();

    // Default
    public String tampilData() {
        return "Nama: " + nama +
               ", Durasi: " + durasi + " jam, PC: " + nomorPC +
               ", Total: Rp" + totalHarga;
    }
}

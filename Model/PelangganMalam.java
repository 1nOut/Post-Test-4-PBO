package model;

public class PelangganMalam extends Pelanggan implements Bonus {
    private int bonusJam = 1; // default bonus 1 jam

    public PelangganMalam(String nama, int durasi, int nomorPC) {
        super(nama, durasi, nomorPC);
        setTotalHarga(hitungTotal()); // simpan total harga setelah dihitung
    }

    @Override
    public int getBonusJam() {
        return bonusJam;
    }

    @Override
    public void setBonusJam(int bonusJam) {
        this.bonusJam = bonusJam;
        setTotalHarga(hitungTotal()); // update total harga kalau bonus berubah
    }

    @Override
    public int hitungTotal() {
        int tarif = 6000;
        // bonus hanya menambah waktu main, tidak menambah biaya
        return getDurasi() * tarif;
    }

    @Override
    public String tampilData() {
        return "[MALAM] " + super.tampilData() + " (Bonus " + bonusJam + " jam)";
    }
}

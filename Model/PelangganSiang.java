package model;

public class PelangganSiang extends Pelanggan {

    public PelangganSiang(String nama, int durasi, int nomorPC) {
        super(nama, durasi, nomorPC);
        setTotalHarga(hitungTotal()); // langsung simpan total harga
    }

    @Override
    public int hitungTotal() {
        return getDurasi() * 6000; // tarif normal
    }

    @Override
    public String tampilData() {
        return "[SIANG] " + super.tampilData();
    }
}

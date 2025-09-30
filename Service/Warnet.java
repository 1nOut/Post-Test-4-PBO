package service;

import model.Pelanggan;
import model.PelangganSiang;
import model.PelangganMalam;
import java.util.ArrayList;

public class Warnet {
    private final ArrayList<Pelanggan> daftar = new ArrayList<>();

    // Constructor: isi data awal
    public Warnet() {
        daftar.add(new PelangganSiang("Andi", 2, 1));
        daftar.add(new PelangganMalam("Budi", 4, 2));
        daftar.add(new PelangganSiang("Citra", 1, 3));
        daftar.add(new PelangganMalam("Dewi", 3, 4));
        daftar.add(new PelangganSiang("Eko", 5, 5));
        daftar.add(new PelangganMalam("Farah", 2, 6));
    }

    // CREATE
    public void tambahPelanggan(Pelanggan p) {
        daftar.add(p);
        System.out.println("Data berhasil ditambahkan!");
    }

    // READ
    public void lihatPelanggan() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
        } else {
            System.out.println("\n=== Daftar Pelanggan ===");
            for (int i = 0; i < daftar.size(); i++) {
                System.out.println((i + 1) + ". " + daftar.get(i).tampilData());
            }
        }
    }

    // UPDATE
    public void ubahPelanggan(int index, Pelanggan p) {
        if (index >= 0 && index < daftar.size()) {
            daftar.set(index, p);
            System.out.println("Data berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // DELETE
    public void hapusPelanggan(int index) {
        if (index >= 0 && index < daftar.size()) {
            daftar.remove(index);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // SEARCH by nama (Overloading 1)
    public void cariPelanggan(String keyword) {
        boolean ketemu = false;
        for (Pelanggan p : daftar) {
            if (p.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p.tampilData());
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Pelanggan dengan nama \"" + keyword + "\" tidak ditemukan.");
        }
    }

    // SEARCH by nomorPC (Overloading 2)
    public void cariPelanggan(int nomorPC) {
        boolean ketemu = false;
        for (Pelanggan p : daftar) {
            if (p.getNomorPC() == nomorPC) {
                System.out.println(p.tampilData());
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Pelanggan dengan nomor PC " + nomorPC + " tidak ditemukan.");
        }
    }
}

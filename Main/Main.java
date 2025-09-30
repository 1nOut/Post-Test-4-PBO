package main;

import java.util.Scanner;
import service.Warnet;
import model.Pelanggan;
import model.PelangganSiang;
import model.PelangganMalam;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Warnet service = new Warnet();
        int pilihan;

        do {
            // Menu Utama
            System.out.println("\n=== WARNET GIMANG (Rp6000/Jam) ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Data Pelanggan");
            System.out.println("3. Ubah Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Cari Pelanggan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                input.next();
                System.out.print("Pilih menu: ");
            }

            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1: // Tambah Pelanggan
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan durasi (jam): ");
                    int durasi = input.nextInt();
                    System.out.print("Masukkan nomor PC: ");
                    int nomorPC = input.nextInt();
                    input.nextLine();

                    System.out.print("Jenis pelanggan (1. Siang | 2. Malam): ");
                    int pilihJenis = input.nextInt();
                    input.nextLine();

                    Pelanggan baru;
                    if (pilihJenis == 1) {
                        baru = new PelangganSiang(nama, durasi, nomorPC);
                    } else {
                        baru = new PelangganMalam(nama, durasi, nomorPC);
                    }

                    service.tambahPelanggan(baru);
                    break;

                case 2: // Lihat Data
                    service.lihatPelanggan();
                    break;

                case 3: // Ubah Pelanggan
                    service.lihatPelanggan();
                    System.out.print("Masukkan nomor pelanggan yang ingin diubah: ");
                    int noUbah = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama baru: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Durasi baru (jam): ");
                    int durasiBaru = input.nextInt();
                    System.out.print("Nomor PC baru: ");
                    int nomorPCBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Jenis pelanggan baru (1. Siang | 2. Malam): ");
                    int pilihJenisBaru = input.nextInt();
                    input.nextLine();

                    Pelanggan ubah;
                    if (pilihJenisBaru == 1) {
                        ubah = new PelangganSiang(namaBaru, durasiBaru, nomorPCBaru);
                    } else {
                        ubah = new PelangganMalam(namaBaru, durasiBaru, nomorPCBaru);
                    }

                    service.ubahPelanggan(noUbah - 1, ubah);
                    break;

                case 4: // Hapus
                    service.lihatPelanggan();
                    System.out.print("Masukkan nomor pelanggan yang ingin dihapus: ");
                    int noHapus = input.nextInt();
                    input.nextLine();
                    service.hapusPelanggan(noHapus - 1);
                    break;

                case 5: // Cari
                    System.out.print("Cari berdasarkan (1. Nama | 2. Nomor PC): ");
                    int opsiCari = input.nextInt();
                    input.nextLine();

                    if (opsiCari == 1) {
                        System.out.print("Masukkan nama yang dicari: ");
                        String keyword = input.nextLine();
                        service.cariPelanggan(keyword);
                    } else {
                        System.out.print("Masukkan nomor PC yang dicari: ");
                        int pc = input.nextInt();
                        service.cariPelanggan(pc); // Overloading method
                    }
                    break;

                case 6:
                    System.out.println("Terima kasih dan sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);

        input.close();
    }
}

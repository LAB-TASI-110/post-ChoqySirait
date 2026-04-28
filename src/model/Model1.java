package model;

// 12S24012 - Choqy Pananda Sirait

public class Model1 {

    // ===== T01 =====
    private String kode;
    private String namaKota;
    private int ongkir;
    private String kategori;

    // ===== T03 =====
    private String namaProduk;
    private int harga;

    // Constructor T01
    public Model1(String kode, String namaKota, int ongkir, String kategori) {
        this.kode = kode;
        this.namaKota = namaKota;
        this.ongkir = ongkir;
        this.kategori = kategori;
    }

    // Constructor T03
    public Model1(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // ===== Getter T01 =====
    public String getKode() {
        return kode;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public int getOngkir() {
        return ongkir;
    }

    public String getKategori() {
        return kategori;
    }

    // ===== Getter T03 =====
    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHarga() {
        return harga;
    }
}
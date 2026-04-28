package model;

// 12S24012 - Choqy Pananda Sirait

import java.util.ArrayList;

public class Model2 {

    // ===== T01 =====
    private double beratButet;

    // ===== T02 =====
    private int[] stok;

    // ===== T03 =====
    private ArrayList<Model1> daftarPesanan = new ArrayList<>();

    // Constructor T01
    public Model2(double beratButet) {
        this.beratButet = beratButet;
    }

    // Constructor T02
    public Model2(int[] stok) {
        this.stok = stok;
    }

    // Constructor T03
    public Model2() {
    }

    // ===== Method T01 =====
    public double getBeratButet() {
        return beratButet;
    }

    public double getBeratUcok() {
        return beratButet * 1.5;
    }

    public double getTotalBerat() {
        return getBeratButet() + getBeratUcok();
    }

    // ===== Method T02 =====
    public int[] getStok() {
        return stok;
    }

    // ===== Method T03 =====
    public void tambahPesanan(Model1 produk) {
        daftarPesanan.add(produk);
    }

    public ArrayList<Model1> getPesanan() {
        return daftarPesanan;
    }

    public int getTotalHarga() {
        int total = 0;

        for (Model1 item : daftarPesanan) {
            total += item.getHarga();
        }

        return total;
    }
}
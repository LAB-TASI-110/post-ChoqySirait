package model;

// 12S24012 - Choqy Pananda Sirait

public class Model3 {

    // ===== T01 =====
    public double hitungTotal(double berat, int ongkir) {
        return berat * ongkir;
    }

    public double hitungDiskon(double berat, double total) {
        if (berat > 10) {
            return total * 0.10;
        }
        return 0;
    }

    public String getPromo(double berat, String kategori) {

        boolean diskon = berat > 10;
        boolean asuransi = kategori.equalsIgnoreCase("Luar Pulau");

        if (diskon && asuransi) {
            return "Diskon 10% dan Asuransi Gratis";
        } else if (diskon) {
            return "Diskon 10%";
        } else if (asuransi) {
            return "Asuransi Gratis";
        } else {
            return "Tidak Ada Promo";
        }
    }

    // ===== T02 =====
    public int hitungKategori(int[] data, String kategori) {

        int total = 0;

        if (kategori.equalsIgnoreCase("GENAP")) {
            for (int x : data) {
                if (x % 2 == 0) total += x;
            }
        }

        else if (kategori.equalsIgnoreCase("GANJIL")) {
            for (int x : data) {
                if (x % 2 != 0) total += x;
            }
        }

        return total;
    }

    // ===== T03 =====
    public void cetakStruk(Model2 keranjang) {

        System.out.println();
        System.out.println("Daftar Pesanan");

        for (Model1 item : keranjang.getPesanan()) {
            System.out.println(item.getNamaProduk() + " : " + item.getHarga());
        }

        System.out.println("Total Harga : " + keranjang.getTotalHarga());
    }
}
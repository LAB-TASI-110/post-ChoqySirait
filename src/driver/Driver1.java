package driver;

// 12S24012 - Choqy Pananda Sirait

import java.util.Scanner;
import model.Model1;
import model.Model2;
import model.Model3;

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Database kota
        Model1[] kota = {
            new Model1("MDN", "Medan", 8000, "Dalam Pulau"),
            new Model1("BLG", "Balige", 5000, "Dalam Pulau"),
            new Model1("JKT", "Jakarta", 12000, "Luar Pulau"),
            new Model1("SBY", "Surabaya", 13000, "Luar Pulau")
        };

        while (true) {

            String kode = input.nextLine();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            double beratButet = input.nextDouble();
            input.nextLine();

            Model1 tujuan = null;

            // Cari kode kota
            for (int i = 0; i < kota.length; i++) {
                if (kota[i].getKode().equalsIgnoreCase(kode)) {
                    tujuan = kota[i];
                    break;
                }
            }

            if (tujuan == null) {
                System.out.println("Kode kota tidak ditemukan");
                continue;
            }

            Model2 paket = new Model2(beratButet);
            Model3 transaksi = new Model3();

            double totalBerat = paket.getTotalBerat();
            double total = transaksi.hitungTotal(totalBerat, tujuan.getOngkir());
            double diskon = transaksi.hitungDiskon(totalBerat, total);
            double bayar = total - diskon;

            System.out.println(" \nStruk Pembayaran ");
            System.out.println("Kota Tujuan : " + tujuan.getNamaKota());
            System.out.println("Berat Paket Butet : " + paket.getBeratButet() + " kg");
            System.out.println("Berat Paket Ucok : " + paket.getBeratUcok() + " kg");
            System.out.println("Total Berat : " + totalBerat + " kg");
            System.out.println("Total Ongkos Kirim : Rp " + (int) bayar);
            System.out.println("Informasi Promo : " + transaksi.getPromo(totalBerat, tujuan.getKategori()));
        }

        input.close();
    }
}
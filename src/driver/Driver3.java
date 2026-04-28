package driver;

// 12S24012 - Choqy Pananda Sirait

import java.util.Scanner;
import model.Model1;
import model.Model2;
import model.Model3;

public class Driver3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Model2 keranjang = new Model2();
        Model3 proses = new Model3();

        // =====================
        // MAKANAN
        // =====================
        while (true) {

            System.out.println("Menu Makanan");
            System.out.println("1. Bakwan Goreng - 10000");
            System.out.println("2. Tempe Goreng - 11000");
            System.out.println("3. Nugget Goreng - 12000");
            System.out.println("4. Nasi Goreng - 15000");
            System.out.println("5. Pisang Coklat - 13000");
            System.out.println("6. Opsi Lainnya");

            System.out.print("Pilih / --- : ");
            String pilih = input.nextLine();

            if (pilih.equals("---")) {
                break;
            }

            switch (pilih) {

                case "1":
                    keranjang.tambahPesanan(new Model1("Bakwan Goreng", 10000));
                    break;

                case "2":
                    keranjang.tambahPesanan(new Model1("Tempe Goreng", 11000));
                    break;

                case "3":
                    keranjang.tambahPesanan(new Model1("Nugget Goreng", 12000));
                    break;

                case "4":
                    keranjang.tambahPesanan(new Model1("Nasi Goreng", 15000));
                    break;

                case "5":
                    keranjang.tambahPesanan(new Model1("Pisang Coklat", 13000));
                    break;

                case "6":
                    System.out.print("Nama makanan : ");
                    String custom = input.nextLine();
                    keranjang.tambahPesanan(new Model1(custom, 15000));
                    break;
            }

            System.out.println();
        }

        // =====================
        // MINUMAN
        // =====================
        while (true) {

            System.out.println("Menu Minuman");
            System.out.println("1. Coklat Dingin - 12000");
            System.out.println("2. Coklat Panas - 11000");
            System.out.println("3. Matcha - 14000");
            System.out.println("4. Kopi - 13000");
            System.out.println("5. Opsi Lainnya");

            System.out.print("Pilih / --- : ");
            String pilih = input.nextLine();

            if (pilih.equals("---")) {
                break;
            }

            switch (pilih) {

                case "1":
                    keranjang.tambahPesanan(new Model1("Coklat Dingin", 12000));
                    break;

                case "2":
                    keranjang.tambahPesanan(new Model1("Coklat Panas", 11000));
                    break;

                case "3":
                    keranjang.tambahPesanan(new Model1("Matcha", 14000));
                    break;

                case "4":
                    keranjang.tambahPesanan(new Model1("Kopi", 13000));
                    break;

                case "5":
                    System.out.print("Nama minuman : ");
                    String custom = input.nextLine();
                    keranjang.tambahPesanan(new Model1(custom, 15000));
                    break;
            }

            System.out.println();
        }

        // Cetak hasil
        proses.cetakStruk(keranjang);

        input.close();
    }
}
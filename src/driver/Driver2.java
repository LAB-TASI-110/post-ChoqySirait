package driver;

// 12S24012 - Choqy Pananda Sirait

import java.util.Scanner;
import model.Model2;
import model.Model3;

public class Driver2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Jumlah total data : ");
        int n = input.nextInt();

        int[] data = new int[n];

        // Input stok
        System.out.print("Deret stok : ");
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        input.nextLine();

        // Input kategori
        System.out.print("Kode kategori barang : ");
        String kategori = input.nextLine();

        Model2 barang = new Model2(data);
        Model3 proses = new Model3();

        int hasil = proses.hitungKategori(barang.getStok(), kategori);

        System.out.println();
        System.out.println("Total stok kategori " + kategori + " : " + hasil);

        input.close();
    }
}
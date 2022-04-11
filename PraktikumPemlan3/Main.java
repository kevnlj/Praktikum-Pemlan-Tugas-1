package PraktikumPemlan3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Baju HrgBaju = new Baju(100000, 125000, 175000);
        Baju HrgBajuDsc = new Baju(95000, 120000, 160000);
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000 \nBaju B dengan harga 125000 \nBaju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String pilih = in.next();
        if (pilih.equalsIgnoreCase("a")) {
            System.out.print("Jumlah Baju yang akan anda beli adalah : ");
            int jumlah = in.nextInt();
            if (jumlah <= 100) {
                HrgBaju.Transaksi(pilih, jumlah);
            } else
                HrgBajuDsc.Transaksi(pilih, jumlah);
        }
        else if (pilih.equalsIgnoreCase("b")) {
            System.out.print("Jumlah Baju yang akan anda beli adalah : ");
            int jumlah = in.nextInt();
            if (jumlah <= 100) {
                HrgBaju.Transaksi(pilih, jumlah);
            } else
                HrgBajuDsc.Transaksi(pilih, jumlah);
        }
        else if (pilih.equalsIgnoreCase("c")) {
            System.out.print("Jumlah Baju yang akan anda beli adalah : ");
            int jumlah = in.nextInt();
            if (jumlah <= 100) {
                HrgBaju.Transaksi(pilih, jumlah);
            } else
                HrgBajuDsc.Transaksi(pilih, jumlah);
        }
    }
}

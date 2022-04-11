package PraktikumPemlan4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("[Kevin Leonardo Julianto / 215150701111039]");
        System.out.println();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();

        System.out.println();

        System.out.println("Inputkan Data Merchant!");
        System.out.print("Nama Merchant  : ");
        String namer = in.nextLine();
        System.out.print("Nama Produk    : ");
        String naprod = in.nextLine();
        System.out.print("Harga          : ");
        double harga = in.nextDouble();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namer, naprod, harga));

        System.out.println();

        System.out.println("[Kevin Leonardo Julianto / 215150701111039]");
        System.out.println();
        System.out.println("Data Merchant Ditampilkan");
        System.out.println();
        DataMerchant.tampilData();

        System.out.println();

        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Ayam Geprek Kak Ros"), "Ayam Geprek Kak Ros", "Ayam Geprek Ekstra Pedas", 12000);

        System.out.println("Data Merchant Terupdate :");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Ayam Geprek Kak Ros"));
    }
}

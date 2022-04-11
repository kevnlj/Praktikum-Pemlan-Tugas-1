package PraktikumPemlan4;

import java.util.Objects;
import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant merchant){
        Merchant[] merchants = new Merchant[merc.length + 1];

        System.arraycopy(merc, 0, merchants, 0, merc.length);

        merchants[merc.length] = merchant;
        return merchants;
    }

    public static void tampilData(){
        for (Merchant mch1 : merc) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant  : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk    : "+mch1.getNamaProduk());
            System.out.println("Harga          : "+(int)mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant (String nama){
        int mch1 = 0;
        for (int mch2 = 0; mch2 < DataMerchant.merc.length; mch2++){
            if (Objects.equals(DataMerchant.merc[mch2].getNamaMerchant(), nama)){
                mch1 = mch2;
                break;
            }
        }
        return merc[mch1];
    }
    public static void tampilMerchant (Merchant merchant){
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant  : "+merchant.getNamaMerchant());
        System.out.println("Nama Produk    : "+merchant.getNamaProduk());
        System.out.println("Harga          : "+(int)merchant.getHargaMakanan());
    }
    public static void updateMerchant (Merchant merchant, String namer, String naprod, double harga){
        merchant.setNamaMerchant(namer);
        merchant.setNamaProduk(naprod);
        merchant.setHargaMakanan(harga);
    }
}

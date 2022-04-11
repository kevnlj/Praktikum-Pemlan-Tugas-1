package PraktikumPemlan3;

public class Baju {
    private final int BajuA, BajuB, BajuC;
    private int totalHarga;
    public Baju(int HrgBajuA, int HrgBajuB, int HrgBajuC) {
        BajuA = HrgBajuA;
        BajuB = HrgBajuB;
        BajuC = HrgBajuC;
    }
    public int getBajuA() {
        return BajuA;
    }
    public int getBajuB() {
        return BajuB;
    }
    public int getBajuC() {
        return BajuC;
    }
    public void Transaksi (String pilih, int jumlah) {
        if (pilih.equalsIgnoreCase("a")) {
            totalHarga = getBajuA() * jumlah;
            System.out.println("Jenis yang anda beli : " + pilih);
            System.out.println("Harga per baju       : " + getBajuA());
        } else if (pilih.equalsIgnoreCase("b")) {
            totalHarga = getBajuB() * jumlah;
            System.out.println("Jenis yang anda beli : " + pilih);
            System.out.println("Harga per baju       : " + getBajuB());
        } else if (pilih.equalsIgnoreCase("c")) {
            totalHarga = getBajuC() * jumlah;
            System.out.println("Jenis yang anda beli : " + pilih);
            System.out.println("Harga per baju       : " + getBajuC());
        }
        System.out.println("Total harga          : " + totalHarga);
    }
}

package PraktikumPemlan7;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }
    public int getPenjualan() {
        return penjualan;
    }
    public double getKomisi() {
        return komisi;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji(){
        return (getPenjualan()*getKomisi());
    }

    @Override
    public String toString(){
        return "Sales\t\t\t : %s\nNo. KTP\t\t\t : %s\nTotal Penjualan\t : %d\nBesaran Komisi\t : %s\nPendapatan\t\t : Rp %d".formatted(getNama(), getNoKTP(), getPenjualan(), getKomisi(), (int) gaji());
    }
}
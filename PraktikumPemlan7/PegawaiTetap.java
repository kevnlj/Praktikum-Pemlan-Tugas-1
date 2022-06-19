package PraktikumPemlan7;

public class PegawaiTetap extends Pegawai{
    private double upah;
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }
    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji(){
        return upah;
    }

    @Override
    public String toString(){
        return "Pegawai Tetap\t : %s\nNo. KTP\t\t\t : %s\nUpah\t\t\t : %s\nPendapatan\t\t : Rp %d".formatted(getNama(), getNoKTP(), getUpah(), (int) gaji());
    }
}
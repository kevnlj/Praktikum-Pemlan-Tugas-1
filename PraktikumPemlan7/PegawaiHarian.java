package PraktikumPemlan7;

public class PegawaiHarian extends Pegawai{
    private double upahPerjam;
    private int totalJam;
    public PegawaiHarian(String nama, String noKTP, double upahPerjam, int totalJam) {
        super(nama, noKTP);
        this.upahPerjam = upahPerjam;
        this.totalJam = totalJam;
    }
    public double getUpahPerjam() {
        return upahPerjam;
    }
    public int getTotalJam() {
        return totalJam;
    }
    public void setUpahPerjam(double upahPerjam) {
        this.upahPerjam = upahPerjam;
    }
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji(){
        if (this.totalJam <= 40){
            return (getUpahPerjam()*getTotalJam());
        } else{
            return ((getUpahPerjam()*40)+(getTotalJam()-40)*getUpahPerjam()*1.5);
        }
    }

    @Override
    public String toString(){
        return "Pegawai Harian\t : %s\nNo. KTP\t\t\t : %s\nUpah/jam\t\t : %s\nTotal jam kerja\t : %d\nPendapatan\t\t : Rp %d".formatted(getNama(), getNoKTP(), getUpahPerjam(), getTotalJam(), (int) gaji());
    }
}
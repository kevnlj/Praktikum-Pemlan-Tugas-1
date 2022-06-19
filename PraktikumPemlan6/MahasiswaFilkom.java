package PraktikumPemlan6;

import java.util.Arrays;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public double getIPK() {
        return IPK;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        if (getNIM().charAt(6) == '2' ){
            return "Teknik Meniup Gelembung, 20"+getNIM().substring(0,2);
        } else if (getNIM().charAt(6) == '3'){
            return "Teknik Berburu Ubur Ubur, 20"+getNIM().substring(0,2);
        } else if (getNIM().charAt(6) == '4'){
            return "Sistem Perhamburgeran, 20"+getNIM().substring(0,2);
        } else if (getNIM().charAt(6) == '6'){
            return "Pendidikan Chum Bucket, 20"+getNIM().substring(0,2);
        } else if (getNIM().charAt(6) == '7'){
            return "Teknologi Telepon Kerang, 20"+getNIM().substring(0,2);
        } else
            return "NIM tidak terdaftar";
    }

    public double getBeasiswa(){
        if (getIPK()>=3.0&&getIPK()<3.5){
            return 50;
        } else if (getIPK()>=3.5&&getIPK()<4){
            return 75;
        } else
            return 0;
    }

    public String toString(){
        StringBuilder RETURN = new StringBuilder();
        for (String s : Arrays.asList("[ MAHASISWA ]\n", "Nama          : " + getNama() + "\n", "NIK           : " + getNIK() + "\n", "Jenis Kelamin : ")) {
            RETURN.append(s);
        }
        if (super.getJenisKelamin())
            RETURN.append("Laki-Laki\n");
        else
            RETURN.append("Perempuan\n");
        for (String s : Arrays.asList("Pendapatan    : " + (getBeasiswa() + getPendapatan()) + "$\n", "IPK           : " + getIPK() + "\n", "NIM           : " + getNIM() + "\n", "Status        : " + getStatus() + "\n", "----------------------------------------------\n")) {
            RETURN.append(s);
        }
        return RETURN.toString();
    }
}
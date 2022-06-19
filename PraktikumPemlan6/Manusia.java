package PraktikumPemlan6;

import java.util.Arrays;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNIK() {
        return NIK;
    }
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public boolean getMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    double getTunjangan(){
        if (getMenikah() && getJenisKelamin()){
            return 25;
        } else if (getMenikah() && !getJenisKelamin()){
            return 20;
        } else{
            return 15;
        }
    }

    double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        StringBuilder RETURN = new StringBuilder();
        for (String s : Arrays.asList("[ MANUSIA ]\n", "Nama          : " + getNama() + "\n", "NIK           : " + getNIK() + "\n", "Jenis Kelamin : ")) {
            RETURN.append(s);
        }
        if (jenisKelamin)
            RETURN.append("Laki-Laki\n");
        else
            RETURN.append("Perempuan\n");
        for (String s : Arrays.asList("Pendapatan    : " + getPendapatan() + "$\n", "----------------------------------------------\n")) {
            RETURN.append(s);
        }
        return RETURN.toString();
    }
}
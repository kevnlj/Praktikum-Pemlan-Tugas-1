package PraktikumPemlan6;

import java.util.Arrays;

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getGaji() {
        return super.getGaji();
    }
    @Override
    public double getBonus() {
        return super.getBonus()+(super.getBonus()*(0.3));
    }
    @Override
    double getPendapatan() {
        return super.getPendapatan()+15;
    }

    public String toString (){
        StringBuilder RETURN = new StringBuilder();
        for (String s : Arrays.asList("[ MANAJER ]\n", "Nama          : " + getNama() + "\n", "NIK           : " + getNIK() + "\n", "Jenis Kelamin : ")) {
            RETURN.append(s);
        }
        if (super.getJenisKelamin())
            RETURN.append("Laki-Laki\n");
        else
            RETURN.append("Perempuan\n");
        for (String s : Arrays.asList("Pendapatan    : " + (getBonus() + getGaji() + getPendapatan()) + "$\n", "Bonus         : " + getBonus() + "$\n", "Gaji          : " + getGaji() + "$\n", "Status        : " + getStatus() + "\n", "Lama Kerja    : " + getLamaKerja() + " hari\n", "----------------------------------------------\n")) {
            RETURN.append(s);
        }
        return RETURN.toString();
    }
}
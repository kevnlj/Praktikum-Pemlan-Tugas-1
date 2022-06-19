package PraktikumPemlan6;

import java.util.Arrays;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        return getharikerja() * getjamkerja() * 15;
    }

    public double getBonus() {
        double bonuslembur;
        int harilibur = (getharikerja()/7)*2;
        if (getharikerja()-(getharikerja()/7*7)==6)
            harilibur++;
        if (getjamkerja()>7)
            bonuslembur = (getharikerja()-harilibur)*(getjamkerja()-7)*7;
        else
            bonuslembur = 0;

        double bonuslibur;
        if (getharikerja()>5)
            bonuslibur = harilibur* getjamkerja()*20;
        else
            bonuslibur = 0;

        return bonuslibur + bonuslembur;
    }

    public int getjamkerja() {
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public int getharikerja() {
        return hariKerja;
    }
    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }
    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String Departemen = "";
        if (getNIP().charAt(6) == '1') {
            Departemen += "Pemasaran";
        } else if (getNIP().charAt(6) == '2') {
            Departemen += "Humas";
        } else if (getNIP().charAt(6) == '3') {
            Departemen += "Riset";
        } else if (getNIP().charAt(6) == '4') {
            Departemen += "Teknologi";
        } else if (getNIP().charAt(6) == '5') {
            Departemen += "Personalia";
        } else if (getNIP().charAt(6) == '6') {
            Departemen += "Akademik";
        } else if (getNIP().charAt(6) == '7') {
            Departemen += "Administrasi";
        } else if (getNIP().charAt(6) == '8') {
            Departemen += "Operasional";
        } else if (getNIP().charAt(6) == '9') {
            Departemen += "Pembangunan";
        }

        String Cabang = "";
        if (getNIP().charAt(0) == '1') {
            Cabang = "Mondstadt";
        } else if (getNIP().charAt(0) == '2') {
            Cabang = "Liyue";
        } else if (getNIP().charAt(0) == '3') {
            Cabang = "Inazuma";
        } else if (getNIP().charAt(0) == '4') {
            Cabang = "Sumeru";
        } else if (getNIP().charAt(0) == '5') {
            Cabang = "Fontaine";
        } else if (getNIP().charAt(0) == '6') {
            Cabang = "Natlan";
        } else if (getNIP().charAt(0) == '7') {
            Cabang = "Snezhnaya";
        }

        return Departemen+", "+Cabang+" cabang ke-"+getNIP().charAt(2);
    }

    public String toString(){
        StringBuilder RETURN = new StringBuilder();
        for (String s : Arrays.asList("[ PEKERJA ]\n", "Nama          : " + getNama() + "\n", "NIK           : " + getNIK() + "\n", "Jenis Kelamin : ")) {
            RETURN.append(s);
        }
        if (super.getJenisKelamin())
            RETURN.append("Laki-Laki\n");
        else
            RETURN.append("Perempuan\n");
        for (String s : Arrays.asList("Pendapatan    : " + (getBonus() + getGaji() + getPendapatan()) + "$\n", "Bonus         : " + getBonus() + "$\n", "Gaji          : " + getGaji() + "$\n", "Status        : " + getStatus() + "\n", "----------------------------------------------\n")) {
            RETURN.append(s);
        }
        return RETURN.toString();
    }
}
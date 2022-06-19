package PraktikumPemlan7;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai;
        System.out.println("==============================================" +"\n");
        pegawai = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        System.out.println(pegawai +"\n");
        pegawai = new PegawaiHarian("Edo", "350728490327424892343", 8500, 40);
        System.out.println(pegawai +"\n");
        pegawai = new Sales("Tika", "350728490327424892344", 50, 50000);
        System.out.println(pegawai +"\n");

        System.out.println("==============================================" +"\n");
        pegawai = new PegawaiTetap("Dicky Hermansyah", "350728490327424892345", 3000000);
        System.out.println(pegawai +"\n");
        pegawai = new PegawaiHarian("Kevin Leonardo", "350728490327424892346", 4500, 42);
        System.out.println(pegawai +"\n");
        pegawai = new Sales("Didik Julianto", "350728490327424892347", 54, 20000);
        System.out.println(pegawai +"\n");

        System.out.println("==============================================" +"\n");
        pegawai = new PegawaiTetap("Siti Utomah", "350728490327424892348", 1000000);
        System.out.println(pegawai +"\n");
        pegawai = new PegawaiHarian("Cahyo Sumanto", "350728490327424892349", 6000, 30);
        System.out.println(pegawai +"\n");
        pegawai = new Sales("Setyo Widodo", "350728490327424892350", 29, 25000);
        System.out.println(pegawai +"\n");

        System.out.println("==============================================" +"\n");
        pegawai = new PegawaiTetap("Pitu Romo", "350728490327424892348", 4000000);
        System.out.println(pegawai +"\n");
        pegawai = new PegawaiHarian("Khotijah", "350728490327424892349", 7000, 22);
        System.out.println(pegawai +"\n");
        pegawai = new Sales("Santi", "350728490327424892350", 75, 30000);
        System.out.println(pegawai +"\n");
        System.out.println("==============================================" +"\n");
    }
}
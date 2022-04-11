package PraktikumPemlan2;

import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int memilih = in.nextInt();

            if (memilih == 1){

                int p = in.nextInt();

                Persegi per = new Persegi(p);
                System.out.println(per.Luas());
            }

            else if (memilih == 2){

                int p = in.nextInt();
                int q = in.nextInt();

                Segitiga seg = new Segitiga(p, q);
                System.out.println(seg.Luas());
            }

            else if (memilih == 3){

                int p = in.nextInt();

                Lingkaran ling = new Lingkaran(p);
                if (p % 7 == 0)
                System.out.println(ling.Luas());
                else
                System.out.println(ling.LuasX());
            }

            else
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

    class Persegi{

        int sisi;

        Persegi (int sisi) {
            this.sisi = sisi;
        }
        int Luas() {
            return sisi*sisi;
        }
    }

    class Segitiga{

        int alas;
        int tinggi;

        Segitiga (int alas, int tinggi){
            this.alas = alas;
            this.tinggi = tinggi;
        }
        int Luas (){
            return alas*tinggi/2;
        }
    }

    class Lingkaran{

        int jari;

        Lingkaran(int jari){
            this.jari = jari;
        }
        double Luas(){
            return 22/7*jari*jari;
        }
        double LuasX(){
            return (int) (3.14*jari*jari);
        }
    }

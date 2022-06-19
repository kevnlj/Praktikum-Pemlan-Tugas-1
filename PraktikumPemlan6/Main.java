package PraktikumPemlan6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manusia> list = new ArrayList<>();

        list.add(new Manusia("Aku", "3923842934", true, true));
        list.add(new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.7));
        list.add(new Pekerja("Iqbal Biondy", "351717969", true, true, 7, 22, "195102439283"));
        list.add(new Manajer("Lyra Hertin", "351707384392", false, false, 9, 20, "204837283728", 1500));

        list.add(new Manusia("Dicky Hermansyah", "3578291304", true, false));
        list.add(new MahasiswaFilkom("Kevin Leonardo J", "357102230504", true, false, "215150701111039", 3.8));
        list.add(new Pekerja("Didik Julianto", "359239482184", true, true, 15, 30, "421984709231"));
        list.add(new Manajer("Siti Utomah", "353219580234", false, true, 10, 26, "213246764801", 2000));

        list.add(new Manusia("Cahyo Sumanto", "352349850234", true, true));
        list.add(new MahasiswaFilkom("Setyo Widodo", "352127784051", true, false, "193784393021345", 3.5));
        list.add(new Pekerja("Pitu Romo", "374234798423", true, false, 7, 20, "622094289012"));
        list.add(new Manajer("Khotijah", "342125639014", false, true, 12, 22, "316289910273", 3000));

        list.add(new Manusia("Santi", "356283850293", false, true));
        list.add(new MahasiswaFilkom("Ansellma", "357193948231", false, false, "203274290431298", 3.0));
        list.add(new Pekerja("Cristiano Ronaldo", "347294394213", true, true, 9, 30, "711649623019"));
        list.add(new Manajer("Rizki Fajarista", "391284571237", true, false, 10, 23, "523921489012", 1000));

        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("----------------------------------------------");
        for (Manusia manusia : list) {
            System.out.print(manusia.toString());
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
    }
}
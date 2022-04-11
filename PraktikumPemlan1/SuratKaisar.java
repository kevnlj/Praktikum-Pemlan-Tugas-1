package PraktikumPemlan1;

import java.util.*;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String isiTeks = in.nextLine();
        int nilai = in.nextInt();

        rumussuratkaisar(isiTeks, nilai);
    }

    static void rumussuratkaisar(String isiTeks, int nilai){
        for (int i = 0; i < isiTeks.length(); i++){

            int alpabet = isiTeks.charAt(i);
            int geser = isiTeks.charAt(i) + nilai - 26;

            if (alpabet >= 'a' && alpabet <= 'z'){
                if (alpabet + nilai > 'z')
                    System.out.print((char) geser);
                else
                    System.out.print((char)(alpabet + nilai));
            }

            if (alpabet >= 'A' && alpabet <= 'Z'){
                if (alpabet + nilai > 'Z')
                    System.out.print((char) geser);
                else
                    System.out.print((char)(alpabet + nilai));
            }

            if (alpabet == ' '){
                System.out.print(' ');
            }
        }
    }
}

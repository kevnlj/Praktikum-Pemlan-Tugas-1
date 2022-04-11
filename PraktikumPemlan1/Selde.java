package PraktikumPemlan1;

import java.util.*;

public class Selde {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ujiSelde(num);
    }


    static void ujiSelde(int num) {
        String number = num + "";

        int count = 0;
        if (number.length() % 2 == 0) {
            for (int i = 0, j = number.length() - 1; i - j != 1; i++, j--) {
                if (number.charAt(i) != number.charAt(j)) {
                    count++;
                }
            }

        } else {
            for (int i = 0, j = number.length() - 1; i - j != 2; i++, j--) {
                if (number.charAt(i) != number.charAt(j)) {
                    count++;
                }
            }

        }
        if (count == 0) {
            System.out.println(num + " adalah selde.");
        } else
            System.out.println(num + " bukan selde.");
    }
}

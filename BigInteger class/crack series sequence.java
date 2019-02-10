/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Sai Deepthi
 */
class cracktheseries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // while (n-- > 0) {
            int x = 1;
            if (x % 2 != 0) {
                int y = x / 2 + 1;
                BigInteger b;
                b = new BigInteger("1");
                int pow = (int) Math.pow(2, y - 1);
                System.out.println("b initial:"+b);
                for (int i = 0; i < pow; i++) {
                    b = b.multiply(new BigInteger("2"));
                    System.out.println(b);
                }
                System.out.println(b);

            } else {
                int y = x / 2;
                BigInteger b;
                b = new BigInteger("1");
                int pow = (int) Math.pow(3, y - 1);
                //System.out.println(pow);
                
                for (int i = 0; i < pow; i++) {
                    b = b.multiply(new BigInteger("2"));
                }
                System.out.println(b);
//            }

        }

    }

}

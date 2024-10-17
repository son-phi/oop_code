import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.scalb;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {

            BigInteger n = sc.nextBigInteger();
            BigInteger m = sc.nextBigInteger();
            String s1 = n.toString();
            String s2 = m.toString();

            BigInteger res = n.subtract(m).abs();
            String out = res.toString();
            int len_max = Math.max(s1.length(), s2.length());
            StringBuilder sb = new StringBuilder(res.toString());
//            System.out.print(sb.toString().length() +" "+len_max);
            while (sb.toString().length() < len_max) {
                sb.insert(0, "0");
            }
            System.out.println(sb.toString());
        }
    }
}
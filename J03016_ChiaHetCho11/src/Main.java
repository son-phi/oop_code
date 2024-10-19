import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger n = scanner.nextBigInteger();
            BigInteger num = BigInteger.valueOf(11);
            if (n.mod(num).equals(BigInteger.ZERO)) {
                System.out.println(1);
            } else System.out.println(0);
        }
    }
}
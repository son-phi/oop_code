import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(System.in);
        BigInteger bigInt = sc.nextBigInteger();
        String str = bigInt.toString();
        int n = str.length() ;
        while (n!=1){
            BigInteger x1 = new BigInteger(str.substring(0,(int)n/2));
            BigInteger x2 = new BigInteger(str.substring((int)n/2));
            str = (x1.add(x2)).toString();
            n = str.length();
            System.out.println(str);
        }
    }
}
import java.math.BigInteger;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<BigInteger> lst = new ArrayList<BigInteger>();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                int j = i;
                while (j< line.length() && Character.isDigit(line.charAt(j))){
                    j++;
                }
                if (i != j){
                    String str = line.substring(i, j);
                    lst.add(new BigInteger(str));
                    i+= str.length();
                }

            }
        }
        Collections.sort(lst);
        for (BigInteger num:lst){
            System.out.println(num);
        }
    }

}
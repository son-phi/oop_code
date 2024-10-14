import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            int n = line.length();
            String st1 = line.substring(0, n/2);
            String st2;
            if (n %2 ==0 ){
                st2 = line.substring(n/2 );
            } else {
                st2 = line.substring(n/2 +1 );
            }
            StringBuffer sb = new StringBuffer(st2).reverse();
            int cnt =0;
            for (int i = 0; i < st1.length(); i++) {
                if (st1.charAt(i) != sb.charAt(i)) {
                    cnt++;
                }
            }
            if (cnt ==1) System.out.println("YES");
            else if (cnt == 0 && n %2==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
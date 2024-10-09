import java.util.Scanner;

import static java.lang.Math.sqrt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String st = sc.nextLine();
            if (check(st)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String st){
        for (int i = 0; i < st.length()/2; i++) {
            int n = st.charAt(i)-'0';
            if (st.charAt(i) != st.charAt(st.length()-i-1) || !check2(n)) {
                return false;
            }
        }
        return true;
    }

    public static boolean check2(int n){
        for (int i = 2; i<= sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return n>=2;
    }
}
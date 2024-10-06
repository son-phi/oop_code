import java.util.Scanner;

import static java.lang.Math.sqrt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (check(n)){
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
    public static boolean check(int n){
        for (int i = 1; i <= sqrt(n); i++) {
            if (i*i == n) return true;
        }
        return false;
    }
}
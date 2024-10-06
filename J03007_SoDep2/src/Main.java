import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String st = sc.nextLine();
            if (st.charAt(0)=='8' && st.charAt(st.length()-1)=='8' && check(st) && check2(st)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
//            for (int i = 0; i < st.length()/2; i++) {
//                System.out.print(st.charAt(i));
//                System.out.print(" ");
//                System.out.println(st.charAt(st.length()-i-1));
//            }
        }
    }

    public static boolean check(String st){
        for (int i = 0; i < st.length()/2; i++) {

            if (st.charAt(i) != st.charAt(st.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean check2(String st){
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {
            sum += st.charAt(i) - '0';
        }
        return sum % 10 == 0;
    }
}
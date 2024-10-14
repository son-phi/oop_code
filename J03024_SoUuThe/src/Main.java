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
            if (check(st)==1) System.out.println("YES");
            else if (check(st)==0) System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
    public static int check(String s) {
        int cnt_chan = 0;
        int cnt_le = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if ((s.charAt(i)-'0') %2 == 0) {
                    cnt_chan++;
                } else {
                    cnt_le++;
                }
            } else return -1;
        }
        if (s.charAt(s.length()-1)%2==0 && cnt_chan>cnt_le && s.length()%2==0) return 1;
        if (s.charAt(s.length()-1)%2==1 && cnt_chan<cnt_le && s.length()%2==1) return 1;
        return 0;
    }
}
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            Stack<Character> stk = new Stack<Character>();
            String str = sc.nextLine();
            stk.push(str.charAt(0));

            for (int i = 1; i < str.length(); i++) {
                if (stk.empty()) {
                    stk.push(str.charAt(i));
                    continue;
                }
                char ch = stk.peek();
                if ( (ch == '[' && str.charAt(i) == ']')||(ch == '{' && str.charAt(i) == '}') || ch=='(' && str.charAt(i) == ')') {
                    stk.pop();
                } else {
                    stk.push(str.charAt(i));
                }
            }
            if (stk.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            Stack<String> stk = new Stack<>();
            q.add("6");
            q.add("8");
            while (!q.isEmpty()) {
                String s = q.poll();
                stk.push(s);
                if (s.length()==n){
                    continue;
                }
                q.add(s+"6");
                q.add(s+"8");
            }
            System.out.println(stk.size());
            while (!stk.isEmpty()) {
                System.out.print(stk.pop()+" ");
            }
            System.out.println();
        }
    }
}
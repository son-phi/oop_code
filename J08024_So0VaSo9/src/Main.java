import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while (!q.isEmpty()) {
                String s = q.poll();
                if (Integer.parseInt(s) % n==0) {
                    System.out.println(Integer.parseInt(s));
                    break;
                }
                q.add(s+"0");
                q.add(s+"9");
            }

        }
    }
}
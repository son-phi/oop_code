import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n+m; i++) {
            set.add(sc.nextInt());
        }
        for (int num:set){
            System.out.print(num+" ");
        }
    }
}
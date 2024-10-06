import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> lst = new ArrayList<>();
        while (t-- > 0) {
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = arr[arr.length - 1];
            for (int i = 0; i < arr.length -1; i++) {
                s += arr[i].charAt(0);
            }
            lst.add(s);
            int count = Collections.frequency(lst, s);
            s += (count == 1 ? "" : count) + "@ptit.edu.vn";
            System.out.println(s);
        }
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i+=2) {
            if (str.length()%2==1 && i == str.length()) continue;
            lst.add(Integer.parseInt(str.substring(i, i+2)));
        }
        Collections.sort(lst);
//        for (int num : lst) System.out.println(num);
        System.out.printf("%d ",lst.get(0));
        for (int i = 1; i < lst.size()-1; i++) {
            if (lst.get(i)!=lst.get(i-1)) System.out.printf("%d ",lst.get(i));
        }
    }
}
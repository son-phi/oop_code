import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            Set<String> a1 = new HashSet<>(Arrays.asList(s1.split("\\s+")));
            Set<String> a2 = new HashSet<>(Arrays.asList(s2.split("\\s+")));
            a1.removeAll(a2);
            for (String i : a1){
                System.out.print(i+" ");
            }
            System.out.println();

        }

    }


}
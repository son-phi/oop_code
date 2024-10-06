import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lst1 = new int[4];
        int[] lst2 = new int[4];
        for (int i = 0; i < 4; i++) {
            lst1[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            lst2[i] = sc.nextInt();
        }
        int x_max = Math.max(lst1[2], lst2[2]); // 8
        int x_min = Math.min(lst1[0], lst2[0]); // 1
        int y_min = Math.min(lst1[1], lst2[1]); //6
        int y_max = Math.max(lst1[3], lst2[3]); //9
        int edge = Math.max(x_max - x_min, y_max - y_min);
        int s = edge*edge;
        System.out.println(s);
    }
}
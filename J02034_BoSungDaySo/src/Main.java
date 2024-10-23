import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ok = true;
        int start = 1;
        for (int i =0; i<n;i++){
            if (arr[i] != start){
                System.out.println(start);
                ok = false;
                start++;
                i--;
            } else {
                start++;
            }
        }
        if (ok) System.out.println("Excellent!");
    }
}
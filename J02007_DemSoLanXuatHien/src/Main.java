import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j=0; j < t; j++) {
            System.out.printf("Test %d:\n",j+1);
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] dd = new int[100005];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                dd[arr[i]]++;
            }
            for (int i = 0; i < n; i++) {
                if (dd[arr[i]] != 0) {
                    System.out.printf("%d xuat hien %d lan\n",arr[i],dd[arr[i]]);
                    dd[arr[i]] = 0;
                }
            }
        }
    }
}
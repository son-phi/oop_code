import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        double num_max = 0.0;
        double num_min = 10.0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            num_max = Math.max(num_max, arr[i]);
            num_min = Math.min(num_min, arr[i]);
        }
        double total = 0;
        int cnt =0;
        for (int i = 0; i < n; i++) {

            if (arr[i] != num_min && arr[i] != num_max) {
                total += arr[i];
                cnt++;
            }
        }
        System.out.printf("%.2f",total/cnt);


    }
}
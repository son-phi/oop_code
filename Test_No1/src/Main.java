import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String str = scanner.nextLine();
            int max = 0;
            int min = 10;
            for (int i = 0; i < str.length(); i++) {
                max = Math.max(max, str.charAt(i)-'0');
                min = Math.min(min, str.charAt(i)-'0');
            }
            System.out.printf("%d %d \n",max, min);
        }
    }
}
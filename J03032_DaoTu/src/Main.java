import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            String[] words = line.split("\\s+");
            for (String word : words) {
                StringBuilder sb = new StringBuilder();
                sb.append(word);
                sb.reverse();
                System.out.printf("%s ",sb.toString());
            }
            System.out.println();
        }
    }
}
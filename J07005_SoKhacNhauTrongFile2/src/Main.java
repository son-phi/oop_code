import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.IN"));
        int[] arr = new int[1000];
        for (int i = 0; i < 100000; i++) {
            arr[sc.nextInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (arr[i] != 0) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}
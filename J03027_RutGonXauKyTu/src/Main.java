import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i) == str.charAt(i+1)) {
                    str = str.substring(0, i) + str.substring(i+2);
                    flag = true;
                    break;
                }
            }
        }
        if (str.length()==0){
            System.out.println("Empty String");
        } else System.out.println(str);
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("END")) break;
            String fullName = normalizeName(line);
            System.out.println(fullName);
        }
    }

    public static String normalizeName(String name) {
        String[] words = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase());
            result.append(word.substring(1).toLowerCase());
            result.append(" ");
        }
        return result.toString().trim();
    }
}
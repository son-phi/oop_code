import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> lst = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try{
                Integer.parseInt(s);
            } catch (NumberFormatException e){
                lst.add(s);
            }
        }
        Collections.sort(lst);
        for (String s : lst) {
            System.out.print(s+" ");
        }
    }
}
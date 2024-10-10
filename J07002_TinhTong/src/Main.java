import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in")) ;
        long sum =0;
        while (sc.hasNext()) {
//            Solution 1:
//            String s = sc.next();
//            try{
//                sum += Integer.parseInt(s);
//            } catch (Exception e){}


//            Solution 2:
            if (sc.hasNextInt()){
                sum += sc.nextInt();
            }else {
                sc.next();
            }
        }
        System.out.println(sum);
    }
}
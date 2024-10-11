import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("44");
            q.add("55");
            while (n>0){
                ArrayList<String> a = new ArrayList<>();
                while(!q.isEmpty()){
                    a.add(q.remove());
                }
                for (String s : a){
                    System.out.print(s+" ");
                    n--;
                    if (n==0){ break;}
                }
                for (String s : a){
                    q.add("4"+s+"4");
                }
                for (String s : a){
                    q.add("5"+s+"5");
                }
            }
            System.out.println();
        }
    }
}
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lst.add(sc.nextInt());
            }
            Collections.sort(lst);
            TreeSet<Integer> set = new TreeSet<>(lst);
            for (int value : set){
                if (value % 2 == 0) System.out.printf("%d ",value);
            }
            System.out.println();
            Iterator<Integer> descending = set.descendingIterator();
            while (descending.hasNext()) {
                int value = descending.next();
                if (value % 2 != 0) System.out.printf("%d ",value);
            }
            System.out.println();
        }
    }
}
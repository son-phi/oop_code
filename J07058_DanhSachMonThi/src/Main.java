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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<MonThi> lst = new ArrayList<MonThi>();
        while (n-- > 0) {
            String id= sc.nextLine();
            String name = sc.nextLine();
            String hinhThuc = sc.nextLine();
            lst.add(new MonThi(id, name, hinhThuc));
        }

        Collections.sort(lst);
        for (MonThi monThi : lst) {
            System.out.println(monThi.toString());
        }
    }
}

class MonThi implements Comparable<MonThi> {
    private String id;
    private String name;
    private String hinhThuc;
    public MonThi(String id, String name, String hinhThuc) {
        this.id = id;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, hinhThuc);
    }

    @Override
    public int compareTo(MonThi monThi) {
        return id.compareTo(monThi.id);
    }
}

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
        List<MonHoc> lst = new ArrayList<MonHoc>();
        sc.nextLine();
        while (n-- >0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            lst.add(new MonHoc(id, name, number));
        }
        Collections.sort(lst);
        for (MonHoc monHoc : lst) {
            System.out.println(monHoc);
        }
    }
}

class MonHoc implements Comparable<MonHoc> {
    private String id;
    private String name;
    private int num;
    public MonHoc(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", id, name, num);
    }
}
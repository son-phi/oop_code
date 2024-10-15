import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Company> lst = new ArrayList<Company>(n);
        while (n-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            lst.add(new Company(id, name, num));
        }
        Collections.sort(lst);
        for (Company c : lst){
            System.out.println(c);
        }
    }
}

class Company implements Comparable<Company> {
    private String id;
    private String name;
    private int amountInternship;
    public Company(String id, String name, int amountInternship) {
        this.id = id;
        this.name = name;
        this.amountInternship = amountInternship;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Company o) {
        return id.compareTo(o.getId());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", id, name, amountInternship);
    }
}
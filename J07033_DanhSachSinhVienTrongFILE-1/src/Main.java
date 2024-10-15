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
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> lst = new ArrayList<Student>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = normalize(sc.nextLine());
            String className = sc.nextLine();
            String email = sc.nextLine();
            lst.add(new Student(name, id, className, email));
        }
        Collections.sort(lst);
        for (Student s : lst) {
            System.out.println(s);
        }
    }

    public static String normalize(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase());
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

class Student implements Comparable<Student> {
    private String name;
    private String id;
    private String className;
    private String email;
    public Student(String name, String id, String className, String email) {
        this.name = name;
        this.id = id;
        this.className = className;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, className, email);
    }

    @Override
    public int compareTo(Student other) {
        return this.id.compareTo(other.id);
    }
}
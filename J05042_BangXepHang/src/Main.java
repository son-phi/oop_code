import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int score = sc.nextInt();
            int submit = sc.nextInt();
            sc.nextLine();
            Student student = new Student(name, score, submit);
            students.add(student);
        }
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private int score;
    private int submit;
    private String name;
    private String firstName;
    private String lastName;

    public String getName(){
        return name;
    }

    public void setFullName() {
        String[] words = this.name.trim().split("\\s+");
        firstName = words[words.length - 1];
        lastName = words[0] + " ";

        for (int i = 1; i < words.length - 1; i++) {
            lastName = lastName + words[i]+" ";
        }
    }

    public Student(String name, int score, int submit) {
        this.name = name;
        this.score = score;
        this.submit = submit;
        setFullName();
    }

    @Override
    public int compareTo(Student other) {
        if (this.score != other.score) {
            return -Integer.compare(this.score, other.score);
        } else if (this.submit != other.submit) {
            return Integer.compare(this.submit, other.submit);
        } else if (this.firstName != other.firstName) {
            return this.firstName.compareTo(other.firstName);
        } else {
            return this.lastName.compareTo(other.lastName);
        }
    }

    @Override
    public String toString() {
        return name + " " + score + " " + submit;
    }
}
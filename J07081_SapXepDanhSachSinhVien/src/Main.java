import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Student> lst = new ArrayList<>();
        while (t-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String phoneNumber = sc.nextLine();
            String email = sc.nextLine();
            lst.add(new Student(id, name, phoneNumber, email));
        }
        Collections.sort(lst);
        for (Student s : lst) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {
    private String idStudent;
    private String nameStudent;
    private String phoneNumber;
    private String email;
    private String firstName;
    private String lastName;
    public Student(String idStudent, String nameStudent, String phoneNumber, String email) {
        this.idStudent = idStudent;
        this.phoneNumber = phoneNumber;
        this.email = email;
        setNameStudent(nameStudent);
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
        String[] words = nameStudent.trim().split(" ");
        int len = words.length;
        this.firstName = words[len-1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len-1; i++) {
            sb.append(words[i]+" ");
        }
        this.lastName = sb.toString();
    }

    @Override
    public int compareTo(Student other) {
        if (this.firstName.compareTo(other.firstName) != 0) {
            return this.firstName.compareTo(other.firstName);
        } else if (this.lastName.compareTo(other.lastName) != 0) {
            return this.lastName.compareTo(other.lastName);
        } else return this.idStudent.compareTo(other.idStudent);
    }

    @Override
    public String toString() {
        return idStudent + " " + nameStudent + " " + phoneNumber + " " + email ;
    }

}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String id = sc.nextLine();
        String birth = sc.nextLine();
        float GPA = sc.nextFloat();
        Student st = new Student(name,birth,GPA,id);
        st.output();
    }
}
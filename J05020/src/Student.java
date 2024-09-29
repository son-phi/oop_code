import java.util.Scanner;

public class Student {
    private String name;
    private String className;
    private String id;
    private String mail;
    public Student(String name, String className, String id, String mail) {
        this.name = name;
        this.className = className;
        this.id = id;
        this.mail = mail;
    }
    public void output(){
        System.out.printf("%s %s %s %s",className, name, id, mail);
    }
    public void input(Scanner sc){
        className = sc.nextLine();
        name = sc.nextLine();
        id = sc.nextLine();
        mail = sc.nextLine();
    }

}

import java.util.Scanner;

public class Student {
    String code;
    String name;
    int birthYear;
    String address;

    void input(){
        Scanner sc = new Scanner(System.in);
        code = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        birthYear = sc.nextInt();
        sc.nextLine();
        address = sc.nextLine();
    }

    void output(){
        System.out.print("Code : " + code);
        System.out.print("Name : " + name);
        System.out.print("Birth Year : " + birthYear);
        System.out.print("Address : " + address);
    }
}

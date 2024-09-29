//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();
        float p3 = sc.nextFloat();
        Student st = new Student(name, birth, p1, p2, p3);
        st.output();
    }
}

class Student {
    private String name;
    private String birth;
    private float GPA;
    private float p1;
    private float p2;
    private float p3;
    public Student(String name, String birth, float p1, float p2, float p3 ) {
        this.name = name;
        this.birth = chuanHoa(birth);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.GPA = p1 + p2 + p3;
    }
    public void input(Scanner sc){
//        sc.nextLine();
        name = sc.nextLine();
        birth = sc.nextLine();
        GPA = sc.nextFloat();
    }
    public void output(){
        System.out.printf("%s %s %.1f", name, birth, GPA);
    }
    private String chuanHoa(String s){
        String[] arr = s.split("/");
        if(arr[0].length()==1){
            arr[0] = "0"+arr[0];
        }
        if(arr[1].length()==1){
            arr[1] = "0"+arr[1];
        }
        String res = arr[0]+"/"+arr[1]+"/"+arr[2];
        return res;
    }

}


import java.util.Scanner;

public class Student {
    private String name;
    private String birth;
    private float GPA;
    private String className;
    public Student(String name, String birth, float GPA, String className) {
        this.name = name;
        this.birth = chuanHoa(birth);
        this.GPA = GPA;
        this.className = className;
    }
    public void input(Scanner sc){
//        sc.nextLine();
        name = sc.nextLine();
        className = sc.nextLine();
        birth = sc.nextLine();
        GPA = sc.nextFloat();
    }
    public void output(){
        System.out.printf("B20DCCN001 %s %s %s %.2f", name, className, birth, GPA);
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

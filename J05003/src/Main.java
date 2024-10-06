import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String name = sc.nextLine();
            String className = sc.nextLine();
            String DOB = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            Student student = new Student(name, className, DOB, price);
            System.out.println(student);
        }
    }
}

class Student {
    private String id;
    private String name;
    private String className;
    private String DOB;
    private double score;
    public static int stt = 0;
    public Student(String name, String className, String DOB, double score) {
        stt++;
        this.id = String.format("B20DCCN%03d",stt);
        this.name = name;
        this.className = className;
        this.DOB = setD0B(DOB);
        this.score = score;
    }

    public String setD0B(String D0B) {
        String[] split = D0B.split("/");
        String res = "";
        if (split[0].length() !=2){
            res = "0" + split[0]+"/";
        } else { res = split[0]+"/";}

        if (split[1].length() !=2){
            res += "0" + split[1]+"/";
        } else { res += split[1]+"/";}
        res += split[2];
        return res;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f",this.id,this.name,this.className,this.DOB,this.score);
    }
}
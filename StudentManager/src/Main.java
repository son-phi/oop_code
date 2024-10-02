//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1001, "Quynh", -1,"Ha Noi", -3);
        System.out.println(st1.getId());
        System.out.println(st1.getAge());//print 0 cuz default = 0
        System.out.println(st1.getScore());//print 0 cuz default = 0
    }
}


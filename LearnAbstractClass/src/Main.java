//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Customer(500, "Nguyen Van A", "Ha Noi");
        person1.display();

        person1 = new Employee(8000, "Tran Van B", "Hai Phong");
        person1.display();
    }
}
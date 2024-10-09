
public class Main {
    public static void main(String[] args) {
        Student st = new Student("Khanh", 23, "Hanoi", 3.5);
        Teacher teacher = new Teacher("Tung", 34, "Ha Noi", 200000);
        st.display();
        teacher.display();
    }
}
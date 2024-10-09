public class Student extends Person {
    private double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4) {
            this.gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + getGpa());
    }
}

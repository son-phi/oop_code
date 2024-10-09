public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

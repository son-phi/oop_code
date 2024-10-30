public class Employee extends Person{
    private int salary;

    public Employee(int salary, String name, String address){
        super(name,address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {}

    @Override
    public void display(){
        System.out.println("Employee name: "+ getName());
        System.out.println("Employee address: "+ getAddress());
        System.out.println("Employee salary: "+ getSalary());
    }
}

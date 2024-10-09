public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        setBonus(bonus);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if ( bonus < 0) {
            this.bonus = 0;
        } else {
            this.bonus = bonus;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();

        if (width > 0 && height > 0) {
            Rectangle rec = new Rectangle(width, height, color);
            System.out.println(rec);
        } else {
            System.out.println("INVALID");
        }

    }
}

class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getColor() {
        return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public double findArea() {
        return width * height;
    }
    public double findPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }


}
import java.util.Scanner;

public class Rectangle {
    double length;
    double width;

    void getInformation(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    void display(){
        System.out.println("Area: " + getArea() );
        System.out.println("Perimeter: "+ getPerimeter());
    }

    private double getPerimeter() {
        return  (length + width)*2;
    }
    private double getArea() {
        return length * width;
    }
}

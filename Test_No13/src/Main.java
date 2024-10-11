import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Point p[] = new Point[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Point(in.nextInt(), in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }

//    public static void main(String[] args)   {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            Point p[] = new Point[n];
//            for (int i = 0; i < n; i++) {
//                p[i] = new Point(sc.nextInt(), sc.nextInt());
//            }
//            Polygon poly = new Polygon(p);
//            System.out.println(poly.getArea());
//        }
//    }
}

class Point{
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}

class Polygon{
    private Point[] points;
    public Polygon(Point[] points) {
        this.points = points;
    }
    public String getArea(){
        double area = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % n];
            area += current.getX() * next.getY() - current.getY() * next.getX();
        }

        return String.format("%.3f",Math.abs(area)/2.0);
    }

}
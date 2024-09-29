import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-->0){
            double xp1 = sc.nextDouble();
            double yp1 = sc.nextDouble();
            double xp2 = sc.nextDouble();
            double yp2 = sc.nextDouble();

            Point p1 = new Point(xp1,yp1);
            Point p2 = new Point(xp2,yp2);
            double res = p1.distance(p2);
            System.out.printf("%.4f\n",res);
        }

    }
}

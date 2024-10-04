import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long den1 = sc.nextLong();
        Fraction f1 = new Fraction(num1, den1);
        long num2 = sc.nextLong();
        long den2 = sc.nextLong();
        Fraction f2 = new Fraction(num2, den2);
        Fraction res = f1.sum(f2);
        res.in();
    }
}

class Fraction {
    private long numerator;
    private long denominator;
    public Fraction(long numerator, long denominator) {
        long num2 = numerator;
        long den2 = denominator;
        long gcd = gcd(num2, den2);
        this.numerator = (long)num2/gcd;
        this.denominator = (long)den2/gcd;
    }
    public static long gcd(long a, long b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public Fraction sum(Fraction f2) {
        long den = f2.denominator*this.denominator;
        long num = this.numerator*f2.denominator + f2.numerator*this.denominator;

        Fraction res = new Fraction(num, den);
        return res;
    }
    public void in(){
        System.out.println(numerator+"/"+denominator);
    }
}
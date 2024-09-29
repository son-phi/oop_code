public class Fraction {
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
    public void in(){
        System.out.println(numerator+"/"+denominator);
    }


}

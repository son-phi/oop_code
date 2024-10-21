import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

class Pair<T1,T2>{
    private T1 first;
    private T2 second;
    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    public T1 getFirst(){
        return first;
    }
    public T2 getSecond(){
        return second;
    }

    public boolean isPrime(){
        if (first instanceof Integer && second instanceof Integer) {
            int num1 = (Integer) first;
            int num2 = (Integer) second;
            return checkPrime(num1) && checkPrime(num2);
        }
        return false;
    }

    public boolean checkPrime(Integer n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n>1;
    }

    @Override
    public String toString(){
        return  first + " " + second ;
    }
}
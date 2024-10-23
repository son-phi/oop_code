import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int n,k,cnt =0;
    public static int[] a=new int[10];

    public static void print(){
        cnt++;
        for (int i=1;i<=k;i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    public static void Try(int i){
        for (int j= a[i-1]+1; j<=n-k+i; j++ ){
            a[i]=j;
            if (i==k) print();
            else Try(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println();
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}
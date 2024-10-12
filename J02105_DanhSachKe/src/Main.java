import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        byte[][] board = new byte[n][n];
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ",i+1);
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextByte();

                if (board[i][j] == 1 ) {
                    System.out.printf("%d ",j+1);
                }
            }
            System.out.println();
        }
    }
}
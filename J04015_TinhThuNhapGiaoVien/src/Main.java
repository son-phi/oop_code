import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ID = sc.nextLine();
        String name = sc.nextLine();
        int luongCB = sc.nextInt();
        String chucVu = ID.substring(0,2);
        int bacLuong = Integer.parseInt(ID.substring(2, 4));
        int phuCap = 0;
        if (chucVu.equals("HT")) {
            phuCap = 2000000;
        } else if (chucVu.equals("HP")) {
            phuCap = 900000;
        } else if (chucVu.equals("GV")) {
            phuCap = 500000;
        }
        int thuNhap = luongCB*bacLuong + phuCap;

        System.out.printf("%s %s %d %d %d",ID, name, bacLuong, phuCap, thuNhap);
    }
}



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNV = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        while(soNV-- > 0){
            String hoTen = sc.nextLine();
            long LCB = sc.nextLong();
            byte soNgayCong = sc.nextByte();
            sc.nextLine();
            String chucVu = sc.nextLine();
            NhanVien e = new NhanVien(hoTen,LCB, soNgayCong, chucVu);
            arr.add(e);
            e.hienThiThongTin();
        }
    }
}


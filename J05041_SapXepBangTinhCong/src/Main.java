import java.util.ArrayList;
import java.util.Collections;
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
        }
        Collections.sort(arr);
        for(NhanVien nv : arr){
            nv.hienThiThongTin();
        }
    }
}

class NhanVien implements Comparable<NhanVien> {
    private String maNV;
    private String hoTen;
    private long luongCB;
    private byte soNgayCong;
    private String chucVu;
    private long thuong;
    private int phuCap;
    private long thuNhap;
    public static int stt = 0;
    private long luongThang;
    public NhanVien(String hoTen, long luongCB, byte soNgayCong, String chucVu) {
        stt++;
        this.maNV = String.format("NV%02d",stt);
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
        this.thuong = tinhThuong();
        this.phuCap = tinhPhuCap();
        this.thuNhap = tinhThuNhap();
        this.luongThang = (long)(luongCB)*(long)(soNgayCong);
    }

    private long tinhThuong(){
        long luongThang = luongCB * soNgayCong;
        if (soNgayCong >= 25){
            return (long)  (luongThang*0.2);
        } else if (soNgayCong >= 22){
            return (long) (luongThang*0.1);
        } else return 0;
    }
    private int tinhPhuCap(){
        switch (chucVu){
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            default:
                return 150000;
        }
    }
    private long tinhThuNhap(){
        long luongThang = luongCB * soNgayCong;
        return luongThang + thuong +phuCap;
    }

    public void hienThiThongTin(){
        System.out.printf("%s %s %d %d %d %d", maNV,hoTen,luongThang,thuong,phuCap,thuNhap);
        System.out.println();
    }

    public long getThuNhap() {
        return thuNhap;
    }

    @Override
    public int compareTo(NhanVien other) {
        return -Long.compare(this.getThuNhap(), other.getThuNhap());
    }
}


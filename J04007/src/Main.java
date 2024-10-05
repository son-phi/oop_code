import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String dateofbirth = sc.nextLine();
        String address = sc.nextLine();
        String maSoThue = sc.nextLine();
        String signDate = sc.nextLine();
        NhanVien nv = new NhanVien(name, gender, dateofbirth, address, maSoThue, signDate);
        nv.output();
    }
}

class NhanVien {
    private String name;
    private String id;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String maSoThue;
    private String signDate;
    public static int stt =0;
    public NhanVien() {}
    public NhanVien(String name, String gender, String dateOfBirth, String address, String maSoThue, String signDate) {
        stt++;
        this.id = String.format("%05d", stt);
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.maSoThue = maSoThue;
        this.signDate = signDate;
    }
    public void output() {
        System.out.printf("%s %s %s %s %s %s %s", id, name, gender, dateOfBirth, address, maSoThue, signDate);
    }
}
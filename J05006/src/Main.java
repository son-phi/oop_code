import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<NhanVien> lists = new ArrayList<NhanVien>();
        while (t-- > 0) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String DOB = sc.nextLine();
            String address = sc.nextLine();
            String taxCode = sc.nextLine();
            String signedDate = sc.nextLine();
            NhanVien nv = new NhanVien(name, gender, DOB, address, taxCode, signedDate);
            lists.add(nv);
        }
//        List<NhanVien> lists = new ArrayList<NhanVien>();
//        NhanVien nv = new NhanVien("Nguyen Van A", "Nam", "22/10/1982", "Mo Lao-Ha Dong-Ha Noi", "8333012345", "31/12/2013");
//        NhanVien nv1 = new NhanVien("Ly Thi B", "Nu", "15/10/1988", "Mo Lao-Ha Dong-Ha Noi", "8333012345", "31/12/2013");
//        NhanVien nv2 = new NhanVien("Hoang Thi C", "Nam", "04/02/1981", "Mo Lao-Ha Dong-Ha Noi", "8333012345", "31/12/2013");
//        lists.add(nv);
//        lists.add(nv1);
//        lists.add(nv2);
        Collections.sort(lists);
        for (NhanVien n : lists) {
            System.out.println(n);
        }
    }
}

class NhanVien implements Comparable<NhanVien> {
    private String id, name, gender, DOB, address, signedDate, taxCode;
    public static int stt=1;
    public NhanVien(String name, String gender, String DOB, String address, String taxCode, String signedDate) {
        this.id = String.format("%05d", stt++);
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        this.address = address;
        this.signedDate = signedDate;
        this.taxCode = taxCode;
    }

    public String getDOB(){
        return this.DOB;
    }

    @Override
    public int compareTo(NhanVien other) {
        String[] nv = this.getDOB().split("/");
        String[] otherNv = other.getDOB().split("/");
        for (int i = nv.length -1; i >=0; i--) {
            if (nv[i].compareTo(otherNv[i]) != 0) {
                return nv[i].compareTo(otherNv[i]);
            }
        }
        return 0;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", id, name, gender, DOB, address, taxCode, signedDate);
    }
}
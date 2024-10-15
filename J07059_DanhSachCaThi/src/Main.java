import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<CaThi> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String ngayThi = sc.nextLine();
            String gioThi = sc.nextLine();
            String id = sc.nextLine();
            list.add(new CaThi(id,ngayThi, gioThi));
        }
        Collections.sort(list);
        for (CaThi caThi : list) {
            System.out.println(caThi);
        }
    }
}

class CaThi implements Comparable<CaThi> {
    private String id;
    private String classId;
    private String ngayThi;
    private String gioThi;
    private static int stt=0;
    private Time thoiGianThi;
    public CaThi(String classId, String ngayThi, String gioThi) {
        stt++;
        this.id = String.format("C%03d", stt);
        this.classId = classId;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.thoiGianThi = new Time(ngayThi, gioThi);
    }

    @Override
    public int compareTo(CaThi other) {
        return this.thoiGianThi.compareTo(other.thoiGianThi);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s",id, ngayThi, gioThi, classId);
    }
}

class Time implements Comparable<Time> {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    public Time(String ngayThi, String gioThi) {
        setTime(ngayThi, gioThi);
    }

    public void setTime(String ngayThi, String gioThi ){
        String[] ngay = ngayThi.split("/");
        String[] gio = gioThi.split(":");
        setDay(Integer.parseInt(ngay[0]));
        setMonth(Integer.parseInt(ngay[1]));
        setYear(Integer.parseInt(ngay[2]));
        setHour(Integer.parseInt(gio[0]));
        setMinute(Integer.parseInt(gio[1]));
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public int compareTo(Time other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        if (this.day != other.day) {
            return Integer.compare(this.day, other.day);
        }
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        }
        return Integer.compare(this.minute, other.minute);
    }
}

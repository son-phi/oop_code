import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Time> lst = new ArrayList<Time>(t);
        while (t-- > 0) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            lst.add(new Time(hour, minute, second));
        }
        Collections.sort(lst);
        for (Time time : lst) {
            System.out.println(time);
        }
    }
}

class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", hour, minute, second);
    }

    @Override
    public int compareTo(Time other) {
        if (this.getHour() > other.getHour()) {
            return 1;
        } else if (this.getHour() < other.getHour()) {
            return -1;
        } else if (this.getMinute() > other.getMinute()) {
            return 1;
        } else if (this.getMinute() < other.getMinute()) {
            return -1;
        } else if (this.getSecond() > other.getSecond()) {
            return 1;
        } else if (this.getSecond() < other.getSecond()) {
            return -1;
        } else {
            return 0;
        }
    }


}
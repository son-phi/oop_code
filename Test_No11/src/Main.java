import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> lst = new ArrayList<>();
        Pattern timePattern  = Pattern.compile("\\b(\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d{1,3})?[^\\d]?");
        Pattern timePattern2 = Pattern.compile("(?<!\\d)([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)(?:(?:\\.\\d{1,3})?)[\\s\\t\\n.,]?");
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            Matcher m = timePattern2.matcher(line);
            while(m.find()) {
                int hour = Integer.parseInt(m.group(1));
                int minute = Integer.parseInt(m.group(2));
                int second = Integer.parseInt(m.group(3));

                lst.add(new Time(hour, minute, second));
            }
        }
        Collections.sort(lst);
        TreeSet<Time> set = new TreeSet<>(lst);
        for(Time t : set) {
            System.out.println(t);
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

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second) ;
    }

    @Override
    public int compareTo(Time other) {
        if(this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        }
        if(this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        }
        return Integer.compare(this.second, other.second);
    }
}
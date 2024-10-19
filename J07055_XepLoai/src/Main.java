import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>(n);
        while (n-- > 0) {
            String name = normalizeName(sc.nextLine());
            int exerciseScore = Integer.parseInt(sc.nextLine());
            int practiceScore = Integer.parseInt(sc.nextLine());
            int examScore = Integer.parseInt(sc.nextLine());
            students.add(new Student(name, exerciseScore, practiceScore, examScore));
        }
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static String normalizeName(String name) {
        String[] words = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int exerciseScore ;
    private int practiceScore ;
    private int examScore;
    private double averageScore;
    private String rating;
    public static int stt=0;
    public Student(String name, int exerciseScore, int practiceScore, int examScore) {
        stt++;
        this.id = String.format("SV%02d", stt);
        this.name = name;
        this.exerciseScore = exerciseScore;
        this.practiceScore = practiceScore;
        this.examScore = examScore;
        setAverageScore();
        setRating();
    }

    public void setAverageScore() {
        averageScore = (exerciseScore*0.25 + practiceScore*0.35 + examScore*0.4);
    }

    public void setRating() {
        if (this.averageScore >= 8.0){
            rating = "GIOI";
        } else if (this.averageScore >= 6.5){
            rating = "KHA";
        } else if (this.averageScore >= 5.0){
            rating = "TRUNG BINH";
        } else {
            rating = "KEM";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s",id,name,averageScore,rating);
    }

    @Override
    public int compareTo(Student other) {
        return -Double.compare(this.averageScore, other.averageScore);
    }
}
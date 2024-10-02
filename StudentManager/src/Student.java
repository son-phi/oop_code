import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public Student() {}

    public Student(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this.setAge(age);
        this.address = address;
        this.setScore(score);
    }

    public void setId(int id){

    }

    public int getId(){
        return id;
    }

    public void setName(String name){

    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age < 0) System.out.println("Age cannot be negative");
        else this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) System.out.println("Score cannot be negative");
        else this.score = score;
    }

}

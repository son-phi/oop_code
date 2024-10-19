import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<Person> persons = new ArrayList<>();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            persons.add(new Person(normalizeName(line)));
        }
        Collections.sort(persons);
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }

    private static String normalizeName(String name) {
        String[] words = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
            result.append(" ");
        }
        return result.toString().trim();
    }


}

class Person implements Comparable<Person>{
    private String name;
    private String firstName;
    private String lastName;
    public Person(String name) {
        this.name = name;
        getFullName();
    }

    public String getName(){
        return name;
    }

    public void getFullName() {
        String[] words = this.name.trim().split("\\s+");
        firstName = words[words.length - 1];
        lastName = words[0] + " ";

        for (int i = 1; i < words.length - 1; i++) {
            lastName = lastName + words[i]+" ";
        }
    }

    @Override
    public int compareTo(Person other) {
        if (firstName.compareTo(other.firstName) == 0) {
            return lastName.compareTo(other.lastName);
        } else {
            return firstName.compareTo(other.firstName);
        }
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<User> users = new ArrayList<User>();
        while (t-- > 0) {
            String username = sc.next();
            String password = sc.next();
            sc.nextLine();
            users.add(new User(username, password));
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();
            sc.nextLine();
            for (User user : users) {
                if (user.authenticate(username, password)) {
                    user.setLogin();
                }
            }
        }
        for (User user : users) {
            System.out.printf("%d ", user.getLogin());
        }
    }
}

class User{
    private String username;
    private String password;
    private int login = 0;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    public void setLogin() {
        this.login++;
    }
    public int getLogin() {
        return login;
    }
}
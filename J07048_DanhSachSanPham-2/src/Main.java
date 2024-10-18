import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int N = Integer.parseInt(sc.nextLine());
        List<Product> lst = new ArrayList<Product>(N);
        for (int i = 0; i < N; i++) {
            String productCode = sc.nextLine();
            String productName = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int warrantyPeriod = Integer.parseInt(sc.nextLine());
            lst.add(new Product(productCode, productName, price, warrantyPeriod));
        }

        Collections.sort(lst);
        for (Product p : lst) {
            System.out.println(p);
        }
    }
}

class Product implements Comparable<Product> {
    private String productCode;
    private String productName;
    private int price;
    private int warrantyPeriod;
    public Product(String productCode, String productName, int price, int warrantyPeriod) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return productCode + " " + productName + " " + price + " " + warrantyPeriod;
    }

    @Override
    public int compareTo(Product other) {
        if (this.price > other.price) {
            return -1;
        } else if (this.price < other.price) {
            return 1;
        }
        return productCode.compareTo(other.productCode);
    }
}
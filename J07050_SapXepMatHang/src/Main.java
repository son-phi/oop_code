import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<Product>();
        while (n-- > 0) {
            String nameProduct = sc.nextLine();
            String groupProduct = sc.nextLine();
            double  purchase = Double.parseDouble(sc.nextLine());
            double price = Double.parseDouble(sc.nextLine());
            products.add(new Product(nameProduct, groupProduct, purchase, price));
        }
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class Product implements Comparable<Product> {
    private String nameProduct;
    private String groupProduct;
    private double price;
    private double purchase;
    private String id;
    private double profit;
    public static int stt =0;
    public Product(String nameProduct, String groupProduct, double price, double purchase) {
        stt++;
        this.id = String.format("MH%02d", stt);
        this.nameProduct = nameProduct;
        this.groupProduct = groupProduct;
        this.price = price;
        this.purchase = purchase;
        this.profit = purchase-price ;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", id, nameProduct, groupProduct, profit);
    }

    @Override
    public int compareTo(Product other) {
        return -Double.compare(this.profit, other.profit);
    }


}
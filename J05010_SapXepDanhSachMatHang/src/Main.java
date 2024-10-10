import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Product> products = new ArrayList<>();
        while (t-- > 0) {
            String productName = sc.nextLine();
            String unit = sc.nextLine();
            double sellingPrice = sc.nextDouble();
            double purchasePrice = sc.nextDouble();
            sc.nextLine();
            products.add(new Product(productName,unit,sellingPrice,purchasePrice));
        }
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class Product implements Comparable<Product> {
    private int id;
    private String product;
    private String unit;
    private double sellingPrice;
    private double purchasePrice;
    private double profit;
    public static int stt=0;
    public Product(String product, String unit, double sellingPrice, double purchasePrice) {
        stt++;
        setId();
        this.product = product;
        this.unit = unit;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        setProfit();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = stt;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit() {
        this.profit = this.getPurchasePrice() - this.getSellingPrice();
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f", id, product, unit, profit);
    }

    @Override
    public int compareTo(Product other) {
        return -Double.compare(this.getProfit(), other.getProfit());
    }
}
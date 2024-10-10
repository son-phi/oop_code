import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.round;

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
            int purchasePrice = sc.nextInt();
            int quantity = sc.nextInt();
            sc.nextLine();
            products.add(new Product(productName,unit,purchasePrice,quantity));
        }
//        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class Product implements Comparable<Product> {
    private String id;
    private String product;
    private String unit;
    private int sellingPrice;
    private int purchasePrice;
    private int shippingFee;
    private int totalAmount;
    private int quantity;
    private int profit;
    public static int stt=0;
    public Product(String product, String unit, int purchasePrice, int quantity) {
        stt++;
        setId();
        this.product = product;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        setShippingFee();
        setTotalAmount();
        setSellingPrice();
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = String.format("MH%02d",stt);
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

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice() {
        this.sellingPrice = (int)round(this.getTotalAmount() + 0.02*this.getTotalAmount());
    }

    public int getQuantity() {
        return quantity;
    }

    public void setShippingFee(){
        this.shippingFee =  (int)Math.round(this.getPurchasePrice()*this.getQuantity()*(0.05));
    }

    public int getShippingFee() {
        return shippingFee;
    }

    public void setTotalAmount() {
        this.totalAmount = this.getPurchasePrice()*this.getQuantity() + this.getShippingFee();
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getProfit() {
        return profit;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", id, product, unit,shippingFee,totalAmount, sellingPrice);
    }

    @Override
    public int compareTo(Product other) {
        return -Integer.compare(this.getProfit(), other.getProfit());
    }
}
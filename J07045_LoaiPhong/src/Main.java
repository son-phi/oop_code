import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

class LoaiPhong  implements Comparable<LoaiPhong> {
    private String loai;
    private String name;
    private int price;
    private double fee;

    public LoaiPhong(String line){
        String[] words = line.split(" ");
        String loai = words[0];
        String name = words[1];
        int price = Integer.parseInt(words[2]);
        double fee = Double.parseDouble(words[3]);
        setLoai(loai);
        setName(name);
        setPrice(price);
        setFee(fee);
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return loai + " " + name + " " + price + " " + fee;
    }
}
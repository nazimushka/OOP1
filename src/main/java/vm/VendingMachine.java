package vm;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private final static List<Product> initProducts = new ArrayList<>();

    static {
        initProducts.add(new Product("chips", 4.99));
    }

    public VendingMachine() {
        this(initProducts);
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public VendingMachine(String name, Double price) {
        this.products = new ArrayList<>();
        products.add(new Product(name, price));
    }

    public Product getProductBy(String neededName) {
        for (Product product : products) {
            if (product.getName().contains(neededName)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductBy(Double neededPrice) {
        for (Product product : products) {
            if (product.getPrice().equals(neededPrice)) {
                return product;
            }
        }
        return null;
    }


    public String toString() {
        String result = "";
        for (Product product : products) {
            result = result.concat(product.toString() + "\n");
        }
        return result;
    }
}
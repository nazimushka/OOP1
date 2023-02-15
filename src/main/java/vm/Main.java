package vm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Product chokobar = new Product("choko", 14.99);
        //System.out.println(chokobar.toString());
        //chokobar.setPrice(15.99);
        //System.out.println(chokobar);

        VendingMachine vm1 = new VendingMachine();
        System.out.println(vm1);

        List<Product> prods = new ArrayList<>();
        prods.add(new Product("pie", 2.99));
        prods.add(new Product("ramen", 6.99));
        prods.add(new Product("water", 0.99));
        prods.add(new Milk("fatless milk", 3.49, 0.0));
        prods.add(new Proteinbar("chocolate bar", 2.99, 3.5, 15.0, 3.0));
        VendingMachine vm2 = new VendingMachine(prods);
        System.out.println(vm2);
        //System.out.println(vm2.getProductBy("pie"));
        //System.out.println(vm2.getProductBy(0.99));
    }
}
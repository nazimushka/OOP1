package vm;

public class Product {
    private String name;
    Double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, Double price) {
        this(name);
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double newPrice) {
        if (newPrice <= 0) return;
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %,.2f", this.name, this.price);
    }
}
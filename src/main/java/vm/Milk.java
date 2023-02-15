package vm;

public class Milk extends Product {

    private Double fatness;

    public Milk(String name) {
        super(name);
    }

    public Milk(String name, Double price) {
        super(name, price);
    }

    public Milk(String name, Double price, Double fatness) {
        super(name, price);
        this.fatness = fatness;
    }

    public Double getFatness() {
        return this.fatness;
    }

    public String toString() {
        return String.format("%s, fatness: %,.1f", super.toString(), this.fatness);
    }
}
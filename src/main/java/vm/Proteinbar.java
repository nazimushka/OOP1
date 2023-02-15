package vm;

public class Proteinbar extends Product {

    private Double carbs;
    private Double fats;
    private Double protein;

    public Proteinbar(String name) {
        super(name);
    }

    public Proteinbar(String name, Double price) {
        super(name, price);
    }

    public Proteinbar(String name, Double price, Double carbs, Double fats, Double protein) {
        super(name, price);
        this.carbs = carbs;
        this.fats = fats;
        this.protein = protein;
    }

    public String toString() {
        return String.format("%s, carbs: %,.1f, fats: : %,.1f, protein: : %,.1f",
                super.toString(), this.carbs, this.fats, this.protein);
    }
}
package sem2task2;

public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable {

    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public Integer runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Krya";
    }

    @Override
    public float swimSpeed() {
        return 10.2f;
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}

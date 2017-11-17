package domain;

public class SmallToy extends Toy {

    public SmallToy() {
    }

    public SmallToy(String name, int price, int ageRestrictions) {
        super(name, price, ageRestrictions);
    }

    public int getTotalPrice() {
        return this.getPrice() / 2;
    }

}
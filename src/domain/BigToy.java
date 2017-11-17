package domain;

public class BigToy extends Toy {

    public BigToy() {
    }

    public BigToy(String name, int price, int ageRestrictions) {
        super(name, price, ageRestrictions);
    }

    public int getTotalPrice() {
        return getPrice() / 2;
    }

}
package creators;

import domain.Toy;

public abstract class ToyBuilder {
    protected Toy toy;

    public Toy getToy() {
        return toy;
    }

    public abstract void buildNewToy();

    public abstract void buildName();

    public abstract void buildPrice();

    public abstract void buildAgeRestrictions();

}
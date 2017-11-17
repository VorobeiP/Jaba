package creators;

import domain.Toy;

public class ToyCreator {
    
    private ToyBuilder toyBuilder;
    
    public void setToyBuilder(ToyBuilder toyBuilder) {
        this.toyBuilder = toyBuilder;
    }

    public Toy getToy() {
        return toyBuilder.getToy();
    }

    public void constructToy() {
        toyBuilder.buildNewToy();
        toyBuilder.buildName();
        toyBuilder.buildPrice();
        toyBuilder.buildAgeRestrictions();
    }
}
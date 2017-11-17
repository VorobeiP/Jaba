package creators;

import java.util.Random;

import domain.BigToy;
import domain.SmallToy;
import domain.Toy;

public class ToyRandomBuilder extends ToyBuilder {
    private Random rand;
    private String names[] = { "ball", "bricks", "toy-car", "lego", "soldier", "puzzle", "catapult" };
    private Class<?> types[] = { Toy.class, BigToy.class, SmallToy.class };


    public ToyRandomBuilder(){
        rand = new Random();
    }

    public void buildNewToy() {
        int i = rand.nextInt(3);        
        try {
			toy =(Toy) types[i].newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
    };

    public void buildName() {
        int i = rand.nextInt(names.length);
        toy.setName(names[i]);
    };

    public void buildPrice() {
        toy.setPrice((rand.nextInt(11) + 1) * 10);//10,20,...100
    };

    public void buildAgeRestrictions() {
        toy.setAgeRestrictions(rand.nextInt(5) * 3);//0,3,6,12
    }

}
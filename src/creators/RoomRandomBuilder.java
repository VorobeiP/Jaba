package creators;

import domain.Item;

import java.util.ArrayList;
import java.util.Random;

public class RoomRandomBuilder extends RoomBuilder {
    Random rand;
    ToyCreator toyCreator;

    public RoomRandomBuilder() {
        rand = new Random();
        toyCreator = new ToyCreator();
        toyCreator.setToyBuilder(new ToyRandomBuilder());
    }

    public void createToysList() {
        ArrayList<Item> toys = new ArrayList<>();
        int i = rand.nextInt(6) + 1;
        for (; i >= 0; i--) {
        	toyCreator.constructToy();
            toys.add(toyCreator.getToy());
        }
        room.setToys(toys);
    };

    public void createName() {
        room.setName("room:" + rand.nextInt(6) + 1);
    };

}
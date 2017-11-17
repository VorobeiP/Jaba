package creators;

import domain.Room;

public abstract class RoomBuilder {
    protected Room room;

    public Room getRoom() {
        return room;
    }

    public void createNewRoom() {
        room = new Room();
    }

    public abstract void createToysList();
    public abstract void createName();

}
package creators;

import domain.Room;

public class RoomCreator {

    private RoomBuilder roomBuilder;

    public void setRoomBuilder(RoomBuilder roomBuilder) {
        this.roomBuilder = roomBuilder;
    }

    public Room getRoom() {
        return roomBuilder.getRoom();
    }

    public void constructRoom() {
        roomBuilder.createNewRoom();
        roomBuilder.createToysList();
        roomBuilder.createName();
    }
}
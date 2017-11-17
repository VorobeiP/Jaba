package storage;

import creators.*;
import domain.Room;
import java.util.ArrayList;

public class ExampleRooms implements IExampleRooms {

    RoomCreator roomCreator;
    int numRooms;

    public ExampleRooms() {
        numRooms = 4;
        roomCreator = new RoomCreator();
        roomCreator.setRoomBuilder(new RoomRandomBuilder());

    }

    @Override
    public ArrayList<Room> read() {
        ArrayList<Room> rooms = new ArrayList<>();
        for (int i = 0; i < numRooms; i++) {
            roomCreator.constructRoom();
            rooms.add(roomCreator.getRoom());
        }
        return rooms;
    }

}

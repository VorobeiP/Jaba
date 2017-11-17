package logic;

import domain.Room;

public interface IFilter {

    boolean isSatisfy(Room room);
    
}
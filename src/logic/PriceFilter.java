package logic;

import java.util.ArrayList;

import domain.Item;
import domain.Room;

public class PriceFilter implements IFilter {
    private int minPrice;
    private int maxPrice;

    public PriceFilter(final Integer minPrice, final Integer maxPrice) {
        if (minPrice <= 0 || minPrice > maxPrice) {
            throw new RuntimeException("Args is null or incorrect!");
        }
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public boolean isSatisfy(Room room) {
        int price = room.getTotalPrice();
        return minPrice <= price && price <= maxPrice;
    }

}
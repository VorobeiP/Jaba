package test;

import domain.Item;
import domain.Room;
import domain.Toy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import logic.IFilter;
import logic.PriceFilter;
import storage.ExampleRooms;

public class Assembly {

	public static void main(String args[]) {
		ExampleRooms ex = new ExampleRooms();
		ArrayList<Room> rooms = ex.read();
		System.out.println(rooms);

		final Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lower boundary of price ");
		Integer minPrice = sc.nextInt();
		System.out.print("Enter the upper boundary of price ");
		Integer maxPrice = sc.nextInt();
		System.out.println("\nRooms appropriate range of price");
		sc.close();

		IFilter filter = new PriceFilter(minPrice, maxPrice);
		ArrayList<Room> inPriceRangeRooms = new ArrayList<Room>();
		for (Room room : rooms) {
			if (filter.isSatisfy(room)) {
				inPriceRangeRooms.add(room);
				System.out.println(room.getName());
			}
		}

		System.out.println("\nToys in rooms  are ordered by price  ");

		for (Room room : inPriceRangeRooms) {
			ArrayList<Toy> toys = room.getToys();
			Collections.sort(toys);
			System.out.println(toys);

		}
	}

}
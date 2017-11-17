package domain;

import java.util.ArrayList;

public class Room {
	private String name;
	private ArrayList<Item> toys;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Toy> getToys() {
		ArrayList<Toy> toys2 = new ArrayList<>();
		for(int i = 0;i<toys.size();i++) {
			toys2.add((Toy) toys.get(i));
		}
		return toys2;
	}

	public void setToys(ArrayList<Item> toys) {
		this.toys = toys;
	}

	public int getTotalPrice() {
		int total = 0;
		for (Item toy : this.toys) {
			total +=  toy.getTotalPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return "room name: " + name + "\n" + "  toys list: " + "\n" + toys +"\t"+  "Total price: "+ getTotalPrice()+"\n";
	}

}
package domain;

public class Toy extends Item {

	private int ageRestrictions;

	public Toy() {
		super();
	}

	public Toy(String name, int price, int ageRestrictions) {
		super(name, price);
		this.ageRestrictions = ageRestrictions;
	}

	@Override
	public String toString() {
		return "    " + this.getClass() + "; " + "name: " + getName() + "; " + "price: " + getTotalPrice() + "; "
				+ "Age Restrictions: " + getAgeRestrictions() + ";\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAgeRestrictions() {
		return ageRestrictions;
	}

	public void setAgeRestrictions(int ageRestrictions) {
		this.ageRestrictions = ageRestrictions;
	}

	public int getTotalPrice() {
		return this.getPrice();
	}

}

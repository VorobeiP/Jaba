package domain;

public abstract class Item implements Comparable<Item>{
	protected String name;
    protected int price;
	   
    public Item() {
		// TODO Auto-generated constructor stub
	}
    
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
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

	
    public abstract int getTotalPrice();

    @Override
	public int compareTo(Item item) {
		if (item == null) throw new NullPointerException("toy == null");
        return  this.getTotalPrice()-item.getTotalPrice();	
	};

}
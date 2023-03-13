package vehicleMangement;

public class Truck extends Vehicle{

	public Truck(String producer, String color, double price) {
		super(producer, color, price);
	}

	@Override
	public void tax() {
		System.out.println("Truck tax is: " + (this.getPrice() * 0.1 + this.getPrice() * 0.02));
	}
}

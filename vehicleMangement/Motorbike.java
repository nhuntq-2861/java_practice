package vehicleMangement;

public class Motorbike extends Vehicle {

	public Motorbike(String producer, String color, double price) {
		super(producer, color, price);
	}

	@Override
	public void tax() {
		System.out.println("Motorbike tax is: " + (this.getPrice() * 0.1 + this.getPrice() * 0.05));
	}
}

package vehicleMangement;

public class Bike extends Vehicle {

	public Bike(String producer, String color, double price) {
		super(producer, color, price);
	}

	@Override
	public void tax() {
		System.out.println("Bike is no tax");
	}
}

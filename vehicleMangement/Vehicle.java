package vehicleMangement;

public abstract class Vehicle {
	private String producer;
	private String color;
	private double price;

	public Vehicle(String producer, String color, double price) {
		this.producer = producer;
		this.color = color;
		this.price = price;
	}


	public abstract void tax();
	

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

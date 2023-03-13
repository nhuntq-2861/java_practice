package Animal;

public class Dog extends Animal {
	private String color;
	private double weight;
	
	public Dog(String name, int age, String gender, String color, double weight) {
		super(name, age, gender);
		this.setColor(color);
		this.setWeight(weight);
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Color: " + this.color);
		System.out.println("Weigth: " + this.weight);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}

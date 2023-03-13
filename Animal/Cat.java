package Animal;

public class Cat extends Animal {
	private String color;
	private double height;
	
	public Cat(String name, int age, String gender, String color, double height) {
		super(name, age, gender);
		this.color = color;
		this.height = height;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Color: " + this.color);
		System.out.println("height: " + this.height);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}

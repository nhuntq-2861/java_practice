package Animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Dog1 = new Dog("Golden", 3, "Russia", "Gold", 10.5);
		Animal Cat1 = new Cat("Bengal", 2, "US", "Yellow", 3.2);
		Dog Dog2 = new Dog("Husky", 2, "Russia", "White", 7.5);
		Cat Cat2 = new Cat("Birman", 1, "UK", "Blue", 1.8);

		Dog1.displayInfo();
		Cat1.displayInfo();
		Dog2.displayInfo();
		Cat2.displayInfo();
	}

}

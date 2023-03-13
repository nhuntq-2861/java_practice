package vehicleMangement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehicle bike = new Bike("Phượng Hoàng", "Red", 2500);
			bike.tax();
			Vehicle motorbike = new Motorbike("SH", "White", 7500);
			motorbike.tax();
			Vehicle truck = new Truck("Toyota", "Black", 6000);
			truck.tax();
			Vehicle bus1 = new GuestBus("Bus1", "Red", 12000, 16);
			bus1.tax();
			Vehicle bus2 = new GuestBus("Bus2", "Yellow", 8000, 4);
			bus2.tax();
	}

}

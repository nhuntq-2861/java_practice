package policevehiclesmanagement;

import java.util.Map;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Owner owner1 = new Owner("36288467392", "Quynh Nhu", "quynhnhu@gmail.com");
		Owner owner2 = new Owner("78288467389", "Quynh Anh", "quynhanh@gmail.com");
		Owner owner3 = new Owner("54288467399", "Quynh Yen", "quynhyen@gmail.com");


		Vehicle car1 = new Car("A123", "Toyota", 2018, "white", owner1, 6, "gasoline");
		Vehicle car2 = new Car("A124", "Honda", 2015, "red", owner2, 4, "electric");
		Vehicle bike1 = new Motorcycle("A456", "Toyota", 2018, "black", owner1, 10);
		Vehicle truck1 = new Truck("A769", "Yamaha", 2020, "blue", owner2, 102);
		Vehicle bike2 = new Motorcycle("A589", "Suzuki", 2011, "white", owner1, 11);

		MainVehicleRegistry obj = new MainVehicleRegistry();
		obj.addVehicle(car1);
		obj.addVehicle(truck1);
		obj.addVehicle(car1);
		obj.addVehicle(bike2);
		obj.addVehicle(bike1);
		System.out.println("Thông tin của xe là:");
		obj.findVehicleByLicenseNumber("A123").hienThiThongTin();
		System.out.println("\n\n");
		
		System.out.println("Danh sách xe sau khi xóa là:");
		obj.removeVehiclesByManufacturer("Honda");

		for (Vehicle vehicle : obj.getVehicles()) {
			vehicle.hienThiThongTin();
		}
		System.out.println("\n\n\n");
		System.out.println("Nhà sản xuất nào có nhiều xe nhất đang được quản lý là:");
		System.out.println(obj.findManufacturerWithMostVehicles());
		System.out.println("\n\n\n");
		
		System.out.println("Danh sách các phương tiện giao thông theo số xe giảm dần là:");
		obj.sortVehiclesByLicenseNumberDescending();
		for (Vehicle vehicle : obj.getVehicles()) {
			vehicle.hienThiThongTin();
		}
		System.out.println("\n\n");
		System.out.println("Thống kê mỗi loại phương tiện có bao nhiêu xe đang được quản lý:");
		Map<String, Integer> vehiclesByTypes = obj.countVehiclesByType();
		vehiclesByTypes.forEach((k, v) ->{
			System.out.println("Loại " + k + " - số lượng: " + v);
		});

	}

}
package policevehiclesmanagement;

import java.util.Comparator;

public abstract class Vehicle implements Comparable<Vehicle>, Comparator<Vehicle> {
	private String licenseNumber;
	private String manufacturer;
	private int year;
	private String color;
	private Owner owner;



	public Vehicle(String licenseNumber, String manufacturer, int year, String color, Owner owner) {
		this.licenseNumber = licenseNumber;
		this.manufacturer = manufacturer;
		this.year = year;
		this.color = color;
		this.owner = owner;
	}

	public abstract void hienThiThongTin();

	@Override
	public int compareTo(Vehicle other) {
		return other.licenseNumber.compareTo(this.licenseNumber);
	}

	@Override
	public int compare(Vehicle a, Vehicle b) {
		return b.licenseNumber.compareTo(a.getLicenseNumber());
	}

	public void loaiPhuongTien() {
		System.out.println(this.getClass().toString());
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}

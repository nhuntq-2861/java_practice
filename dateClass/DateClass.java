package dateClass;

import java.util.Scanner;

public class DateClass {

	public static void main(String[] args) {
		int date, month, year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input date: ");
		date = scanner.nextInt();
		System.out.println("Input month: ");
		month = scanner.nextInt();
		System.out.println("Input year: ");
		year = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (date > 0 && date <= 31) {
				System.out.println("Ngày tháng năm hợp lệ");

				break;
			} else {
				System.out.println("Ngày tháng năm không hợp lệ");

				break;

			}
		case 4:
		case 6:
		case 9:
		case 11:

			if (date <= 30 && date > 0) {
				System.out.println("Valid date");
				break;
			} else {
				System.out.println("Invalid date");
				break;
			}

		case 2:
			if (date <= 28 && date > 0) {
				System.out.println("Valid date");
				break;
			}

			else {
				System.out.println("Invalid date");
				break;
			}

		default:
			System.out.println("Invalid date");
			break;
		}


		if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
			System.out.println("This is a leap year");
		} else {
			System.out.println("This is not a leap year");
		}

	}
}

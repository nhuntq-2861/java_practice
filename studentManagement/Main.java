package studentManagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School school = new School();
		school.addStudent(new Student("Nguyen Thi Anh", 17, "Hue"));
		school.addStudent(new Student("Nguyen Thi Ha", 23, "Da Nang"));
		school.addStudent(new Student("Tran Van Thien", 20, "Hue"));
		school.addStudent(new Student("Dang Thi Dung", 29, "Quang Ninh"));
		school.addStudent(new Student("Ho Thi Anh Tam", 20, "Quang Ngai"));
		school.addStudent(new Student("Tran Thi Giang", 23, "Da Nang"));

		System.out.println("List of students with 20 years old:");
		for (Student student : school.getStudentList()) {
			if (student.getAge() == 20) {
				student.displayInfo();
			}
		}
		int count = 0;
		for (Student student : school.getStudentList()) {
			if (student.getAge() == 23 && student.getAddress() == "Da Nang") {
				count += 1;
			}
		}
		System.out.println("Number of students with 23 years old and Address in Da Nang: " + count);
	}

}

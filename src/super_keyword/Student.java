package super_keyword;

public class Student extends Person {

	double gpa;

	public Student(String firstName, String lastName, double gpa) {
		super(firstName, lastName);
		this.gpa = gpa;
	}

	void showGPA() {
		System.out.println(firstName + "'s GPA is " + gpa);
	}
}

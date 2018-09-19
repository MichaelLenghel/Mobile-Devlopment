public class Person {
	private String name;
	private String gender;

	Person(String name, String gender) {
		this.setName(name);

		if (gender.equals('M') || gender.equals('F')) {
			System.out.println("Please insert correct gender");
		}
		else {
			this.setGender(gender);
		}
	}//end constructor

	public String toString() {
		return "Name = " + getName() + "\nGender = " + getGender() + "\n";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}//end class

class Student extends Person implements PublishDetails {
    private int studentID;
	// Of type class, not object
 	public static int studentIDCounter = 0;
    
	Student(String name, String gender, int studentIDCounter) {
		super(name, gender);
		studentIDCounter += 1;
		studentID = studentIDCounter;
		//this.setStudentID(studentID);
	}
	
	public void getCourseCode()
	{
		System.out.println("\n Student code: " + getStudentID()  + "\n");
	}
	
	public void confirmDetails()
	{
		System.out.println("\n Student Name: " + super.getName()  + "\n");
	}

	public String toString() {
		return "Name = " + super.getName() + "\nGender = " + getGender() + "\n" + "StudentID = " + getStudentID() + "\n";
	}

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}
}
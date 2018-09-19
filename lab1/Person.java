public class Person {
	private String name;
	private String gender;

	Person(String name, String gender) {
		this.name = name;

		if (gender.equals('M') || gender.equals('F')) {
			System.out.println("Please insert correct gender");
		}
		else {
			this.gender = gender;
		}
	}//end constructor

	public String toString() {
		return "Name = " + name + "\nGender = " + gender + "\n";
	}

    public static void main(String[] args) {
    	Person person1 = new Person("John", "M");
    	Person person2 = new Person("Mia", "F");
    	System.out.print(person1);
    	System.out.print(person2);
    	
    	Student student1 = new Student("Jim", "M", "C121342");
    	System.out.println(student1);
	}//end main
}//end class

class Student extends Person {
    private String studentID;
    private String name;
	private String gender;
    
	Student(String name, String gender, String studentID) {
		super(name, gender);
		this.studentID = studentID;
	}

	public String toString() {
		return "Name = " + name + "\nGender = " + gender + "\n" + "StudentID = " + studentID + "\n";
	}
}
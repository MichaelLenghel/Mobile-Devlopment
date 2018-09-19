public class Control {
    public static void main(String[] args) {
    	Person person1 = new Person("John", "M");
    	Person person2 = new Person("Mia", "F");
    	System.out.print(person1);
    	System.out.print(person2);
    	
    	Student student1 = new Student("Jim", "M", 121342);
    	System.out.println(student1);
    	student1.getCourseCode();
    	student1.confirmDetails();
    	
    	if (student1 instanceof Student)
    	{
    		System.out.println("student1 is of type Student\n");
    	}
    	
    	if (student1 instanceof PublishDetails)
    	{
    		System.out.println("student1 is of type publish details\n");
    	}
    	else
    	{
    		System.out.println("student1 is not of type publish details\n");
    	}
	}//end main
}
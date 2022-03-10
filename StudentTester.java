public class StudentTester {
	public static void main(String args[]) {
		//create an object of Student class
		Student std = new Student();
		//use setter method to test the values
		std.setStudentId(1001);
		std.setName("Jacob");
		std.setQualifyingExamMarks(80);
		std.setResidentialStatus('H');
		std.setyearOfEngg(3);
		//use getter method with proper escape sequences to display values
		System.out.println("Student Name:" + std.getName());
		System.out.println("Student Id:" + std.getStudentId());
		System.out.println("Qualifying marks:" + std.getQualifyingExamMarks() );
		System.out.println("Year of Engineering:" + std.getyearOfEngg() );
		System.out.println("Residential Status:" + std.getResidentialStatus() );
		//create an object of Student class
				Student std1 = new Student();
				//use setter method to test the values
				std1.setStudentId(1002);
				std1.setName("Peter");
				std1.setQualifyingExamMarks(83);
				std1.setResidentialStatus('D');
				std1.setyearOfEngg(2);
				//use getter method with proper escape sequences to display values
				System.out.println("Student Name:" + std1.getName());
				System.out.println("Student Id:" + std1.getStudentId());
				System.out.println("Qualifying marks:" + std1.getQualifyingExamMarks() );
				System.out.println("Year of Engineering:" + std1.getyearOfEngg() );
				System.out.println("Residential Status:" + std1.getResidentialStatus() );
				
		
		
		
	}
}

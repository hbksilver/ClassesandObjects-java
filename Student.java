

public class Student { //class
	private int studentId; //variables/states
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	public int getStudentId() { //behavior/methods: getter
		return studentId;
	}
	public void setStudentId(int newStudentId) {//setter 
		this.studentId = newStudentId;
	}
	public String getName() { //getter
		return name;
	}
	public void setName(String newName) { //setter
		this.name = newName;
	}
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	public void setQualifyingExamMarks(float newQualifyingExamMarks) { //setter
		this.qualifyingExamMarks = newQualifyingExamMarks;
	}
	public char getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(char newResidentialStatus) { //setter
		this.residentialStatus = newResidentialStatus;
	}
	public int getyearOfEngg() {
		return yearOfEngg;
	}
	public void setyearOfEngg(int newYearOfEngg) { //setter
		this.yearOfEngg = newYearOfEngg;
	}
}
	
package students;

public class Student {
	
	private String FName;
	private String LName;
	private int Number;
	private double Note;
	
	


	public Student() {
		
	}
	public Student(String fName, String lName, int number, double note) {
		
		FName = fName;
		LName = lName;
		Number = number;
		Note = note;
	}


	

	public String toString() {
		return  FName + "," + LName + "," + Number + "," + Note;
	} 
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public double getNote() {
		return Note;
	}
	public void setNote(double note) {
		Note = note;
	}
	
	

}

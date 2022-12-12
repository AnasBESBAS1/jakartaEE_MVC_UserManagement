package students;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StudentsGroup {
	private List<Student> students = new ArrayList<>();
	
	public StudentsGroup() {
		
	}
	
	
//----------	getStudent---------------
	public Student getStudent(int i) {

		return students.get(i);
	}
//-----------Ajout------------------------
	public void addStudent(Student student) {
		students.add(student);
	}
//----------------Nombre d'etudiants-------
	public int getStudentsNumber() {
		int i = 0;

		for (Student student : students) {
			i++;
		}
		//System.out.println(i);
		return i;
	}
//-----------------toString----------------
	public String toString() {

		for (Student student : students) {

			student.toString();
			System.out.println(student);
		}
		return students.toString();
	}
	
	
	//getters setters---------------------

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	
	
}

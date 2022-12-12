package students;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class StudentManager {

	private StudentsGroup students = new StudentsGroup();

	public StudentManager(InputStream users_db) {

		Scanner scanner = new Scanner(users_db);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] parts = line.split("[,]");

			Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]));

			students.addStudent(student);

		}
	}
	
	
	public StudentsGroup getStudents() {
		return students;
	}


	public void setStudents(StudentsGroup students) {
		this.students = students;
	}


	public void setStudent(Student student) throws IOException {
		
		//FileWriter fichier = new FileWriter("/WEB-INF/students/students.txt",true);
		//BufferedWriter output = new BufferedWriter(fichier);
		//String data = student.toString();
		//byte[] dataBytes = data.getBytes();
		//os.write(dataBytes);
		students.addStudent(student);
	//appel super
		
	}

	public double getMoyenne() {
		
		double somme = 0;
		double moyenne = 0;
		
		for (int i = 0; i < students.getStudentsNumber(); i++) {
			somme += students.getStudent(i).getNote();
		}
		System.out.println(students.getStudentsNumber());
		System.out.println(somme);
		moyenne = somme / students.getStudentsNumber();
		return moyenne;

	}
	
	
}

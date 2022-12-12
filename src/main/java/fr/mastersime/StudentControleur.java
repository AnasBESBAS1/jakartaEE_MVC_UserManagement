package fr.mastersime;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import students.Student;
import students.StudentManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class StudentControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentManager manager;
	private String path;
	private InputStream students_db;
	OutputStream os;
	private String fileReal;

	public StudentControleur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		path = "/WEB-INF/students/students.txt";
		students_db = config.getServletContext().getResourceAsStream(path);
		fileReal = config.getServletContext().getRealPath(path);
		manager = new StudentManager(students_db);
		String absoluteFooWebPath = config.getServletContext().getRealPath(fileReal);
		System.out.println("Path is:- "+absoluteFooWebPath);
		System.out.println("Path is:- "+absoluteFooWebPath);
		System.out.println("Path is:- "+absoluteFooWebPath);
		System.out.println("Path is:- "+absoluteFooWebPath);
		System.out.println("Path is:- "+absoluteFooWebPath);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	

		if ( request.getParameter("firstname").equals("") || request.getParameter("lastname").equals("") || request.getParameter("ID").equals("")
				|| request.getParameter("Mark").equals("")) {
			doGet(request, response);
		} else {
			String FName = request.getParameter("firstname");
			String LName = request.getParameter("lastname");
			int ID = Integer.parseInt(request.getParameter("ID"));
			double Mark = Double.parseDouble(request.getParameter("Mark"));
			Student student = new Student(FName, LName, ID, Mark);
			manager.setStudent(student);
			request.setAttribute("Students", manager);
			 File file= new File(fileReal.toString());
			 FileOutputStream fop = new FileOutputStream(file,true);
		     if (file.exists()) {
		    	 String contenu = "\n544,navlova,789123,1634";
		    	 byte[] contenuEnBytes = contenu.getBytes();
		    	 fop.write(contenuEnBytes);
		    	 fop.close();
		    	 }
			request.getRequestDispatcher("/WEB-INF/students.jsp").forward(request, response);
		}

		
	}

}

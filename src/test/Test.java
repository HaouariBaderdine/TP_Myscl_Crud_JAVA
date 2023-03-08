package test;

//import controller.ConnexionBD;
import controller.StudentDAO;
import model.Student;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConnexionBD conn = new ConnexionBD();
		
		//conn.miseAJour("insert into Student values (2, 'Aya')");
		
		//conn.lire("select * from Student");
		
		Student e = new Student(4, "samia");
		
		StudentDAO dao = new StudentDAO(e);
		
		dao.create();
		
		dao.delete(3);
		
		dao.update(e);
		
		dao.read();
		
		
	}
	
}

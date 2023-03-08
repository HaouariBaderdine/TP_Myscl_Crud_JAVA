package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Student;

public class StudentDAO {
	
	ConnexionBD conn = new ConnexionBD();
	
	Student e;
	
	public StudentDAO(Student e) {
		this.e = e;
	}
	
	public void read() {
		try {
			
			String req = "select * from Student";
			
			conn.lire(req);
			
		}catch(Exception e) {
			System.err.println("Select incorrecte");
		}
	}

	public void create() {
		try {
			
			String req = "INSERT INTO Student " +
	                   "VALUES ("+ this.e.getIdS()+",'"+ this.e.getNameS()+"')";
			
			conn.miseAJour(req);
			
		}catch(Exception e) {
			System.err.println("Creation incorrecte");
		}
	}
	
	public void delete(int id) {
		try {
			
			String req = "delete from Student " +
	                   "where (idS = "+ id +")";
			
			conn.miseAJour(req);
			
		}catch(Exception e) {
			System.err.println("delete incorrecte");
		}
	}
	
	public void update(Student e) {
		try {

			String req = "update Student set nameS = '"+e.getNameS() +
	                   "' where idS = "+ e.getIdS() +"";
			
			conn.miseAJour(req);
			
		}catch(Exception ex) {
			System.err.println("delete incorrecte");
		}
	}

}

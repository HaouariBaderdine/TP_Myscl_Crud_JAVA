package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionBD {
	
	public Connection connexion;
	public Statement instruction;
	public ResultSet res;
	
	public ConnexionBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Ok");
			
			connexion = DriverManager.getConnection("jdbc:mysql://localhost/ii2gl","root","0000");
			instruction = connexion.createStatement();
			System.out.println("Connexion ok");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Problème de pilote");
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			System.err.println("Problème de pilote");
		}
	}
	
	public void lire(String req) {
		try {
			res = instruction.executeQuery(req);
			
			int i = 0;
			
			while(res.next()) {
				int num = res.getInt("idS");
				String ch = res.getString("nameS");
				System.out.println("Ligne " +i+" : "+"Num: "+num+" || Name: "+ch);
				i++;
			}
			
		}catch(SQLException e) {
			System.err.println("Requete lire incorrecte"+req);
		}
	}

	public void miseAJour(String req) {
		try {
			instruction.executeUpdate(req);
			
		}catch(SQLException e) {
			System.err.println("Requete miseAJour incorrecte"+req);
		}
	}
}

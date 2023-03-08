package model;

public class Student {
	
	public int idS;
	
	public String nameS;

	public Student(int idS, String nameS) {
		super();
		this.idS = idS;
		this.nameS = nameS;
	}

	public int getIdS() {
		return idS;
	}

	public void setIdS(int idS) {
		this.idS = idS;
	}

	public String getNameS() {
		return nameS;
	}

	public void setNameS(String nameS) {
		this.nameS = nameS;
	}

}

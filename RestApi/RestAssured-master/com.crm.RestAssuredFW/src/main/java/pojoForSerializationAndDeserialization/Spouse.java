package pojoForSerializationAndDeserialization;

public class Spouse {
	
	String Sname;
	int Sphno;
	/**
	 * @param sname
	 * @param sphno
	 */
	public Spouse(String sname, int sphno) {
		super();
		Sname = sname;
		Sphno = sphno;
	}
	
	
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSphno() {
		return Sphno;
	}
	public void setSphno(int sphno) {
		Sphno = sphno;
	}
	

}

package pojoForSerializationAndDeserialization;

public class EmployeedtailsWithobject {

	// Declare all the necessary variable as global
	String name;
	String empid;
	String Designation;
	int[] phno;
	Object spouse;
	/**
	 * @param name
	 * @param empid
	 * @param designation
	 * @param phno
	 * @param spouse
	 */
	// create a constructor to initialize these variables
	public EmployeedtailsWithobject(String name, String empid, String designation, int[] phno, Object spouse) {
		super();
		this.name = name;
		this.empid = empid;
		Designation = designation;
		this.phno = phno;
		this.spouse = spouse;
	}
	
	public EmployeedtailsWithobject() {
		
	}
	//provoid getters and setters to access these variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int[] getPhno() {
		return phno;
	}
	public void setPhno(int[] phno) {
		this.phno = phno;
	}
	public Object getSpouse() {
		return spouse;
	}
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
	
}



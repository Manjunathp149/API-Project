package pojoForSerializationAndDeserialization;

public class EmployeeDetailsWithArray {
	
	// Declare all the necessary variable as global
	String Empname;
	String Empid;
	String Designation;
	int[] Phno;
	String[] email;
	
	// create a constructor to initialize these variables
	/**
	 * @param empname
	 * @param empid
	 * @param designation
	 * @param phno
	 * @param email
	 */
	public EmployeeDetailsWithArray(String empname, String empid, String designation, int[] phno, String[] email) {
		super();
		Empname = empname;
		Empid = empid;
		Designation = designation;
		Phno = phno;
		this.email = email;
	
	}
	
	
	public EmployeeDetailsWithArray() {}
	//provoid getters and setters to access these variables
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int[] getPhno() {
		return Phno;
	}
	public void setPhno(int[] phno) {
		Phno = phno;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	

}

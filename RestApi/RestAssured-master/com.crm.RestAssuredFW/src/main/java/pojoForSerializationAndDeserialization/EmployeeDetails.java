package pojoForSerializationAndDeserialization;

/**
 * 
 * @author 91636
 *
 */
public class EmployeeDetails {
	
	// Declare all the necessary variable as global
	String Empname;
	String Empid;
	String email;
	int phno;
	String Designation;
	
	// create a constructor to initialize these variables
	public EmployeeDetails(String empname, String empid, String email, int phno, String designation) {

		Empname = empname;
		Empid = empid;
		this.email = email;
		this.phno = phno;
		Designation = designation;
	}
	
	//create an empty constructor for deserialisation
	public EmployeeDetails() {
		
	}
	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
	
	
}

package projSerializationDeserialization;

/**
 * 
 * @author Reshma
 *
 */

public class EmpDetails {
	/**
	 * Employee Details
	 */
	
	//Create empty constructor to fectch details
	public EmpDetails()
	{
		
	}
	
	//step1:Declare all the necessary variables as global
	String Empname;
	String EmpID;
	String Email;
	int phonenumber;
	String designation;
	
	//Step2:Create constructor to initialize the variables
	
	
		
		
	public EmpDetails(String empname, String empID, String email, int Phonenumber, String designation) {
		Empname = empname;
		EmpID = empID;
		Email = email;
		phonenumber = Phonenumber;
		this.designation = designation;
	}

	
	//Select Getters and Setters
	public String getEmpname() {
		return Empname;
	}

	public String getEmpID() {
		return EmpID;
	}

	public String getEmail() {
		return Email;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public void setEmpID(String empID) {
		EmpID = empID;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setPhoneno(int phoneno) {
		this.phonenumber = phoneno;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	
}

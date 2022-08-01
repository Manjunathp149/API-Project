package projSerializationDeserialization;

public class EmpDetailsArray {

	//Dec
	String Empname;
	String EmpID;
	String[] Empmail;
	int[] Phoneno;
	String Designation;
	
	//Create an empty constructor
	public EmpDetailsArray()
	{
		
	}
	
	
	//Create a constructor for initialization
	public EmpDetailsArray(String empname, String empID, String[] empmail, int[] phoneno, String designation) {
		super();
		Empname = empname;
		EmpID = empID;
		Empmail = empmail;
		Phoneno = phoneno;
		Designation = designation;
	}


	
	//Create Getters and setters for the variables

	public String getEmpname() {
		return Empname;
	}


	public String getEmpID() {
		return EmpID;
	}


	public String[] getEmpmail() {
		return Empmail;
	}


	public int[] getPhoneno() {
		return Phoneno;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setEmpname(String empname) {
		Empname = empname;
	}


	public void setEmpID(String empID) {
		EmpID = empID;
	}


	public void setEmpmail(String[] empmail) {
		Empmail = empmail;
	}


	public void setPhoneno(int[] phoneno) {
		Phoneno = phoneno;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
}

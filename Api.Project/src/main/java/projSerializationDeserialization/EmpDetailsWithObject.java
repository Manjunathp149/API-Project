package projSerializationDeserialization;

public class EmpDetailsWithObject {

	
	public EmpDetailsWithObject()
	{

	}
	//Declare all variables as global
	
	String Name;
	String EmpId;
	String Email;
	int Phoneno;
	Object Spouse;
	
	
	//Create Constructors for the variables
	
	public EmpDetailsWithObject(String name, String empId, String email, int phoneno, Object spouse) {
		Name = name;
		EmpId = empId;
		Email = email;
		Phoneno = phoneno;
		Spouse = spouse;
		
		
		//Create getters and setters methods for the variables
		
		
}


	public String getName() {
		return Name;
	}


	public String getEmpId() {
		return EmpId;
	}


	public String getEmail() {
		return Email;
	}


	public int getPhoneno() {
		return Phoneno;
	}


	public Object getSpouse() {
		return Spouse;
	}


	public void setName(String name) {
		Name = name;
	}


	public void setEmpId(String empId) {
		EmpId = empId;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public void setPhoneno(int phoneno) {
		Phoneno = phoneno;
	}


	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}}

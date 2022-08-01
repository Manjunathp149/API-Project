package ProjectLibrary;

public class Projectlibraryclass {

	
	//Step1:Declare all the variables
	String createdBy;
	String projectName;
	String status;
	int teamSize;
	
	
	
	//Step2: Create constructor for the variables 
	public Projectlibraryclass(String createdBy, String projectName, String status, int teamSize) {
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}


	//Step3: Provide Getters and setters for the variables

	public String getCreatedBy() {
		return createdBy;
	}



	public String getProjectName() {
		return projectName;
	}



	public String getStatus() {
		return status;
	}



	public int getTeamSize() {
		return teamSize;
	}



	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
	

}

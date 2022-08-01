package ProjectLibrary;

/**
 * 
 * @author 91636
 *
 */
public class VariableLibrary {

	
	// Declare all the necessary variable as global
	String createdBy;
	String projectName;
	String status;
	int teamSize;
	
	// create a constructor to initialize these variables
	public VariableLibrary(String createdBy, String projectName, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
		
		//provoid getters and setters to access these variables
		
		
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	

	
}

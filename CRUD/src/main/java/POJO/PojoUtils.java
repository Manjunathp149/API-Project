package POJO;

public class PojoUtils {

	
	//Declare all the variables as global
		 String CreatedBy;
		 String ProjectName;
		 String Status;
		 int TeamSize;
		 
		//Create constructors for the variables
		

		public PojoUtils(String createdBy, String projectName, String status, int teamSize) {
			CreatedBy = createdBy;
			ProjectName = projectName;
			Status = status;
			TeamSize = teamSize;
		}

		public String getCreatedBy() {
			return CreatedBy;
		}

		public String getProjectName() {
			return ProjectName;
		}

		public String getStatus() {
			return Status;
		}

		public int getTeamSize() {
			return TeamSize;
		}

		public void setCreatedBy(String createdBy) {
			CreatedBy = createdBy;
		}

		public void setProjectName(String projectName) {
			ProjectName = projectName;
		}

		public void setStatus(String status) {
			Status = status;
		}

		public void setTeamSize(int teamSize) {
			TeamSize = teamSize;
		}
		
		//Provide getters and setters 
		
}

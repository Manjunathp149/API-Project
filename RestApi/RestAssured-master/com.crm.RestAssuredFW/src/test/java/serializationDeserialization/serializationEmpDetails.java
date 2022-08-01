package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeserialization.EmployeeDetails;

public class serializationEmpDetails {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
	//create object of pojo class  and initialize
	EmployeeDetails emp= new EmployeeDetails("Shri", "Shri123", "shrishyla888@gmail.com", 12345, "Sr Test Eng");
	
	//create object of object mapper class
	ObjectMapper obj=new ObjectMapper();
	
	//from object mapper call the method writeValue
	obj.writeValue(new File("./EmpDetails.json"), emp);
	
}
}

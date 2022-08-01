package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeserialization.EmployeeDetailsWithArray;

public class serializationEmpDetailsWithArray {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		//create an object of pojo class
		int [] phono= {12345,54321};
		String[] email= {"shri@gmail.com,shri@gmail.com"};
		
		//create object of pojo class  and initialize
		EmployeeDetailsWithArray emp=new EmployeeDetailsWithArray("Shri", "shri123", "Sr Test Eng",phono, email);
		//create object of object mapper class
		ObjectMapper obj=new ObjectMapper();
		//from object mapper call the method writeValue
		obj.writeValue(new File("./EmpArray.json"), emp);
		

	}

	
}

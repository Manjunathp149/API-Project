package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeserialization.EmployeeDetailsWithArray;

public class deSerializationWithArray 
{
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	//create object of object mapper
	ObjectMapper obj=new ObjectMapper();
	
	
	//call the readValue Method and store it in a variable
	EmployeeDetailsWithArray emparr = obj.readValue(new File(".\\EmpArray.json"), EmployeeDetailsWithArray.class);
	
	System.out.println(emparr.getPhno()[1]);
	
}
}

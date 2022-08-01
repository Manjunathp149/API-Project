package SerializationDeserializationTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projSerializationDeserialization.EmpDetails;

public class DeserializationDetails {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
	
	//Step1: create object Objectmapper 
	ObjectMapper obj=new ObjectMapper();
	
	
	//Step2:call the read value method and store in the variable
	EmpDetails emp = obj.readValue(new File("./EmpDetails.json"), EmpDetails.class);
	
	
	//Step3:using getters and setters 
	System.out.println(emp.getDesignation());
	System.out.println(emp.getEmail());
	System.out.println(emp.getEmpID());
	System.out.println(emp.getEmpname());
	System.out.println(emp.getPhonenumber());
	
	
}
}

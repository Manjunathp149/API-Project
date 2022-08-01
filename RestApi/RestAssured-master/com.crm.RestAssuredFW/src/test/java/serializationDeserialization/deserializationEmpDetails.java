package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeserialization.EmployeeDetails;

public class deserializationEmpDetails 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		//create object of object mapper
		ObjectMapper obj=new ObjectMapper();
		
		//call the readValue Method and store it in a variable
		EmployeeDetails emp = obj.readValue(new File(".\\EmpDetails.json"), EmployeeDetails.class);
		
		//
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmail());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getEmpid());
		System.out.println(emp.getPhno());
		
	}

}

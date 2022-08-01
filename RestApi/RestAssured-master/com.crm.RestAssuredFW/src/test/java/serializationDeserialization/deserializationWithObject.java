package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeserialization.EmployeedtailsWithobject;

public class deserializationWithObject {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		//create object of object mapper
		ObjectMapper obj=new ObjectMapper();
		
		//call the readValue Method and store it in a variable
		EmployeedtailsWithobject empobj = obj.readValue(new File(".\\EmpObject.json"), EmployeedtailsWithobject.class);
		
		System.out.println(empobj.getSpouse());
		System.out.println(empobj.getName());
		System.out.println(empobj.getEmpid());
	}

}

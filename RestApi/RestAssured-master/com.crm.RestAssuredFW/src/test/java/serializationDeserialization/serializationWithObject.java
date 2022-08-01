package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeserialization.EmployeedtailsWithobject;
import pojoForSerializationAndDeserialization.Spouse;

public class serializationWithObject {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int[] phno= {12345,98450};
		Spouse sp= new Spouse("abcd", 98450);
		
		//create object of pojo class  and initialize
		EmployeedtailsWithobject emp=new EmployeedtailsWithobject("Shri", "shri123", "Sr QA", phno, sp);
		
		//create object of object mapper class
		ObjectMapper obj =new ObjectMapper();
		
		//from object mapper call the method writeValue
		obj.writeValue(new File("./EmpObject.json"), emp);
		
		
		
	}

}

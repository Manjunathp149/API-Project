package SerializationDeserializationTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projSerializationDeserialization.EmpDetails;

public class SerializationDetails {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
	
	    //Step1:create object of pojo class and initialize the constructor
		EmpDetails emp=new EmpDetails("prashanth", "TY_13234", "manjunath@gmail.com", 123 , "sr.tester");
			
		
		//Step2:Creats object of Object mapper
		ObjectMapper obj=new ObjectMapper();
		
		
		//step3:From object mapper call method
		obj.writeValue(new File("./EmpDetails.json"), emp);
}
}

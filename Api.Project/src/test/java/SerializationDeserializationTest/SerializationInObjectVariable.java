package SerializationDeserializationTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projSerializationDeserialization.EmpDetailsWithObject;
import projSerializationDeserialization.Spouse;

public class SerializationInObjectVariable {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
	Spouse s=new Spouse("Hi", 1324, "YU");
	//Create object for the class
	EmpDetailsWithObject emp=new EmpDetailsWithObject("Manjunath", "TY_1234", "manjunathp149@gmail.com", 1234, s);
	
	//Create object for the Objectmapper
	ObjectMapper obj=new ObjectMapper();
	
	//Create a file and store it
	  obj.writeValue(new File("./EmpObjDetails.json"), emp);
}
}

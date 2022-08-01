package SerializationDeserializationTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projSerializationDeserialization.EmpDetailsWithObject;

public class DeserializationObject {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
	
	//Create Object for Objectmapper
	ObjectMapper obj=new ObjectMapper();
	
	//Read data from Json File
	EmpDetailsWithObject read = obj.readValue(new File(".\\EmpObjDetails.json"), EmpDetailsWithObject.class);

	
	System.out.println(read.getSpouse());
	System.out.println(read.getEmail());
}
}

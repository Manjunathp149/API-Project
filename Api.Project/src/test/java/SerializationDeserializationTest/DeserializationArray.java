package SerializationDeserializationTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projSerializationDeserialization.EmpDetailsArray;

public class DeserializationArray {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
	//Create the objcet for the Objectmapper
	ObjectMapper obj=new ObjectMapper();
	
	//Read the data from json file
	  EmpDetailsArray emp = obj.readValue(new File("./EmpArrayDetails.json"), EmpDetailsArray.class);
	  
	  System.out.println(emp.getEmpmail()[0]);
	  System.out.println(emp.getPhoneno()[1]);
}
}

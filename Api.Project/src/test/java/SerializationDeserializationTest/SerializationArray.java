package SerializationDeserializationTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projSerializationDeserialization.EmpDetailsArray;

public class SerializationArray {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
	//Create an object for pojo class
	String[] Empmail= {"Manjunathp","prashanthp"};
	 int[] phoneno = {1234,1324,65498};
	 EmpDetailsArray emp=new EmpDetailsArray("Manju", "TY_1234", Empmail, phoneno, "Sr.Test");
	 
	 //Create object for Objectmapper
	 ObjectMapper obj=new ObjectMapper();
	 
	 //Write the value in json format
	 obj.writeValue(new File("./EmpArrayDetails.json"), emp);
	 
	 

			
			
			
		
}
}

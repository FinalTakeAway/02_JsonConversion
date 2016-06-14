package com.mk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	public static void main(String[] args) throws JsonProcessingException {
		ModelPojo pojo=new ModelPojo();
		pojo.setName("Mohit");
		pojo.setAge(25);
		
		ObjectMapper mapper = new ObjectMapper();
		//mapper.writeValue(new File("result.json"), myResultObject);
		// or:
		//byte[] jsonBytes = mapper.writeValueAsBytes(myResultObject);
		// or:
		String jsonString = mapper.writeValueAsString(pojo);
		System.out.println("Json : " + jsonString);
	}
}

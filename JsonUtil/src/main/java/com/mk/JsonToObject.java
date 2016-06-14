package com.mk;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonToObject {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		 ObjectMapper mapper = new ObjectMapper();
		 ModelPojo pojo = mapper.readValue("{\"name\":\"Bob\", \"age\":13}", ModelPojo.class);

		 System.out.println("Name : "+ pojo.getName());
		 System.out.println("Age : "+ pojo.getAge());
	}
}

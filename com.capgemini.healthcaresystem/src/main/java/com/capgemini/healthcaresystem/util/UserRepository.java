package com.capgemini.healthcaresystem.util;

import java.util.List;

import com.capgemini.healthcaresystem.dto.UserDto;

import java.util.ArrayList;

public class UserRepository {
	public static List<UserDto> userCollectionObject= new ArrayList<UserDto>();

	public  UserRepository() { // constructor
		UserDto object = new UserDto();
		object.setUsername("Kiran");
		object.setContactNo(8855876618l);
		object.setUsedId("0111");
		 
		userCollectionObject.add(object);
		
		UserDto object2 = new UserDto();
		object2.setUsername("shubhum");
		object2.setContactNo(8855871524l);
		object2.setUsedId("0222");
		
		userCollectionObject.add(object2);
		
		UserDto object3 = new UserDto(); 
		object3.setUsername("sohaib");
		object3.setContactNo(8889027290l);
		object3.setUsedId("0333");
		
		userCollectionObject.add(object3);
		
		UserDto object4 = new UserDto();
		object4.setUsername("swag");
		object4.setContactNo(885541257l);
		object4.setUsedId("04444");
		
		userCollectionObject.add(object4);
	
		// below section prints the result of the objects stored above 
		for(UserDto i: userCollectionObject) {
			System.out.println("the username is: "+ i.getUsername());
			System.out.println("the contact number is: "+ i.getContactNo());
			System.out.println("the userId is: "+ i.getUsedId());
			System.out.println("\n");
			
		}
	}
}

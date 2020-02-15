package com.cg.healthcaresystem.util;

import java.util.List;
import java.util.ArrayList;

import com.cg.healthcaresystem.dto.UserDto;

public class UserUtil {
	public static List<UserDto> userCollectionObject= new ArrayList<UserDto>();

	public void addUserData() {
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
		
		
		for(UserDto i: userCollectionObject) {
			System.out.println("the username is: "+ i.getUsername());
			System.out.println("the contact number is: "+ i.getContactNo());
			System.out.println("the userId is: "+ i.getUsedId());
			System.out.println("\n");

		}
	}
}

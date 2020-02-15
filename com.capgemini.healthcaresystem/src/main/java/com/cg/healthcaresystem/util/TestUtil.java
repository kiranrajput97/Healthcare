package com.cg.healthcaresystem.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.healthcaresystem.dto.TestDto;
import com.cg.healthcaresystem.dto.UserDto;

public class TestUtil {
	public static List<TestDto> testCollectionObject= new ArrayList<TestDto>();

	public void addTestData() {
		TestDto object = new TestDto();
		object.setTestId("test101");
		object.setTestName("testname1");
	
		
		testCollectionObject.add(object);
		TestDto object2 = new TestDto();
		object.setTestId("test102");
		object.setTestName("testname2");
	
	
		testCollectionObject.add(object2);
		
		
		for(TestDto i: testCollectionObject) {
			System.out.println("the username is: "+ i.getTestId());
			System.out.println("the contact number is: "+ i.getTestName());
			System.out.println("\n");

		}
	}

}

package com.cg.healthcaresystem.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.healthcaresystem.dto.TestDto;
import com.cg.healthcaresystem.dto.UserDto;

public class TestUtil {
	public static List<TestDto> testCollectionObject= new ArrayList<TestDto>();


	
/*
 		private static List<TestDto> testCollectionObject= new ArrayList<TestDto>();

	public static List<TestDto> getTestCollectionObject() {
		return testCollectionObject;
	}



	public static void setTestCollectionObject(List<TestDto> testCollectionObject) {
		TestUtil.testCollectionObject = testCollectionObject;
	}

*/

	public  TestUtil() {        // constructor 
		TestDto object = new TestDto();
		object.setTestId("test101");
		object.setTestName("testname1");
	
		
		testCollectionObject.add(object);
		TestDto object2 = new TestDto();
		object.setTestId("test102");
		object.setTestName("testname2");
	
	
		testCollectionObject.add(object2);
		
		TestDto object3 = new TestDto();
		object3.setTestId("test103");
		object3.setTestName("testname3");
	
		testCollectionObject.add(object3);
		
		TestDto object4 = new TestDto();
		object4.setTestId("test104");
		object4.setTestName("testname4");
	
	
		testCollectionObject.add(object4);
		
		// below section prints the result of the objects stored above 
		for(TestDto i: testCollectionObject) {
			System.out.println("the username is: "+ i.getTestId());
			System.out.println("the contact number is: "+ i.getTestName());
			System.out.println("\n");

		}
	}

}

package com.capgemini.healthcaresystem.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.healthcaresystem.dto.TestDto;

public class TestRepository {
	public static List<TestDto> testCollectionObject= new ArrayList<TestDto>();

	public  TestRepository() {        // constructor 
		TestDto object = new TestDto();
		object.setTestId("test101");
		object.setTestName("testname1");
	
		
		testCollectionObject.add(object);
		
		TestDto object2 = new TestDto();
		object2.setTestId("test102");
		object2.setTestName("testname2");
	
	 
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
			System.out.println("the testId is: "+ i.getTestId());
			System.out.println("the testname number is: "+ i.getTestName());
			System.out.println("\n");

		}
	}

}

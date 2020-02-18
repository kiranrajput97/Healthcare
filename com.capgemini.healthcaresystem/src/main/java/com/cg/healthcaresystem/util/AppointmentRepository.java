package com.cg.healthcaresystem.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.cg.healthcaresystem.dto.AppointmentDto;

public class AppointmentRepository {
	
	 public static List<AppointmentDto>  appointmentcollectionObject= new ArrayList<AppointmentDto>();
	      public AppointmentRepository() { 
	    	  new TestRepository();
	    	  new UserRepository();

	    	  DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("dd MM yyyy"); // Definition for local date 
	    
	    	  AppointmentDto object =new AppointmentDto(); 
				 TestRepository testObject = new TestRepository();
				 UserRepository userObject = new UserRepository();
				 object.setUser(userObject.userCollectionObject.get(0));
				 object.setTest(testObject.testCollectionObject.get(0));
				 object.setAppointmentId(1111111111l);
				 object.setDatetime(LocalDate.parse("04 01 1998", myFormat)); // taking local date
				 object.setApproved(true);
				 
				 appointmentcollectionObject.add(object);
		 
				 AppointmentDto object2 =new AppointmentDto(); 
				 TestRepository testObject2 = new TestRepository();
				 UserRepository userObject2 = new UserRepository();
				 object2.setUser(userObject2.userCollectionObject.get(1));
				 object2.setTest(testObject2.testCollectionObject.get(1));
				 object2.setAppointmentId(2222222222l);
				 object2.setDatetime(LocalDate.parse("04 01 2000", myFormat)); // taking local date
				 object2.setApproved(true);
				 
				 appointmentcollectionObject.add(object2);
				 
				 for(AppointmentDto i : appointmentcollectionObject) {
					 System.out.println("user details are : "+ i.getUser());
					 System.out.println("test detaild are : " + i.getTest());
					 System.out.println("the appointment id is : "+ i.getAppointmentId());
					 System.out.println("Date of the test is : "+ i.getDatetime() );
					 System.out.println("the approved status is : "+ i.isApproved());
				 
				 }
	 }


}

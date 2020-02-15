package com.cg.healthcaresystem.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.cg.healthcaresystem.dto.AppointmentDto;

public class AppointmentUtil {
	
	 public static List<AppointmentDto>  appointmentcollectionObject= new ArrayList<AppointmentDto>();
	      public AppointmentUtil() { 
	 
	    	  DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("dd MM yyyy"); // defination for local date 
	    
	    	  AppointmentDto object =new AppointmentDto(); 
				 TestUtil testObject = new TestUtil();
				 UserUtil userObject = new UserUtil();
				 object.setUser(userObject.userCollectionObject.get(0));
				 object.setTest(testObject.testCollectionObject.get(0));
				// object.setUser(userObject.userCollectionObject.get(1));
				 // object.setTest(testObject.testCollectionObject.get(1));
				 object.setAppointmentId(1111111111l);
				 object.setDatetime(LocalDate.parse("04 01 1998", myFormat)); // taking local date
				 object.setApproved(true);
				 
				 appointmentcollectionObject.add(object);
		 
				 AppointmentDto object2 =new AppointmentDto(); 
				 TestUtil testObject2 = new TestUtil();
				 UserUtil userObject2 = new UserUtil();
				 object.setUser(userObject2.userCollectionObject.get(1));
				 object.setTest(testObject2.testCollectionObject.get(1));
				 object.setAppointmentId(2222222222l);
				 object.setDatetime(LocalDate.parse("04 01 2000", myFormat)); // taking local date
				 object.setApproved(true);
				 
				 appointmentcollectionObject.add(object);
				 
				 for(AppointmentDto i : appointmentcollectionObject) {
					 System.out.println("user details are : "+ i.getUser());
					 System.out.println("test detaild are : " + i.getTest());
					 System.out.println("the appointment id is : "+ i.getAppointmentId());
					 System.out.println("Date of the test is : "+ i.getDatetime() );
					 System.out.println("the approved status is : "+ i.isApproved());
				 
				 }
	 }


}

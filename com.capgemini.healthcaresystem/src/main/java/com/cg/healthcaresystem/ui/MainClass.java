package com.cg.healthcaresystem.ui;

import java.util.Scanner;

import com.cg.healthcaresystem.dto.AppointmentDto;
import com.cg.healthcaresystem.service.AppointmentService;
import com.cg.healthcaresystem.util.AppointmentRepository;
import com.cg.healthcaresystem.util.TestRepository;
import com.cg.healthcaresystem.util.UserRepository;

public class MainClass {
	
	public static void main(String []args) {
		
		
//		System.out.println("Data Stored in the repository is as follows : ");
//		TestRepository TestobjectRepo= new TestRepository();
//		UserRepository UserobjectRepo= new UserRepository();
//		AppointmentRepository objectUtil = new AppointmentRepository();

		AppointmentService AppointmentServiceObject=new AppointmentService();
    	
    	
    	Scanner scanObject=new Scanner(System.in);
    	int userInputChoice=1;
    	String deleteInputId;
    	int userChoice;
    	int inputShow;
    	
    	while(userInputChoice!=0) 
    	{
    		System.out.println("Press\n1.Diagnostic Center\n2.Appointment\n3.Test Available");
    		userInputChoice=scanObject.nextInt();
    		
    		switch(userInputChoice) {
    case 1:	
    		System.out.println("Press\n1.Display\n2.Add\n3.Delete\n4.Update");
    		userInputChoice=scanObject.nextInt();
    		
    		switch(userInputChoice) 
    		{
    		
     case 1:
    	 System.out.println("Press\n1.ApprovalStatus\n2.Delete\n3.Update");
 		userInputChoice=scanObject.nextInt();
 		
 		switch(userInputChoice) 
 		{
 		
 		case 1:
 			AppointmentDto object=new AppointmentDto();
				System.out.println("Enter the Appointment Id: ");
				long inputAppointmentId=scanObject.nextInt();
				object.setAppointmentId(inputAppointmentId);
				
				break;
 		case 2:
 			
				System.out.println("Enter the Appointment Id to be deleted");
				long deleteInputId1=scanObject.nextInt();
				
				//AppointmentServiceObject.deleteAppointment(deleteInputId1);
				
				break;
 		case 3:
				
				System.out.println("Enter the Appointment Id to be updated");
				long updateInputId1=scanObject.nextInt();
				
				AppointmentDto updateObject=new AppointmentDto();
				System.out.println("Enter the updated details: ");
				System.out.println("Enter the AppointmentID: ");
				long inputUpdatedId1=scanObject.nextInt();
				updateObject.setAppointmentId(inputUpdatedId1);
 				}
 		   	}
    	}
    }
   }
  }
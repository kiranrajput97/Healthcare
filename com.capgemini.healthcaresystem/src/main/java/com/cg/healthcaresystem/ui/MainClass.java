package com.cg.healthcaresystem.ui;

import java.util.Scanner;

import com.cg.healthcaresystem.util.TestRepository;
import com.cg.healthcaresystem.util.UserRepository;

public class MainClass {
	
	public static void main(String []args) {
	
		
//		AppointmentRepository objectUtil = new AppointmentRepository();

		@SuppressWarnings("resource")
		Scanner scanObject=new Scanner(System.in);
		int userInputChoice=1;
		
			
		while(userInputChoice!=0) {
			System.out.println("Press\n1.Make Appointment\n2.Approve Appointment");
			userInputChoice=scanObject.nextInt();
			TestRepository TestobjectRepo= new TestRepository();
			UserRepository UserobjectRepo= new UserRepository();
	
		}
		
	    }
	}

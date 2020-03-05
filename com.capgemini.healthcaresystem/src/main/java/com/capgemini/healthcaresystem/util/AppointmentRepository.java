package com.capgemini.healthcaresystem.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.healthcaresystem.dto.AppointmentDto;

public class AppointmentRepository {
	
	public static List<AppointmentDto> appointmentCollectionObject = new ArrayList<AppointmentDto>();

	public AppointmentRepository() {
 
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MM yyyy"); // Definition for local date

		AppointmentDto object = new AppointmentDto();
		object.setAppointmentId(1111111111l);
		object.setDatetime(LocalDate.parse("14 02 2020", myFormat)); // taking local date
		object.setApproved(true);

		appointmentCollectionObject.add(object);

		AppointmentDto object2 = new AppointmentDto();
		object2.setAppointmentId(2222222222l);
		object2.setDatetime(LocalDate.parse("04 02 2020", myFormat)); // taking local date
		object2.setApproved(true);

		appointmentCollectionObject.add(object2);

		AppointmentDto object3 = new AppointmentDto();
		object3.setAppointmentId(3333333333l);
		object3.setDatetime(LocalDate.parse("10 02 2020", myFormat)); // taking local date
		object3.setApproved(true);

		appointmentCollectionObject.add(object3);

		AppointmentDto object4 = new AppointmentDto();
		object4.setAppointmentId(3333333333l);
		object4.setDatetime(LocalDate.parse("12 02 2020", myFormat)); // taking local date
		object4.setApproved(true);

		appointmentCollectionObject.add(object4);

		AppointmentDto object5 = new AppointmentDto();
		object5.setAppointmentId(55555555555l);
		object5.setDatetime(LocalDate.parse("16 02 2020", myFormat)); // taking local date
		object5.setApproved(true);

		appointmentCollectionObject.add(object5);

		AppointmentDto object6 = new AppointmentDto();
		object6.setAppointmentId(6666666666l);
		object6.setDatetime(LocalDate.parse("18 02 2020", myFormat)); // taking local date
		object6.setApproved(true);

		appointmentCollectionObject.add(object6);

		AppointmentDto object7 = new AppointmentDto();
		object7.setAppointmentId(7777777777l);
		object7.setDatetime(LocalDate.parse("19 02 2020", myFormat)); // taking local date
		object7.setApproved(true);

		appointmentCollectionObject.add(object7);

		
		
		for (AppointmentDto i : appointmentCollectionObject) {
			System.out.println("the appointment id is : " + i.getAppointmentId());
			System.out.println("Date of the test is : " + i.getDatetime());
			System.out.println("the approved status is : " + i.isApproved());

		}
		
	} 

	public static void addAppointment(AppointmentDto custom)
	{
		appointmentCollectionObject.add(custom);
	}

	public static void viewAppointments()
	{
		for (AppointmentDto i : appointmentCollectionObject) {
			System.out.println("the appointment approved status  for "+ i.getUser().getUsername() + " is  : " + i.isApproved());
		
		}
	}
	
}

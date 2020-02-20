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
		object2.setDatetime(LocalDate.parse("04 02 2000", myFormat)); // taking local date
		object2.setApproved(true);

		appointmentCollectionObject.add(object2);

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

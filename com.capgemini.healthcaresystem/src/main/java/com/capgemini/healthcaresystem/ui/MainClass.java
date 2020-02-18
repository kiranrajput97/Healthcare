package com.capgemini.healthcaresystem.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.TestDto;
import com.capgemini.healthcaresystem.dto.UserDto;
import com.capgemini.healthcaresystem.util.AppointmentRepository;
import com.capgemini.healthcaresystem.util.TestRepository;
import com.capgemini.healthcaresystem.util.UserRepository;
import com.capgemini.healthcaresystem.util.*;

public class MainClass {

	public static void main(String[] args) {

//		
//		TestRepository TestobjectRepo= new TestRepository();
//		UserRepository UserobjectRepo= new UserRepository();
//		AppointmentRepository objectUtil = new AppointmentRepository();

		Scanner scanObject = new Scanner(System.in);
		int userInputChoice = 1;
		String deleteInputId;
		int userChoice;
		int inputShow;
		String username;
		String diagnosticCentre;
		String testName;
		String date;
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MM yyyy"); // Definition for local date

		while (userInputChoice != 0) {
			System.out.println("Press\n1.Make Appointment \n2.Approve Appointment\n3. View Appointments\n0. Exit");
//			scanObject.nextInt();
			userInputChoice = scanObject.nextInt();

			switch (userInputChoice) {
		
			case 0:
				break;
			case 1:
				try {
					AppointmentDto appointmentDto = new AppointmentDto();
					
					Scanner scanObject2 = new Scanner(System.in);
					System.out.println("taking the patient details:");
					System.out.println("Enter Patientname: ");
					username = scanObject2.next();
					UserDto user = new UserDto();
					user.setUsername(username);
					appointmentDto.setUser(user);
					
					
					System.out.println("Enter Diagnostic center: ");
					diagnosticCentre = scanObject2.next();
					appointmentDto.setDiagnosticCentre(diagnosticCentre);

					System.out.println("Enter test that you want to undergo: ");
					testName = scanObject2.next();
					TestDto testDto = new TestDto();
					testDto.setTestName(testName);
					testDto.setTestId("-1");
					appointmentDto.setTest(testDto);

					System.out.println("enter the date patient want to go undergo test : ");
					Scanner scanner = new Scanner(System.in);
					date = scanner.next();

					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					LocalDate date2 = null;
					try {
						// Parsing the String
//						date2 = dateFormat.parse(date);
						date2 = null;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
//					System.out.println(date2);
//					System.out.println("Patient name is : " + username + "  "
//							+ "\n Diagnostic center seleced by patient is : " + diagnosticCentre + "  "
//							+ "\n Test user want to undergo : " + testName + "\n ate selected by user is :" + date);
//
//					System.out.println(
//							"Appointment made successfully...\n please wait to see the status of your appointment as conformed or not...");
					appointmentDto.setDatetime(date2);
					
					AppointmentRepository.addAppointment(appointmentDto);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				AppointmentRepository.viewAppointments();
				System.out.println("Enter patient name to approve ");
				String patientName = scanObject.next();
				
				for (int i = 0; i < AppointmentRepository.appointmentCollectionObject.size(); ++i)
				{
					if (AppointmentRepository.appointmentCollectionObject.get(i).getUser().getUsername().equals(patientName))
					{
						AppointmentRepository.appointmentCollectionObject.get(i).setApproved(true);
					}
				}
				break;
			case 3:
				System.out.println("Viewing appointments");
				AppointmentRepository.viewAppointments();
				break;
			default:
				System.out.println("Running Default part of the code");
			}
	
		}
	}
}

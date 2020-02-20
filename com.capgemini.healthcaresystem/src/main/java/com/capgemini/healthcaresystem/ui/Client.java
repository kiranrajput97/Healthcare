package com.capgemini.healthcaresystem.ui;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.TestDto;
import com.capgemini.healthcaresystem.dto.UserDto;
import com.capgemini.healthcaresystem.service.ValidationService;
import com.capgemini.healthcaresystem.util.AppointmentRepository;
import com.capgemini.healthcaresystem.util.TestRepository;
import com.capgemini.healthcaresystem.util.UserRepository;

public class Client {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {


		@SuppressWarnings("resource")
		Scanner scanObject = new Scanner(System.in);
		int userInputChoice = 1;
		int userChoice;
		int inputShow;
		String date;
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MM yyyy"); // Definition for local date

		while (userInputChoice != 0) {
			System.out.println("Press\n1.Make Appointment \n2.Approve Appointment\n3. View Appointments\n0. Exit");
			userInputChoice = scanObject.nextInt();

			switch (userInputChoice) {

			case 0:
				System.out.println("Thank you ..! visit again");
				break;
			case 1:
				try {
					AppointmentDto appointmentDto = new AppointmentDto();

					Scanner scanObject2 = new Scanner(System.in);

					System.out.println("taking the patient details:");

					// username validation starts
					String username = "";

					while (true) {
						System.out.println("Enter Patient name: ");
						username = scanObject2.next();
 
						if (ValidationService.validatename(username))
							break;

						System.out.println("Name should contain only aplhabets");
					}
					// username validation ends

					UserDto user = new UserDto();
					user.setUsername(username);
					appointmentDto.setUser(user);

					// diagnostic validation starts

					String diagnosticCentre = "";

					while (true) {
						System.out.println("Enter Diagnostic center  (such as pune, mumbai, delhi) : ");
						diagnosticCentre = scanObject2.next();

						if (ValidationService.validatecity(diagnosticCentre))
							break;

						System.out.println("Diagnostic Center name  should contain only aplhabets");
					}
					// diagnostic validation ends

					appointmentDto.setDiagnosticCentre(diagnosticCentre);

					// testname validation starts
					String testName = "";

					while (true) {

						System.out.println("Enter test that you want to undergo (such as blood, sugar) : ");
						testName = scanObject2.next();
						if (ValidationService.validatecity(testName))
							break;

						System.out.println("testname should contain only aplhabets");
					}
					// testname validation ends

					TestDto testDto = new TestDto();
					testDto.setTestName(testName);
					testDto.setTestId("-1");
					appointmentDto.setTest(testDto);

					while (true)

					{
						System.out.println("enter the date patient want to go undergo test (should be in the format[dd-MM-yyyy] : ");
						Scanner scanner = new Scanner(System.in);
						date = scanner.next();
						if (ValidationService.isValidDate(date))
							break;
						System.out.println("date should should be in the format[dd-MM-yyyy]");
					}
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					LocalDate date2 = null;

					System.out.println("\n Patient name is                                  : " + username + "  "
							+ "\n Diagnostic center seleced by patient is          : " + diagnosticCentre + "  "
							+ "\n Test user want to undergo                        : " + testName + " "
							+ "\n Date selected by user is                         : " + date);

					System.out.println("Appointment made successfully..."
							+ "	\n please wait to see the status of your appointment as conformed or not...");

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

				for (int i = 0; i < AppointmentRepository.appointmentCollectionObject.size(); ++i) {
					if (AppointmentRepository.appointmentCollectionObject.get(i).getUser().getUsername()
							.equals(patientName)) {
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




















//AppointmentRepository objectUtil = new AppointmentRepository();
//TestRepository TestobjectRepo = new TestRepository();
//UserRepository UserobjectRepo = new UserRepository();


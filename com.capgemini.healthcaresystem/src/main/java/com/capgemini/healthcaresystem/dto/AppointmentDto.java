package com.capgemini.healthcaresystem.dto;

import java.time.LocalDate;

public class AppointmentDto {
	private UserDto user;
	private long appointmentId;


	private String diagnosticCentre;
	private TestDto test;
	private LocalDate datetime;
	private boolean approved;

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public TestDto getTest() {
		return test;
	}

	public void setTest(TestDto test) {
		this.test = test;
	}

	public LocalDate getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDate datetime) {
		this.datetime = datetime;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public String getDiagnosticCentre() {
		return diagnosticCentre;
	}

	public void setDiagnosticCentre(String diagnosticCentre) {
		this.diagnosticCentre = diagnosticCentre;
	}

}

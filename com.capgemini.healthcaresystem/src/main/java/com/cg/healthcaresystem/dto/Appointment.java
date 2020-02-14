package com.cg.healthcaresystem.dto;

public class Appointment {
	int User;
	long appointmentId;
	String Test;
	 String datetime;
	 boolean approved;
	public int getUser() {
		return User;
	}
	public void setUser(int user) {
		User = user;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getTest() {
		return Test;
	}
	public void setTest(String test) {
		Test = test;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}

}

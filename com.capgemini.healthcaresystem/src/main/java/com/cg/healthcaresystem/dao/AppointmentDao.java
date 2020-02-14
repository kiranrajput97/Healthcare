package com.cg.healthcaresystem.dao;
import java.util.ArrayList;
import java.util.List;

import com.cg.healthcaresystem.dto.Appointment;

public class AppointmentDao {

   List<Appointment>  appointmentList=new  ArrayList<Appointment>();
   
   public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	   
 
public boolean approveAppointmentDao(Appointment appointment)
   {
	appointmentList.add(appointment);
        return true;
   }
   
   public boolean makeAppointmentDao(Appointment appointment)
   
   {
	   appointmentList.remove(appointment);
                return true;
   }


   
}




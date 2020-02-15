package com.cg.healthcaresystem.dao;
import java.util.ArrayList;
import java.util.List;

import com.cg.healthcaresystem.dto.AppointmentDto;

public class AppointmentDao {

   List<AppointmentDto>  appointmentList=new  ArrayList<AppointmentDto>();
   
   public List<AppointmentDto> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<AppointmentDto> appointmentList) {
		this.appointmentList = appointmentList;
	}
	   
 
public boolean approveAppointmentDao(AppointmentDto appointment)
   {
	appointmentList.add(appointment);
        return true;
   }
   
   public boolean makeAppointmentDao(AppointmentDto appointment)
   
   {
	   appointmentList.remove(appointment);
                return true;
   }


   
}




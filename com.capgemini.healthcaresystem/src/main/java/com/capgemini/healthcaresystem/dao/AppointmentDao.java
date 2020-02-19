package com.capgemini.healthcaresystem.dao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.util.AppointmentRepository;
import com.capgemini.healthcaresystem.util.TestRepository;
import com.capgemini.healthcaresystem.util.UserRepository;

public class AppointmentDao {

   List<AppointmentDto>  appointmentList=new  ArrayList<AppointmentDto>();
    
//   public AppointmentDao(){
//		
//		System.out.println("Data Stored in the repository is as follows : ");
//		TestRepository TestobjectRepo= new TestRepository();
//		UserRepository UserobjectRepo= new UserRepository();
//		AppointmentRepository objectUtil = new AppointmentRepository();
//	   
//   }
   
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




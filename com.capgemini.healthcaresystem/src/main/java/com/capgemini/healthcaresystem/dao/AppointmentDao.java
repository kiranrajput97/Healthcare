package com.capgemini.healthcaresystem.dao;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.util.TestRepository;

public class AppointmentDao 
   {  

   List<AppointmentDto>  appointmentList=new  ArrayList<AppointmentDto>();
     
   public class TestDto
   {
				 List<TestDto> testCollectionObject= new ArrayList<TestDto>();
					TestRepository TestobjectRepo= new TestRepository();

   }
   public class UserDto
   {
		 List<UserDto> userCollectionObject= new ArrayList<UserDto>();

   } 
  
   public List<AppointmentDto> getAppointmentList() 
   {
		return appointmentList;
   }

	public void setAppointmentList(List<AppointmentDto> appointmentList)
	{
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




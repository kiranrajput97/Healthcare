package com.capgemini.healthcaresystem.service;
import com.capgemini.healthcaresystem.dao.AppointmentDao;
import com.capgemini.healthcaresystem.dto.AppointmentDto;

import java.util.List;

public class AppointmentService 
{
	AppointmentDao appointmentdao=new AppointmentDao();
    
        public AppointmentDao getAppointmentdao() 
    {
		 return appointmentdao;
	}

	public void setAppointmentdao(AppointmentDao appointmentdao)
	{
		this.appointmentdao = appointmentdao;
	} 
	
	

		public boolean approveAppointmentService(AppointmentDto appointment)
        
    {
            return (appointmentdao.approveAppointmentDao(appointment));
    }
        
        public boolean makeAppointmentService(AppointmentDto appointment)
    {
            return (appointmentdao.makeAppointmentDao(appointment));
    }
    
    public List<AppointmentDto>  getAppointmentService()
    {
            return (appointmentdao.getAppointmentList());
    }
    
    AppointmentDao appointmentdaoob =new AppointmentDao();
    
}



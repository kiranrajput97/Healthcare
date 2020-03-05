package com.capgemini.healthcaresystem.AppointmentServiceTest;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.service.AppointmentService;

public class AppoinmentServiceTest {
			@Test
		public void appointmentServiceTest1() {	
			AppointmentService obj1=new AppointmentService();
			AppointmentDto object1=new AppointmentDto();
			object1.setApproved(true); 
			obj1.approveAppointmentService(object1);
			assertEquals(object1.isApproved(), true);	
		} 
			@Test
			public void appointmentServiceTest4() {	
				AppointmentService obj4=new AppointmentService();
				AppointmentDto object4=new AppointmentDto();
				object4.setApproved(false);
				obj4.approveAppointmentService(object4);
				assertEquals(object4.isApproved(), false);	
			} 
			@Test
			public void appointmentServiceTest2() {	
				AppointmentService obj2=new AppointmentService();
				AppointmentDto object2=new AppointmentDto();
				object2.setApproved(true);
				assertTrue(object2.isApproved());	
			}
			@Test
			public void appointmentServiceTest3() {	
				AppointmentService obj3=new AppointmentService();
				AppointmentDto object3=new AppointmentDto();
				object3.setApproved(false);
				assertFalse(object3.isApproved());	
			}
			 
}
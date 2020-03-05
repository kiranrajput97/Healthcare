package com.capgemini.healthcaresystem.AppointmentDaoTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.capgemini.healthcaresystem.dao.AppointmentDao;
import com.capgemini.healthcaresystem.dto.AppointmentDto;

public class AppointmentDaoTest {
 
	
			@Test
		public void appointmentDaoTest1() {	
			AppointmentDao obj1=new AppointmentDao();
			AppointmentDto object1=new AppointmentDto();
			object1.setUsername("Kiran");
			boolean flag =obj1.makeAppointmentDao(object1);
			assertEquals(flag, true);	
		}
			@Test
			public void appointmentDaoTest2() {	
				AppointmentDao obj2=new AppointmentDao();
				AppointmentDto object2=new AppointmentDto();
				object2.setDiagnosticCentre("mumbai");
				boolean flag =obj2.makeAppointmentDao(object2);
				assertEquals(flag, true);	
			}
			
			@Test
			public void appointmentDaoTest5() {	
				AppointmentDao obj5=new AppointmentDao();
				AppointmentDto object5=new AppointmentDto();
				object5.setDiagnosticCentre("city");
				boolean flag =obj5.makeAppointmentDao(object5);
				assertEquals(flag, true);	
			}
			
			@Test
			public void appointmentDaoTest6() {	
				AppointmentDao obj6=new AppointmentDao();
				AppointmentDto object6=new AppointmentDto();
				object6.setUsername("user");
				boolean flag =obj6.makeAppointmentDao(object6);
				assertEquals(flag, true);	
			}
				@Test
				public void appointmentDaoTest7() {	
					AppointmentDao obj7=new AppointmentDao();
					AppointmentDto object7=new AppointmentDto();
					object7.setDiagnosticCentre("city");
					boolean flag =obj7.makeAppointmentDao(object7);
					assertEquals(flag, true);	
				}
				
				@Test
				public void appointmentDaoTest8() {	
					AppointmentDao obj8=new AppointmentDao();
					AppointmentDto object8=new AppointmentDto();
					object8.setDiagnosticCentre("test");
					boolean flag =obj8.makeAppointmentDao(object8);
					assertEquals(flag, true);	
				}
				@Test
				public void appointmentDaoTest9() {	
					AppointmentDao obj9=new AppointmentDao();
					AppointmentDto object9=new AppointmentDto();
					object9.setAppointmentId(1111111111L);
					boolean flag =obj9.makeAppointmentDao(object9);
					assertEquals(flag, true);	
				}
				@Test
				public void appointmentDaoTest10() {	
					AppointmentDao obj10=new AppointmentDao();
					AppointmentDto object10=new AppointmentDto();
					object10.setTestName("blood");
					boolean flag =obj10.makeAppointmentDao(object10);
					assertEquals(flag, true);	
				} 
				@Test
				public void appointmentDaoTest11() {	
					AppointmentDao obj11=new AppointmentDao();
					AppointmentDto object11=new AppointmentDto();
					object11.setApproved(true);
					boolean flag =obj11.makeAppointmentDao(object11);
					assertEquals(flag, true);	
				}
				
				
	
			 
			
}


package com.capgemini.healthcaresystem.AppointmentDaoTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;
import com.capgemini.healthcaresystem.dao.AppointmentDao;
import com.capgemini.healthcaresystem.dto.AppointmentDto;

public class AppointmentDaoTest {

	
			@Test
		public void appointmentDaoTest() {	
			AppointmentDao obj=new AppointmentDao();
			AppointmentDto object1=new AppointmentDto();
			object1.setUsername("Kiran");
			object1.setDiagnosticCentre("pune");
			object1.setTestName("blood");
			//object1.setDatetime(new LocalDate("12-02-2020"));
			boolean flag =obj.makeAppointmentDao(object1);
			assertEquals(flag, true);	
		}
			@Test
			public void appointmentDaoTest2() {	
				AppointmentDao obj2=new AppointmentDao();
				AppointmentDto object2=new AppointmentDto();
				object2.setUsername("sohaib");
				object2.setDiagnosticCentre("pune");
				object2.setTestName("sugar");
				//object1.setDatetime(02-02-2020);
				boolean flag =obj2.makeAppointmentDao(object2);
				assertEquals(flag, true);	
			}
			@Test
			public void appointmentDaoTest3() {	
				AppointmentDao obj3=new AppointmentDao();
				AppointmentDto object3=new AppointmentDto();
				object3.setApproved(true);
				boolean flag =obj3.makeAppointmentDao(object3);
				assertEquals(flag, true);	
			}
			@Test
			public void appointmentDaoTest4() {	
				AppointmentDao obj4=new AppointmentDao();
				AppointmentDto object4=new AppointmentDto();
				object4.setApproved(true);
				boolean flag =obj4.makeAppointmentDao(object4);
				assertEquals(flag, true);	
			}
	}



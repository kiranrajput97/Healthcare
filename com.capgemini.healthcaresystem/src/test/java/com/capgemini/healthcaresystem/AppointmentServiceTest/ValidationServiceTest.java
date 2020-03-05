package com.capgemini.healthcaresystem.AppointmentServiceTest;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.service.ValidationService;

public class ValidationServiceTest {
	@Test
	public void ValidationServiceTest1() {	
		ValidationService obj1=new ValidationService();
		AppointmentDto object1=new AppointmentDto(); 
		object1.setApproved(true);
		assertEquals(object1.isApproved(), true);	
	}
	@Test
	public void ValidationServiceTest2() {	
		ValidationService obj2=new ValidationService();
		AppointmentDto object2=new AppointmentDto();
		object2.setApproved(true);
		assertTrue(object2.isApproved());	
	}

	@Test
	public void ValidationServiceTest3() {	
		ValidationServiceTest obj3=new ValidationServiceTest();
		AppointmentDto object3=new AppointmentDto();
		object3.setApproved(false);
		assertFalse(object3.isApproved());	
	
}
}

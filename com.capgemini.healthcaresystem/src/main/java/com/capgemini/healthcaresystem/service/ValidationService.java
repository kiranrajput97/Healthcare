package com.capgemini.healthcaresystem.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidationService 
	{
	public static boolean validatename(String name) {
		return name.matches("[a-zA-Z]+");
	}
	
	public static boolean validatecity(String city) 
	
	{
		return city.matches("[a-zA-Z]+");
	} 

	public static boolean validatetest(String test)
	
	{
		return test.matches("[a-zA-Z]+");
	}
	

	public static boolean isValidDate(String input) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

	     try {
	          format.parse(input);
	          return true;
	     }
	     catch(ParseException e){
	          return false;
	     }
	}
	
}

package com.capgemini.healthcaresystem.dto;


public class UserDto {
	  
	
	private String username;
	private long contactNo;
	private String usedId;
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username) 
	{ 
		this.username = username;
	}
	public long getContactNo() 
	{
		return contactNo;
	}
	public void setContactNo(long contactNo) 
	{
		this.contactNo = contactNo;
	} 
	public String getUsedId() 
	{
		return usedId;
	}
	public void setUsedId(String usedId) 
	{
		this.usedId = usedId;
	}
	

}

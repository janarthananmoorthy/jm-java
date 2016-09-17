package com.jana.model;

import javax.ws.rs.Consumes;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class User {

	private static final long serialVersionUID = 1L;
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	
	public User() {
		
	}
	
	public User(Long userId, String firstName, String lastName, String email, String mobileNo){
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString(){
		return "UserId:"+ this.userId + " firstName:" + this.firstName + " lastName:"
				+ this.lastName + " email:" + this.email + " phoneNo:" +this.mobileNo;
	}
	
}

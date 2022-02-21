package org.iesalixar.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
	private String userName;
	private String userPassword;
	public UserDTO() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}

package com.company.surveymanagement.bean;

public class UserRegistrationBean {

	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private int userType;
	
	

	public UserRegistrationBean(int userId, String firstName, String lastName,
			String userName, String password, String email, int userType) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.userType = userType;
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UserRegistration [firstName=" + firstName + ", lastName="
				+ lastName + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", userType=" + userType
				+ "]";
	}
	
	
	
}

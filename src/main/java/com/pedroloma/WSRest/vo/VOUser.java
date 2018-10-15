package com.pedroloma.WSRest.vo;

public class VOUser {

	private String user;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isValidUser() {
		return validUser;
	}
	public void setValidUser(boolean validUser) {
		this.validUser = validUser;
	}
	private String password;
	private boolean validUser;
}

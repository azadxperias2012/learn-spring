package com.neotechlabs.jee;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		return (user.equals("neotechlabs") &&
				password.equals("Welcome1"));
	}

}

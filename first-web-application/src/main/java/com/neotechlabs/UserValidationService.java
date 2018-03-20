package com.neotechlabs;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if (user.equals("neotechlabs") &&
				password.equals("Welcome1")) {
			return true;
		}
		return false;
	}

}

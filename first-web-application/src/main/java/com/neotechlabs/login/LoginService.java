package com.neotechlabs.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		return (user.equals("neotechlabs") &&
				password.equals("Welcome1"));
	}

}


package com.rays.exception;

public class LoginExceptionTest {
	public static void main(String[] args) throws LoginException {

		String name = "admin";
		String password = "123";
		try {
			if (name.equals("admi") && password.equals("234")) {
			} else {
				throw new LoginException("invalid");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}


package com.rays.exception.custom;

public class TestUnchecked {
	
	public static void main(String[] args) {
		dad();
	}    

	public static void dad() {

		try {
			mom();
		} catch (UncheckedException e) {
			System.out.println(e);
		}

	}

	public static void mom() {

		son();

	}

	public static void son() {

		throw new UncheckedException();

	}


}




// UncheckedException me try catch mandatory nhi hota he 

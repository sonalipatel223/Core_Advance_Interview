package com.rays.oop;

public class ImplicitTest extends Implicit {      // implicit ko extend kiya he to pehle parent clasa ka
												  // constructor chalega fir child class ka esliye pehle
	public ImplicitTest() {                        // esliye pehle parent ka statment print hoga fir child ka

		System.out.println("sona");
	}

	public static void main(String[] args) {
		ImplicitTest i = new ImplicitTest();
	}

}

package com.rays.oop;

public final class Immutable {

//final keyword lagane ka matlab hai ki is class ko koi inherit nahi kar sakta.
	// Isse class ka structure aur behavior secure ho jata hai.

	private final int no;

	// private: Direct access nahi milega, sirf methods ke through access kar sakte
	// hain.
	// final: Ek baar value assign hone ke baad usse change nahi kiya jaa sakta.

	public Immutable(int no) {
		this.no = no;

	}

	public int value() {
		return no;

	}
	
//	 public int getNo() {
//	        return no;
//	 }
	
	public static void main(String[] args) {
		Immutable ob = new Immutable(10);
		// value() method use karke hum no ki value ko print karte hain

		System.out.println(ob.value());
		// System.out.println(ob.getNo());
	}
}

//Yeh code ek immutable class ka example hai. Immutable class ka matlab hota hai
//ki ek baar object banne ke baad uske state (properties ki value) ko change nahi kiya jaa sakta.

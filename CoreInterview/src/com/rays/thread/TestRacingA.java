
package com.rays.thread;

public class TestRacingA {

	public static void main(String[] args) {
		
		RacingA t1 = new RacingA("Sonali");
		RacingA t2 = new RacingA("Patel");
		
		t1.start();
		t2.start();
	}
}

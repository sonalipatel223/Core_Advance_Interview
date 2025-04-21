package com.rays.oop.abstract1;
abstract class Shapz{
	public void disp() {
		System.out.println(" i am abstract...!!!!");
	}
	public abstract void ractangle();
}

public class Abstract1 extends Shapz {

	@Override
	public void ractangle() {
		System.out.println("i am child ...!!!!!");
		
	}
	public static void main(String[] args) {
		Shapz s=new Abstract1();
		s.ractangle();
		s.disp();
	}

	

}

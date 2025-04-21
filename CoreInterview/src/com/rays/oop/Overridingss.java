package com.rays.oop;

   class shap{
	public void name() {
		System.out.println("i am shap");
	}
}
  class area extends shap{
	public void name() {
		System.out.println("i am area");
	}
}

public class Overridingss {
	public static void main(String[] args) {
		area a=new area();
		a.name();
		
//		shap s =new shap();
//		s.name();
	}

}

package com.rays.oop.businessman;

public class TestBusiness {
	public static void main(String[] args) {

		BusinessMan b = new BusinessMan();
		Richman r = new BusinessMan();
		SocialWorker s = new BusinessMan();
		
		r.donation();
		r.earnMoney();
		r.party();
		s.helpToOthers();

	}

}

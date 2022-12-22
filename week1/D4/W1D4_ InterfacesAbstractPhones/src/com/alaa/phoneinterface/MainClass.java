package com.alaa.phoneinterface;

public class MainClass {

	public static void main(String[] args) {
		Iphone iPhone14 = new Iphone("iOS16", 100, 8, "Orange", 12.50, "WakeUp.mp3", "user2@icloud.com");
		iPhone14.displayInfo();
//		System.out.println("-----------------");
//		Android galaxy = new Android("S99", 80, 16, "AT&T", 45.00, "Buzzz Buzzz");
//		galaxy.displayInfo();
		
		iPhone14.ring();
		iPhone14.unlock();
		
	}

}

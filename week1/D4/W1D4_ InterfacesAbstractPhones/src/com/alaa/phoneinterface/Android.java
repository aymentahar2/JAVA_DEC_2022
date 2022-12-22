package com.alaa.phoneinterface;

public class Android extends Phone {

	public Android(String versionNumber, int batteryPercentage, int memory, String carrier, double camera,
			String ringtone) {
		super(versionNumber, batteryPercentage, memory, carrier, camera, ringtone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println(String.format("Samsung Galaxy S99 Info: \n Version Number: %s, \n Battery Percentage: %d percent, \n Camera: %,.2f megapixles \n Ringtone: %s ", this.getVersionNumber(),
				this.getBatteryPercentage(), this.getCamera(), this.getRingtone()));
		
	}

}

package com.alaa.phoneinterface;

public class Iphone extends Phone implements Ringable {
	
	private String icloudAccount;

	public Iphone(String versionNumber, int batteryPercentage, int memory, String carrier, double camera,
			String ringtone, String icloudAccount) {
		super(versionNumber, batteryPercentage, memory, carrier, camera, ringtone);
		
		this.icloudAccount = icloudAccount;
		
	}

	@Override
	public void displayInfo() {
		System.out.println(String.format("iPhone 14 System Info: \n Version Number: %s, \n Battery Percentage: %d percent, \n Camera: %,.2f megapixles \n Ringtone: %s ", this.getVersionNumber(),
				this.getBatteryPercentage(), this.getCamera(), this.getRingtone()));
		
	}

	public String getIcloudAccount() {
		return icloudAccount;
	}

	public void setIcloudAccount(String icloudAccount) {
		this.icloudAccount = icloudAccount;
	}

	@Override
	public void ring() {
	 System.out.println("Ding Dong");
		
	}

	@Override
	public void unlock() {
		System.out.println("Swipe to unlock");
		
	}


}

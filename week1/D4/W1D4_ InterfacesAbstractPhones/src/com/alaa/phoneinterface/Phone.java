package com.alaa.phoneinterface;

public abstract class Phone {

	// Member variables
	private String versionNumber;
	private int batteryPercentage;
	private int memory;
	private String carrier;
	private double camera;
	private String ringtone;

	// constructor
	public Phone(String versionNumber, int batteryPercentage, int memory, String carrier, double camera,
			String ringtone) {
		super();
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.memory = memory;
		this.carrier = carrier;
		this.camera = camera;
		this.ringtone = ringtone;
	}

	// Methods

	public abstract void displayInfo();

	// getters and setters
	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public double getCamera() {
		return camera;
	}

	public void setCamera(double camera) {
		this.camera = camera;
	}

	public String getRingtone() {
		return ringtone;
	}

	public void setRingtone(String ringtone) {
		this.ringtone = ringtone;
	}
}

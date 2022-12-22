package com.alaa.ninjaoop;

public class Ninja {

	private String name;
	private String weapon;
	private String school;
	private int powerLvl;
	private int health;
	private int stamina;
	
	
	
	
	
	

	// CONSTRUCTOR
	
	public Ninja() {
		this.name = "Unknown";
		this.weapon = "nunchaku";
		this.school = "DojoElite";
		this.powerLvl = 100;
		this.health = 100001;
		this.stamina = 99;
	}
	
	public Ninja(String name, String weapon, String school, int powerLvl, int health, int stamina) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.school = school;
		this.powerLvl = powerLvl;
		this.health = health;
		this.stamina = stamina;
	}
	
	// Methods
	
	public void attack(Ninja target) {
		target.setHealth(target.getHealth() - this.getPowerLvl());
		System.out.println("This is a Ninja");
	}
	
	public void showStats() {
		System.out.println(this.getName() + " has " + this.getHealth() + " hp" + " and he is from " + this.getSchool());
	}
	
	// GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getPowerLvl() {
		return powerLvl;
	}
	public void setPowerLvl(int powerLvl) {
		this.powerLvl = powerLvl;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	
}

package com.alaa.ninjaoop;

import java.util.ArrayList;

public class Sensei extends Ninja {
	
	private String wisdom;
	private String superPower;
	private ArrayList<String> skills =new ArrayList<String>();
	

	public Sensei(String name, String weapon, String school, int powerLvl, int health, int stamina, String superPower, String wisdom, ArrayList<String> skills) {
		super(name, weapon, school, powerLvl, health, stamina);
		this.wisdom = wisdom;
		this.superPower = superPower;
		this.skills = skills;
	}
	
	//Methods
	public void attack(Ninja target) {
		super.attack(target);
		target.setHealth(0);

	}


	public String getWisdom() {
		return wisdom;
	}


	public void setWisdom(String wisdom) {
		this.wisdom = wisdom;
	}


	public String getSuperPower() {
		return superPower;
	}


	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}


	public ArrayList<String> getSkills() {
		return skills;
	}


	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	
	
	

}

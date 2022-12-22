package com.alaa.ninjaoop;

import java.util.ArrayList;

public class EntryPoint {

	public static void main(String[] args) {
		
		Ninja newNinja = new Ninja("Naruto", "Magic", "Konohagakure School", 101, 10000, 999);
		Ninja villain = new Ninja();
		
		//newNinja.attack(villain);
		//System.out.println(villain.getHealth());
		//villain.showStats();
		ArrayList <String> senseiSkills = new ArrayList <String>();
		Sensei splinter = new Sensei("Splinter", "stick", "underground", 10000, 50, 150, "wisdom", "Life is Hard", senseiSkills);
		senseiSkills.add("One Punch");
		senseiSkills.add("Grandma Hit");
		
		// System.out.println(splinter.getSkills());
		
		splinter.attack(villain);
		
		villain.showStats();
		
	}

}

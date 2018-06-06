package com.objectmaster;

public class Humans {
	int strength = 3;
	int intelligence = 3;
	int stealth = 3;
	int health = 100;
	
	public void attack(Humans target) {
		target.health -= this.strength;
	}
	
	public void getHealth() {
		System.out.println("Health: " + this.health);
	}
	
}

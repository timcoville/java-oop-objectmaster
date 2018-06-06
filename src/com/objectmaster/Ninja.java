package com.objectmaster;

public class Ninja extends Humans {
	public Ninja() {
		this.stealth = 10;
	}
	public void steal(Humans player) {
		player.health -= this.stealth;
		this.health += this.stealth;
	}
	public void runAway() {
		this.health -= 10;
	}
	
}

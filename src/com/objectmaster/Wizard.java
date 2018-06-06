package com.objectmaster;

public class Wizard extends Humans{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Humans player) {
		player.health += this.intelligence;
	}
	public void fireball(Humans player) {
		player.health -= 3 * this.intelligence;
	}
	
}

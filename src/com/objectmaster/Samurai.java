package com.objectmaster;

public class Samurai extends Humans {
	static int count = 0;
	public Samurai () {
		this.health = 200;
		count++;
	}
	public void deathBlow(Humans player) {
		player.health = 0;
	}
	public void meditate() {
		this.health = 200;
	}
	public int howMany() {
		return count;
	}
}

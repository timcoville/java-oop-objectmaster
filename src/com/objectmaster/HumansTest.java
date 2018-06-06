package com.objectmaster;

public class HumansTest {
	public static void main (String[] args) {
		Humans tim = new Humans();
		Humans mike = new Humans();
		tim.getHealth();
		mike.attack(tim);
		tim.getHealth();
	}
}

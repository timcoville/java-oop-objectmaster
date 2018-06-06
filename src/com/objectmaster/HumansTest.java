package com.objectmaster;

public class HumansTest {
	public static void main (String[] args) {
		System.out.println("Object Master 1:");
		Humans tim = new Humans();
		Humans mike = new Humans();
		tim.getHealth();
		mike.attack(tim);
		tim.getHealth();
		System.out.println("Object Master 2:");
		Wizard w = new Wizard();
		Ninja n = new Ninja();
		Samurai s = new Samurai();
		Samurai s2 = new Samurai();
		System.out.println(s.howMany());
	}
}

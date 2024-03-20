package com.skilldistillery.polymorphism.extra;

public interface LivingThing {

	default void eat() {
		System.out.println("LivingThing - Eat");
	}

	default void die() {
		System.out.println("LivingThing - Die");
	}

}

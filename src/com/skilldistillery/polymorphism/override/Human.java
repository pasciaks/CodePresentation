package com.skilldistillery.polymorphism.override;

public class Human implements Animal {

	@Override
	public void eat() {
		System.out.println("Human - Eat");
	}

}

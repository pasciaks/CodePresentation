package com.skilldistillery.polymorphism.override;

public class MethodOverridingExample {

	public class Animal {
		public void makeSound() {
			System.out.println("Animal - Some sound");
		}
	}

	public class Dog extends Animal {
		@Override
		public void makeSound() {
			System.out.println("Dog - Bark");
		}
	}

	public class Cat extends Animal {
		@Override
		public void makeSound() {
			System.out.println("Cat - Meow");
		}

	}

	public static void main(String[] args) {
		MethodOverridingExample example = new MethodOverridingExample();

		Animal animal = example.new Animal();
		Animal dog = example.new Dog();
		Animal cat = example.new Cat();

		animal.makeSound();
		dog.makeSound();
		cat.makeSound();
	}

}

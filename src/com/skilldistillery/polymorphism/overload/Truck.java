package com.skilldistillery.polymorphism.overload;

public class Truck {

	void load() {
		System.out.println("Truck - Load");
	}

	void load(int weight) {
		System.out.println("Truck - Load " + weight + " tons");
	}

	void load(int weight, String material) {
		System.out.println("Truck - Load " + weight + " tons of " + material);
	}

	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.load();
		truck.load(10);
		truck.load(10, "sand");
	}

}

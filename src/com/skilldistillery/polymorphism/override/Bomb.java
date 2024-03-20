package com.skilldistillery.polymorphism.override;

class ExplodingBomb {
	void explode() {
		System.out.println("Bomb - Explode");
	}
}

public class Bomb extends ExplodingBomb {
	@Override
	void explode() {
		System.out.println("Disarmed Bomb - No explode!");
	}

	public static void main(String[] args) {
		ExplodingBomb bomb = new Bomb();
		bomb.explode();
	}
}

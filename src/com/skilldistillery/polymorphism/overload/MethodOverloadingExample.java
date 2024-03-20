package com.skilldistillery.polymorphism.overload;

import java.util.Arrays;

public class MethodOverloadingExample {

	// Method overloading

	// These methods have the same name but different parameters
	// The return type of the method is not considered when overloading a method
	// These methods therefore have different method signatures

	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	private Integer[] add(int a, int b, int c, int d) {
		Integer[] arr = new Integer[5];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = a + b + c + d;
		return arr;
	}

	public static void main(String[] args) {
		MethodOverloadingExample example = new MethodOverloadingExample();

		int intSumOfTwo = example.add(1, 2);
		int intSumOfthree = example.add(1, 2, 3);
		double doubleSumOfTwo = example.add(1.0, 2.0);
		Integer[] arrSumOfFourInts = example.add(1, 2, 3, 4);

		System.out.println("intSumOfTwo: " + intSumOfTwo);
		System.out.println("intSumOfThree: " + intSumOfthree);
		System.out.println("doubleSumOfTwo: " + doubleSumOfTwo);
		System.out.println("arrSumOfFourInts: " + arrSumOfFourInts[4]);
		System.out.println(Arrays.deepToString(arrSumOfFourInts));

	}
}
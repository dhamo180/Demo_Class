package com.javaprograms.org;

public class AscendingOrder {

	public static void ascendingOrder() {

		int temp;
		int a[] = { 10, 100, 200, 40, 20 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("Ascending order");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		// Maximum number in an array
		int maximumNuber = a[a.length - 1];
		System.out.println("Maximum number is " + maximumNuber);
		// Minimum number in an array
		int minimumNumber = a[0];
		System.out.println("MinimumNumber is " + minimumNumber);
		// Third Maximum number in an array
		int thirdmaxNumber = a[a.length - 3];
		System.out.println("Third maximum is" + thirdmaxNumber);
		// Third minimumNumber
		int thirdMinNumber = a[2];
		System.out.println("Third minimum is " + thirdMinNumber);
	}

	public static void desscendingOrder() {

		int temp;
		int a[] = { 10, 100, 200, 40, 20 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("Descending order");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		ascendingOrder();
		desscendingOrder();
	}
}

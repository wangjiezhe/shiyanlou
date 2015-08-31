package com.shiyanlou;

public class SumOfOdd {
	public static void main(String[] args) {
		int i1 = 1, i2 = 2;
		int sum1 = 0, sum2 = 0;
		
		while (i1 <= 1000) {
			if (0 == i1 % 2) {
				sum1 += i1;
			}
			i1++;
		}
		System.out.println("Using while, from 1 to 1000, the sum of all odd numbers is " + sum1);
		
		do {
			if (0 == i2 % 2) {
				sum2 += i2;
			}
			i2++;
		} while (i2 <= 1000);
		System.out.println("Using do...while, from 1 to 1000, the sum of all odd numbers is " + sum2);
		
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (0 == i % 2) {
				sum += i;
			}
		}
		System.out.println("Using for, from 1 to 1000, the sum of all odd numbers is " + sum);
	}
}

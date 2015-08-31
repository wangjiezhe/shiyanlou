package com.shiyanlou;

public class Test {
	public static void main(String[] args) {
		int a, b, c, d;
		a = 6 + 7;
		System.out.println("a = "+a);
		b = a % 5;
		System.out.println("b = "+b);
		c = b++;
		System.out.println("After b++ b = "+b);
		System.out.println("c = "+c);
		d = ++b;
		System.out.println("After ++b b = "+b);
		System.out.println("d = "+d);

		double score = 68.9;
		String str = (score >= 60) ? "pass" : "fail";
		System.out.println("Score: " + str);
		
		System.out.println(((5 > 2) && (4 < 5)));
		System.out.println((false || (2 < 5)));
	}
}

package com.shiyanlou;

public class Wife1 {
	private static final Wife1 wife = new Wife1();

	private Wife1() {}
	
	public static Wife1 getWife() {
		return wife;
	}

}

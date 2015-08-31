package com.shiyanlou;

public class People2 {
	private String name = "LiLei";
	
	static String ID = "510xxx199X0724XXXX";
	
	public static class Student {
		String ID = "20151234";
		public void stuInfo() {
			System.out.println("Get ID from outer class: " + People2.ID);
			System.out.println("Get ID from inner class: " + ID);
		}
	}
	
	public static void main(String[] args) {
		Student b = new Student();
		b.stuInfo();
	}

}

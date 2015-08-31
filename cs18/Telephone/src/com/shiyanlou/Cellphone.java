package com.shiyanlou;

public class Cellphone extends Telephone {

	@Override
	public void call() {
		System.out.println("I can call!");
	}

	@Override
	public void message() {
		System.out.println("I can send message!");
	}

}

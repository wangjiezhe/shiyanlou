package com.shiyanlou;

class Man extends Human {

	@Override
	public void Eat() {
		System.out.println("Man can eat.");
	}

	@Override
	public void Sleep() {
		System.out.println("Man can sleep.");
	}

	@Override
	public void Beat() {
		System.out.println("Man can beat doudou.");
	}

}

package com.shiyanlou;

import java.io.IOException;

public class Goddess {

	public static void main(String[] args) throws IOException {
		Human human = HumanFactory.createHuman("man");
		human.Eat();
		human.Sleep();
		human.Beat();
	}

}

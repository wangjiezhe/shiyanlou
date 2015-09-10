package com.shiyanlou;

public class HumanFactory {
  public static Human createHuman(String gender) {
    Human human = null;
    if (gender.equals("man")) {
      human = new Man();
    }
    else if (gender.equals("female")) {
      human = new Female();
    }
    return human;
  }
}

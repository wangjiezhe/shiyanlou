package com.shiyanlou;

import java.io.IOException;

public class Goddess {

  public static void main(String[] args) throws IOException {
    HumanFactory hf = new ManFactory();
    Human h = hf.createHuman("man");
    h.Eat();
    h.Sleep();
    h.Beat();
  }

}

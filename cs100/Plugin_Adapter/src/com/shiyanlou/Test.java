package com.shiyanlou;

public class Test {

  public static void main(String[] args) {
    EnPluginInterface enPlugin = new EnPlugin();
    Home home = new Home(enPlugin);

    home.charge();
  }

}

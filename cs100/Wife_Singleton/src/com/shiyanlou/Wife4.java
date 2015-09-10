package com.shiyanlou;

public class Wife4 {
  private static class WifeHolder {
    private static final Wife4 wife = new Wife4();
  }

  private Wife4() {}

  public static Wife4 getWife() {
    return WifeHolder.wife;
  }
}

package com.shiyanlou;

public class Wife2 {
  private static Wife2 wife;

  private Wife2() {}

  public static synchronized Wife2 getWife() {
    if (wife == null) {
      wife = new Wife2();
    }
    return wife;
  }

}

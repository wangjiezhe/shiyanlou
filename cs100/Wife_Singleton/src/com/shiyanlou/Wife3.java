package com.shiyanlou;

public class Wife3 {
  private volatile static Wife3 wife;

  private Wife3() {}

  public static Wife3 getWife() {
    if (wife == null) {
      synchronized (Wife3.class) {
        if (wife == null) {
          wife = new Wife3();
        }
      }
    }
    return wife;
  }
}

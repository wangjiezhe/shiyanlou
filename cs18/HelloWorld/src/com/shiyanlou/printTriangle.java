package com.shiyanlou;

public class printTriangle {
  public static void main(String[] args) {
    printTriangle a = new printTriangle();

    int lastNum;

    lastNum = a.printRightTriangle(5);
    System.out.println("The last value is "+lastNum);
  }

  public int printRightTriangle(int n) {
    int last = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        last++;
        System.out.printf("%02d ", last);
      }
      System.out.println();
    }
    return last;
  }
}

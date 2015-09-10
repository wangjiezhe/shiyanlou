package com.shiyanlou;

public class PrintNum {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }

    int num[][] = new int[10][10];
    int count = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        num[i][j] = count++;
        System.out.printf("%02d ", num[i][j]);
      }
      System.out.println();
    }
  }
}

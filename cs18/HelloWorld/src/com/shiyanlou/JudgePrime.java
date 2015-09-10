package com.shiyanlou;

public class JudgePrime {
  public static void main(String[] args) {
    int a = 4549;
    boolean result = true;
    for (int i = 2; i*i < a; i++) {
      if (a % i == 0) {
        result = false;
        break;
      }
    }
    if (result) {
      System.out.println(a + " is prime");
    }
    else
      System.out.println(a + " is not prime");

    int[] ages = {12, 18, 9, 33, 45, 60};
    int i = 1;
    for (int age:ages) {
      System.out.println("The "+i+"st element in array is "+age);
      i++;
    }
  }
}

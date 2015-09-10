package com.shiyanlou;

public class printScore {
  public static void main(String[] args) {
    printScore a = new printScore();

    int rSum;

    rSum = a.calcSum(78, 99);
    System.out.println("Total score: "+rSum);

    double rAve;

    int sub1 = 78;
    int sub2 = 99;
    rAve = a.calcAve(sub1, sub2);
    System.out.println("Average score: "+rAve);
  }

  public int calcSum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public double calcAve(int a, int b) {
    double ave = (a + b) / 2;
    return ave;
  }
}

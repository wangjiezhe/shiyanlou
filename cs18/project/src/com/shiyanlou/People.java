package com.shiyanlou;

public class People {
  private double height;
  int age;
  boolean sex;

  public People(double h, int a, boolean s) {
    height = h;
    age = a;
    sex = s;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double newHeight) {
    height = newHeight;
  }

  void cry() {
    System.out.println("I'm Crying!");
  }

  void laugh() {
    System.out.println("I'm laughing!");
  }

  void printBaseMes() {
    System.out.println("My height is "+height+"cm");
    System.out.println("My age is "+age);
    if (this.sex)
      System.out.println("I'm a boy");
    else
      System.out.println("I'm a girl");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isSex() {
    return sex;
  }

  public void setSex(boolean sex) {
    this.sex = sex;
  }
}

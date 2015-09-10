package com.shiyanlou;

public class People1 {
  private String name = "LiLei";
  public class Student {
    String ID = "20151234";
    public void StuInfo() {
      System.out.println("Get name in outer class: " + name);
      System.out.println("Get ID in inner class: " + ID);
    }
  }

  public static void main(String[] args) {
    People1 a = new People1();
    Student b = a.new Student();
    b.StuInfo();
  }
}

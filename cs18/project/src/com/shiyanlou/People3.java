package com.shiyanlou;

public class People3 {
  public void peopleInfo() {
    final String sex = "man";
    class Student {
      String ID = "20151234";
      public void print() {
        System.out.println("Get constant sex from method of outer class: " + sex);
        System.out.println("Get ID from inner class: " + ID);
      }
    }
    Student a = new Student();
    a.print();
  }
  public static void main(String[] args) {
    People3 b = new People3();
    b.peopleInfo();
  }

}

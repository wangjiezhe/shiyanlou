package com.shiyanlou;

class Female extends Human {

  @Override
  public void Eat() {
    System.out.println("Female can eat.");
  }

  @Override
  public void Sleep() {
    System.out.println("Female can sleep.");
  }

  @Override
  public void Beat() {
    System.out.println("Female can beat doudou.");
  }

}

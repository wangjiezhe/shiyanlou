package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
  public void testDemo(List<?> s) {
    for (Object obj : s)
      System.out.println("我的类型是" + obj.getClass().getName());
  }

  public static void main(String[] args) {
    Test2 test = new Test2();
    Dog a0 = new Dog();
    Animal a1 = new Animal();
    List<Animal> s = new ArrayList<Animal>();
    s.add(a0);
    s.add(a1);
    test.testDemo(s);
  }
}

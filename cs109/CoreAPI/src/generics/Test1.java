package generics;

public class Test1 {
  public <T, S extends T> T TestDemo(T t, S s) {
    System.out.println("我是 T 类型，我的类型是" + t.getClass().getName());
    System.out.println("我是 S 类型，我的类型是" + s.getClass().getName());
    return t;
  }

  public static void main(String[] args) {
    Test1 test = new Test1();
    Dog d = new Dog();
    Animal a0 = new Animal();
    Animal a1 = test.TestDemo(a0, d);
    System.out.println("我是整数 a，我的类型是" + a1.getClass().getName());
  }
}

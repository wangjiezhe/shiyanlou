package generics;

public class TestDemo {

  public static void main(String[] args) {
    Test<Integer> intOb = new Test<Integer>(88);
    intOb.showType();
    int i = intOb.getOb();
    System.out.println("value= " + i);
    System.out.println("----------------------------------");
    Test<String> strOb = new Test<String>("Hello Gen!");
    strOb.showType();
    String s = strOb.getOb();
    System.out.println("value= " + s);
  }

}

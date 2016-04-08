package lang;

public class IntegerTest {

  public static void main(String[] args) {
    Integer a = new Integer("10");
    Integer b = new Integer(11);
    System.out.println(a.compareTo(b));
    float c = a.floatValue();
    System.out.println(c);
    String d = "10101110";
    int e = Integer.parseInt(d, 2);
    System.out.println(e);
  }

}

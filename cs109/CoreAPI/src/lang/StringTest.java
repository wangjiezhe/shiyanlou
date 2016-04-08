package lang;

public class StringTest {

  public static void main(String[] args) {
    String s0 = "abc";
    String s1 = new String("abd");
    System.out.println("Length of \"abc\": " + s0.length());

    String s = new String("java");
    String m = "Java";
    System.out.println("Using equals() to compare java and Java, the result is " + s.equals(m));
    System.out.println("Using equalsIgnoreCase() to compare java and Java, thre result is " + s.equalsIgnoreCase(m));

    s0 = new String("Hello ");
    s1 = "World" + "!";
    String s2 = s0.concat(s1);
    System.out.println(s2);

    s = "Hello ";
    s.concat("World!");
    System.out.println(s);
    s = s.concat("World!");
    System.out.println(s);

    StringBuffer b = new StringBuffer("I");
    b.append(" java");
    b.insert(1, " love");
    String t = b.toString();
    System.out.println(t);
  }

}

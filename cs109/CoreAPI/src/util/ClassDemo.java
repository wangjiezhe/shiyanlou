package util;

public class ClassDemo {

  public static void main(String[] args) throws ClassNotFoundException {
    String objString = new String();
    @SuppressWarnings("rawtypes")
    Class objClass;
    objClass = objString.getClass();
    System.out.println("Type of Sring object is: " + objClass.getName());
    objClass = Integer.class;
    System.out.println("Type of Integer object is: " + objClass.getName());
    objClass = Class.forName("java.lang.String");
    System.out.println("Type of Character object is: " + objClass.getName());
    objClass = objClass.getSuperclass();
    System.out.println("Parent of Character object is" + objClass.getName());
  }

}

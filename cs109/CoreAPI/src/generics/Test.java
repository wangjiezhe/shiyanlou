package generics;

public class Test<T> {
  private T ob;

  public Test(T ob) {
    this.ob = ob;
  }

  public T getOb() {
    return ob;
  }

  public void setOb(T ob) {
    this.ob = ob;
  }

  public void showType() {
    System.out.println("T的实际类型是: " + ob.getClass().getName());
  }

}

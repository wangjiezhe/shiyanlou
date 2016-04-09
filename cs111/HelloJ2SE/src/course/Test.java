package course;

public class Test {

  public static void main(String[] args) {
    Book book = new Book("This is my 1st book", "Peter", "1234567890");
    System.out.println("Book name: " + book.getName());
    System.out.println("Book author: " + book.getAuthor());
    System.out.println("ISBN: " + book.getISBN());
  }

}

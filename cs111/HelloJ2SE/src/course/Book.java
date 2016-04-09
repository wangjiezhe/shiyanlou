package course;

public class Book {

  private String name;
  private String author;
  private String ISBN;

  public Book(String name, String author, String iSBN) {
    this.name = name;
    this.author = author;
    ISBN = iSBN;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public String getISBN() {
    return ISBN;
  }

}

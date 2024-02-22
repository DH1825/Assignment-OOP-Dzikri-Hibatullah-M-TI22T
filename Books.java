public class Books {

  String author;
  String title;
  double price;
  int publisherNumber;

  // Constructor to initialize values
  public Books(String author, String title, double price, int publisherNumber) {
    this.author = author;
    this.title = title;
    this.price = price;
    this.publisherNumber = publisherNumber;
  }

  // Getters for accessing private fields
  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public int getPublisherNumber() {
    return publisherNumber;
  }

  // Method to display book information
  public void displayBookInfo() {
    System.out.println("Author: " + author);
    System.out.println("Title: " + title);
    System.out.println("Price: Rp. " + price);
    System.out.println("Publisher Number: " + publisherNumber);
  }
}

public class main {

  public static void main(String[] args) {
    // Create two book objects
    Books book1 = new Books(
      "Pramoedya Ananta Toer",
      "Bumi Manusia",
      50000.0,
      212122
    );
    Books book2 = new Books("Andrea Hirata", "Laskar Pelangi", 75000.0, 212123);
    Books book3 = new Books(
      "A.m. Lilik Agung",
      "Manusia Urban",
      100000.0,
      212124
    );

    // Calculate total price
    double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice();

    // Display information and total price
    System.out.println("Book 1:");
    book1.displayBookInfo();

    System.out.println("\nBook 2:");
    book2.displayBookInfo();

    System.out.println("\nBook 3:");
    book3.displayBookInfo();

    System.out.println("\nTotal price: Rp. " + totalPrice);
  }
}

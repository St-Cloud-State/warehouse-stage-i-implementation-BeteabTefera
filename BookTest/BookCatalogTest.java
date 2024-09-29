public class BookCatalogTest {
    public static void main(String[] args) {
        // Create a few members
        Member member1 = new Member("M001", "John Doe");
        Member member2 = new Member("M002", "Jane Doe");

        // Create and test Book instances with correct constructor
        Book book1 = new Book("12345", "Test Book", "Author Name");
        Book book2 = new Book("54321", "Another Book", "Another Author");

        // Print out book details
        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);

        // Create a Catalog and add books
        Catalog catalog = new Catalog();
        catalog.addBook(book1);
        catalog.addBook(book2);

        // Check if books are in the catalog
        System.out.println("Catalog contains book1: " + catalog.contains("12345"));
        System.out.println("Catalog contains book2: " + catalog.contains("54321"));

        // Simulate member borrowing a book
        System.out.println(member1.getName() + " is borrowing " + book1.getTitle());
        book1.issue(member1);  // Use issue method

        // Print the updated book details
        System.out.println("Updated Book 1: " + book1);
    }
}

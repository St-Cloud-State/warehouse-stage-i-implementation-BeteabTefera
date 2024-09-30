import java.util.List;

public class WishlistDriver {

    public static void main(String[] args) {
        // Create some sample Product objects to work with.  
        Product product1 = new Product("P001", "Smartphone", 100, 599.99);
        Product product2 = new Product("P002", "Laptop", 50, 899.99);
        Product product3 = new Product("P003", "Headphones", 200, 199.99);

        // Create a new Wishlist for a client with clientID "C1234".
        Wishlist wishlist = new Wishlist("C1234");

        // Add products to the wishlist.
        System.out.println("Adding product1: " + wishlist.addProduct(product1)); // true
        System.out.println("Adding product2: " + wishlist.addProduct(product2)); // true

        // Attempt to add the same product again (should fail).
        System.out.println("Adding product1 again: " + wishlist.addProduct(product1)); // false

        // Retrieve and display the products in the wishlist.
        List<Product> currentProducts = wishlist.getProducts();
        System.out.println("Current products in the wishlist:");
        for (Product product : currentProducts) {
            System.out.println(product.getProductInfo());
        }

        // Get product information for a specific product.
        System.out.println("Product Info for product1: " + wishlist.getProductInfo("P001"));

        // Update product details for product1.
        System.out.println("Updating product1:");
        boolean updateResult = wishlist.updateProduct("P001", 549.99, "Newer model with better battery", "Electronics");
        System.out.println("Update result: " + updateResult); // true

        // Display the updated product info.
        System.out.println("Updated Product Info for product1: " + wishlist.getProductInfo("P001"));

        // Remove a product from the wishlist.
        System.out.println("Removing product2: " + wishlist.removeProduct("P002")); // true

        // Display the wishlist after removal.
        currentProducts = wishlist.getProducts();
        System.out.println("Current products in the wishlist after removal:");
        for (Product product : currentProducts) {
            System.out.println(product.getProductInfo());
        };
    };
};

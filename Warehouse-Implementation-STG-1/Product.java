public class Product {
    private String productID;
    private String name;
    private int quantityInStock;
    private double salePrice;

    public Product(String productID, String name, int quantityInStock, double salePrice) {
        this.productID = productID;
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.salePrice = salePrice;
    }

    // Getter for productID
    public String getProductID() {
        return productID;
    }

    // Method to get product details as a string
    public String getProductInfo() {
        return "ID: " + productID + ", Name: " + name + ", Price: $" + salePrice + ", Stock: " + quantityInStock;
    }

    // Method to set a new price
    public void setPrice(double newPrice) {
        this.salePrice = newPrice;
    }

    // If you want to include description and category, you could add these fields:
    private String description;
    private String category;

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }
}

package p02;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Create a HashSet to store Product objects
        HashSet<Product> products = new HashSet<>();

        // Add predefined product information
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // List all the product details
        listProductDetails(products);
    }

    public static void listProductDetails(HashSet<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

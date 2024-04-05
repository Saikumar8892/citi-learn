package p04;

import java.util.HashSet;
import java.util.Iterator;

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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return productId.equals(other.productId) && productName.equals(other.productName);
    }

    @Override
    public int hashCode() {
        return productId.hashCode() + productName.hashCode();
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

        // Remove a particular product from the HashSet by product id
        String productIdToRemove = "P002";
        removeProductById(products, productIdToRemove);

        // List remaining products
        listProductDetails(products);
    }

    public static void removeProductById(HashSet<Product> products, String productId) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(productId)) {
                iterator.remove();
                //System.out.println("Product Removed: " + product);
                break; // Once product is removed, break the loop
            }
        }
    }

    public static void listProductDetails(HashSet<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

package p03;

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

        // Search for a particular product
        Product searchProduct = new Product("P003", "Maruti Dezire");
        if (products.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}

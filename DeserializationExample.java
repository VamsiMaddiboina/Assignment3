import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

public class DeserializationExample {
    public static void main(String[] args) {
        // Deserialize Product object from file
        Product product = deserializeProduct("product.ser");

        // Print deserialized Product details
        if (product != null) {
            System.out.println("Deserialized Product:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
        }
    }

    // Deserialize Product object from file
    private static Product deserializeProduct(String filename) {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            return (Product) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
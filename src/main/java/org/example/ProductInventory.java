package org.example;

public class ProductInventory {
    private int productID;
    private String name;
    private double price;
    private int stockQuantity;


    public ProductInventory(int productID, String name, double price, int stockQuantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + name);
        System.out.println("Price: R" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Stock Value: R" + calculateStockValue());
    }


    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + " items added successfully.");
        } else {
            System.out.println("Invalid quantity. Enter a value greater than zero.");
        }
    }


    public void sellProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid sale quantity.");
        } else if (quantity > stockQuantity) {
            System.out.println("Sale failed. Not enough stock available.");
        } else {
            stockQuantity -= quantity;
            System.out.println(quantity + " items sold successfully.");
        }
    }
    public double calculateStockValue() {
        return price * stockQuantity;
    }
}

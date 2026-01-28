package ConstructorsInstance.level2_instance_vs_class;

import java.util.Scanner;

/*
this program demonstrates instance vs class variables
totalProducts is shared by all product objects
*/
public class ProductInventoryStaticDemo {

    static class Product {
        String productName;
        double price;

        static int totalProducts = 0;

        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++;
        }

        void displayProductDetails() {
            System.out.println("product: " + productName);
            System.out.println("price: " + price);
        }

        static void displayTotalProducts() {
            System.out.println("total products created: " + totalProducts);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter product name: ");
        String name = sc.nextLine();
        System.out.print("enter price: ");
        double price = sc.nextDouble();

        Product p1 = new Product(name, price);
        System.out.println("\nproduct details:");
        p1.displayProductDetails();

        Product.displayTotalProducts();

        sc.close();
    }
}

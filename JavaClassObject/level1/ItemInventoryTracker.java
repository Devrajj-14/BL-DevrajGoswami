package JavaClassObject.level1;

import java.util.Scanner;

/*
this program tracks one item inventory
stores item name price and quantity and prints total value
*/
public class ItemInventoryTracker {

    static class Item {
        String name;
        double price;
        int quantity;

        Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        double totalValue() {
            return price * quantity;
        }

        void display() {
            System.out.println("item " + name);
            System.out.println("price " + price);
            System.out.println("quantity " + quantity);
            System.out.println("total value " + totalValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter item name ");
        String name = sc.nextLine();

        System.out.print("enter price ");
        double price = sc.nextDouble();

        System.out.print("enter quantity ");
        int quantity = sc.nextInt();

        // validation
        if (price < 0 || quantity < 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        Item item = new Item(name, price, quantity);
        item.display();

        sc.close();
    }
}

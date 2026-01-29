package JavaClassObject.level2;

import java.util.Scanner;

/*
this program simulates a small shopping cart
lets user add items and prints final bill
*/
public class ShoppingCartSimulation {

    static class Item {
        String name;
        double price;
        int qty;

        Item(String name, double price, int qty) {
            this.name = name;
            this.price = price;
            this.qty = qty;
        }

        double cost() {
            return price * qty;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] cart = new Item[10];
        int index = 0;

        while (true) {
            System.out.println("1 add item");
            System.out.println("2 checkout");
            System.out.print("choose ");
            int ch = sc.nextInt();
            sc.nextLine();

            // add item
            if (ch == 1) {
                if (index == cart.length) {
                    System.out.println("cart full");
                    continue;
                }

                System.out.print("enter name ");
                String name = sc.nextLine();

                System.out.print("enter price ");
                double price = sc.nextDouble();

                System.out.print("enter quantity ");
                int qty = sc.nextInt();
                sc.nextLine();

                // validation
                if (price <= 0 || qty <= 0) {
                    System.out.println("invalid input");
                    continue;
                }

                cart[index] = new Item(name, price, qty);
                index++;
                System.out.println("added");
            } else if (ch == 2) {
                break;
            } else {
                System.out.println("invalid choice");
            }
        }

        double total = 0.0;

        // loop to print cart items
        for (int i = 0; i < index; i++) {
            System.out.println(cart[i].name + " " + cart[i].qty + " " + cart[i].cost());
            total += cart[i].cost();
        }

        System.out.println("total " + total);

        sc.close();
    }
}

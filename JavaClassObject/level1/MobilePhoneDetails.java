package JavaClassObject.level1;

import java.util.Scanner;

/*
this program stores mobile phone details and prints them
uses brand model and price fields
*/
public class MobilePhoneDetails {

    static class MobilePhone {
        String brand;
        String model;
        double price;

        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void display() {
            System.out.println("brand " + brand);
            System.out.println("model " + model);
            System.out.println("price " + price);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter brand ");
        String brand = sc.nextLine();

        System.out.print("enter model ");
        String model = sc.nextLine();

        System.out.print("enter price ");
        double price = sc.nextDouble();

        // validation
        if (price < 0) {
            System.out.println("invalid price");
            sc.close();
            return;
        }

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.display();

        sc.close();
    }
}

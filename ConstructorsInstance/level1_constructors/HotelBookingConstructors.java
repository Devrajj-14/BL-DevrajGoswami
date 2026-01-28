package ConstructorsInstance.level1_constructors;

import java.util.Scanner;

/*
this program demonstrates default, parameterized and copy constructors
it creates hotel bookings and prints the booking details
*/
public class HotelBookingConstructors {

    static class HotelBooking {
        String guestName;
        String roomType;
        int nights;

        HotelBooking() {
            this.guestName = "guest";
            this.roomType = "standard";
            this.nights = 1;
        }

        HotelBooking(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        HotelBooking(HotelBooking other) {
            this.guestName = other.guestName;
            this.roomType = other.roomType;
            this.nights = other.nights;
        }

        void display() {
            System.out.println("guest: " + guestName);
            System.out.println("room type: " + roomType);
            System.out.println("nights: " + nights);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking b1 = new HotelBooking();
        System.out.println("default booking:");
        b1.display();

        System.out.print("\nenter guest name: ");
        String guest = sc.nextLine();
        System.out.print("enter room type: ");
        String room = sc.nextLine();
        System.out.print("enter nights: ");
        int nights = sc.nextInt();

        HotelBooking b2 = new HotelBooking(guest, room, nights);
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println("\nparameterized booking:");
        b2.display();

        System.out.println("\ncopy booking:");
        b3.display();

        sc.close();
    }
}

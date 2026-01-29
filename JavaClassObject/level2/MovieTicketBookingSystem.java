package JavaClassObject.level2;

import java.util.Scanner;

/*
this program books movie tickets with simple rules
takes movie name tickets price per ticket and prints total cost
*/
public class MovieTicketBookingSystem {

    static class Booking {
        String movieName;
        int tickets;
        double pricePerTicket;

        Booking(String movieName, int tickets, double pricePerTicket) {
            this.movieName = movieName;
            this.tickets = tickets;
            this.pricePerTicket = pricePerTicket;
        }

        double totalCost() {
            return tickets * pricePerTicket;
        }

        void display() {
            System.out.println("movie " + movieName);
            System.out.println("tickets " + tickets);
            System.out.println("total " + totalCost());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter movie name ");
        String movie = sc.nextLine();

        System.out.print("enter tickets ");
        int tickets = sc.nextInt();

        System.out.print("enter price per ticket ");
        double price = sc.nextDouble();

        // validation
        if (tickets <= 0 || price <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        Booking b = new Booking(movie, tickets, price);
        b.display();

        sc.close();
    }
}

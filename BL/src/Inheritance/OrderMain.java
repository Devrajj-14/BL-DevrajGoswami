package Inheritance;

/* main file for order system */
public class OrderMain {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "10 feb", "trk123", "15 feb");
        System.out.println(d.getOrderStatus()); // check final status
    }
}

/* base class order */
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId; // assign id
        this.orderDate = orderDate; // assign date
    }

    String getOrderStatus() {
        return "order placed"; // base status
    }
}

/* shipped order extends order */
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // call parent
        this.trackingNumber = trackingNumber; // assign tracking
    }

    String getOrderStatus() {
        return "order shipped"; // shipped status
    }
}

/* delivered order extends shipped order */
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // call parent
        this.deliveryDate = deliveryDate; // assign delivery date
    }

    String getOrderStatus() {
        return "order delivered"; // final status
    }
}


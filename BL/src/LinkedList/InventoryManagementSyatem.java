package LinkedList;

class Inventory {
    String name;
    int id;
    int quantity;
    int price;
    Inventory next;

    Inventory(String name, int id, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.id = id;
        this.price = price;
        this.next = null;
    }
}

class InventoryList {
    Inventory head;
    static int count = 0; // counts number of nodes/items in the list

    void addFirst(Inventory a) {
        a.next = head;
        head = a;
        count++;
    }

    void addEnd(Inventory a) {
        if (head == null) {          // handle empty list
            head = a;
            count++;
            return;
        }
        Inventory temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = a;
        a.next = null;
        count++;
    }

    // index is 0-based: 0 means insert at beginning
    void addSpecific(Inventory a, int index) {
        if (index <= 0 || head == null) {
            addFirst(a);
            return;
        }

        Inventory temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        a.next = temp.next;
        temp.next = a;
        count++;
    }

    boolean removeById(int id) {
        if (head == null) return false;

        // delete head
        if (head.id == id) {
            head = head.next;
            count--;
            return true;
        }

        Inventory prev = head;
        Inventory curr = head.next;

        while (curr != null) {
            if (curr.id == id) {
                prev.next = curr.next;
                count--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false; // not found
    }

    // update quantity of a specific item by id (set new quantity)
    boolean updateQuantityById(int id, int newQuantity) {
        Inventory temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // add/subtract quantity by id (delta can be + or -)
    boolean changeQuantityById(int id, int delta) {
        Inventory temp = head;
        while (temp != null) {
            if (temp.id == id) {
                int updated = temp.quantity + delta;
                if (updated < 0) return false; // safety
                temp.quantity = updated;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    int totalAmount() {
        int total = 0;
        Inventory temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        return total;
    }

    void display() {
        Inventory temp = head;
        while (temp != null) {
            System.out.println(
                    "Name: " + temp.name +
                            ", ID: " + temp.id +
                            ", Qty: " + temp.quantity +
                            ", Price: " + temp.price
            );
            temp = temp.next;
        }
    }
}

public class InventoryManagementSyatem {
    public static void main(String[] args) {
        InventoryList I1 = new InventoryList();

        // FIX: Task -> Inventory
        I1.addFirst(new Inventory("Sugar", 101, 22, 1000));
        I1.addEnd(new Inventory("Salt", 102, 10, 50));
        I1.addSpecific(new Inventory("Rice", 103, 5, 60), 1);

        System.out.println("All Items:");
        I1.display();

        System.out.println("\nUpdate quantity of ID 102 to 25:");
        System.out.println("Updated? " + I1.updateQuantityById(102, 25));
        I1.display();

        System.out.println("\nTotal Amount: " + I1.totalAmount());

        System.out.println("\nRemove ID 101:");
        System.out.println("Removed? " + I1.removeById(101));
        I1.display();

        System.out.println("\nTotal items(count): " + InventoryList.count);
    }
}

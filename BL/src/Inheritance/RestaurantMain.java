package Inheritance;

/* main file for restaurant system */
public class RestaurantMain {
    public static void main(String[] args) {
        Worker c = new Chef("rahul", 1);
        Worker w = new Waiter("aman", 2);

        c.performDuties(); // chef work
        w.performDuties(); // waiter work
    }
}

/* interface worker */
interface Worker {
    void performDuties(); // common work method
}

/* base class person */
class Personn {
    String name;
    int id;

    Personn(String name, int id) {
        this.name = name; // assign name
        this.id = id; // assign id
    }
}

/* chef extends person and implements worker */
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id); // call parent
    }

    public void performDuties() {
        System.out.println("chef cooks food"); // chef duty
    }
}

/* waiter extends person and implements worker */
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id); // call parent
    }

    public void performDuties() {
        System.out.println("waiter serves food"); // waiter duty
    }
}

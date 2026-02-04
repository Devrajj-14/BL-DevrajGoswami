package LinkedList;

/*
class Task
- Represents one task node in the circular linked list
- Fields: id, name, priority, dueDate, next
*/
class Task {
    int id;
    String name;
    int priority;
    int dueDate;
    Task next;

    Task(int id, String name, int priority, int dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

/*
class TaskList
- Manages the circular linked list of tasks
- Maintains head, tail, and current pointer for scheduler rotation
- Supports: addFirst, addEnd, addAtPosition, removeById, viewCurrent, moveToNext, displayAll, searchByPriority
*/
class TaskList {
    Task head;
    Task tail;
    Task current;

    void addFirst(Task newNode) {
        // handle empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            current = head;
            return;
        }
        // link new node before head and fix circular link
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    void addEnd(Task newNode) {
        // handle empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            current = head;
            return;
        }
        // link after tail and update tail and circular link
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void addAtPosition(Task newNode, int position) {
        // position <= 0 means add at beginning
        if (position <= 0 || head == null) {
            addFirst(newNode);
            return;
        }
        // traverse to node before desired position (or stop at tail)
        Task curr = head;
        int idx = 0;
        while (idx < position - 1 && curr != tail) {
            curr = curr.next;
            idx++;
        }
        // if reached tail, position is beyond size -> add at end
        if (curr == tail) {
            addEnd(newNode);
            return;
        }
        // insert between curr and curr.next
        newNode.next = curr.next;
        curr.next = newNode;
    }

    boolean removeById(int id) {
        // empty list
        if (head == null) return false;

        // single node case
        if (head == tail && head.id == id) {
            head = tail = current = null;
            return true;
        }

        // remove head
        if (head.id == id) {
            head = head.next;
            tail.next = head;
            if (current != null && current.id == id) current = head;
            return true;
        }

        // remove middle/tail
        Task prev = head;
        Task curr = head.next;
        while (curr != head) {
            if (curr.id == id) {
                prev.next = curr.next;
                if (curr == tail) tail = prev;
                if (current != null && current.id == id) current = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    void viewCurrent() {
        // no current task
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        // print current task details
        System.out.println(
                "Current Task -> ID: " + current.id +
                        ", Name: " + current.name +
                        ", Priority: " + current.priority +
                        ", DueDate: " + current.dueDate
        );
    }

    void moveToNext() {
        // no tasks
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        // move to next in circular manner
        current = current.next;
    }

    void displayAll() {
        // empty list
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        // traverse once around the circle starting from head
        Task temp = head;
        do {
            System.out.println(
                    "ID: " + temp.id +
                            ", Name: " + temp.name +
                            ", Priority: " + temp.priority +
                            ", DueDate: " + temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        // empty list
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        // find matching tasks in one full circular traversal
        boolean found = false;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(
                        "Found -> ID: " + temp.id +
                                ", Name: " + temp.name +
                                ", DueDate: " + temp.dueDate
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        // no matches
        if (!found) System.out.println("No task found with priority: " + priority);
    }
}

/*
class TaskSheduler
- Demo runner for TaskList operations
*/
public class TaskSheduler {
    public static void main(String[] args) {
        // create scheduler
        TaskList scheduler = new TaskList();

        // add tasks
        scheduler.addEnd(new Task(1, "Java Revision", 2, 20260204));
        scheduler.addFirst(new Task(2, "DSA Linked List", 1, 20260205));
        scheduler.addAtPosition(new Task(3, "UML Practice", 3, 20260206), 1);

        // display all tasks
        System.out.println("All Tasks:");
        scheduler.displayAll();

        // view current and move next
        System.out.println("\nCurrent + Next:");
        scheduler.viewCurrent();
        scheduler.moveToNext();
        scheduler.viewCurrent();

        // search by priority
        System.out.println("\nSearch Priority = 1:");
        scheduler.searchByPriority(1);

        // remove by id
        System.out.println("\nRemove ID = 2:");
        System.out.println("Removed? " + scheduler.removeById(2));
        scheduler.displayAll();
    }
}

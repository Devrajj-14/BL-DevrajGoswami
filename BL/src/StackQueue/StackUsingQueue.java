package StackQueue;
import java.util.*;


class queueStack{


    Stack<Integer> inSt= new Stack<>();
    Stack<Integer> outSt=new Stack<>();

    void enQueue(int x){
        inSt.push(x);
    }
    void shiftQueue(){
        if(outSt.empty()){
            while(!inSt.empty()){
                outSt.push(inSt.pop());
            }
        }
    }
    Integer deQueue(){
        shiftQueue();
        if(outSt.empty()){
            throw new RuntimeException("queue is empty");
        }
        return outSt.pop();
    }
    int front(){
        shiftQueue();
        if(outSt.empty()){
            throw new RuntimeException("enpty");
        }
        return outSt.peek();
    }
    public boolean empty(){
        return inSt.empty() && outSt.empty() ;
    }
}

public class StackUsingQueue {
    public static void main(String[] args){
        queueStack q1 = new queueStack();

        q1.enQueue(10);
        q1.enQueue(13);
        q1.enQueue(14);
        q1.enQueue(15);
        q1.enQueue(16);

        System.out.println(" :" + q1.front() );
        System.out.println(" :" + q1.deQueue() );
        q1.enQueue(40);
        System.out.println(q1.front());   // prints 30


// deQueue() removes 30 from outSt
// after: inSt: [40]  outSt: []
        System.out.println(q1.deQueue()); // prints 30


// deQueue() now: outSt is empty, so shiftQueue() runs
// move 40 from inSt -> outSt
// after shift: inSt: []  outSt: [40]
// pop outSt => 40
        System.out.println(q1.deQueue()); // prints 40


// empty() checks BOTH stacks are empty
// inSt empty AND outSt empty => true
        System.out.println(q1.empty());

    }
}

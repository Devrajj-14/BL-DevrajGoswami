package StackQueue;

import java.util.Stack;

class StackCheck {

    int[] stockSpan(int[] price) {

        int n = price.length;
        Stack<Integer> st = new Stack<>();
        int[] span = new int[n];

        for(int i =0; i<price.length ;i++) {
            while (!st.empty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            // if nothing left, span is full length till start
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                // distance from last higher price day
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}

public class StockSpan {
    public static void main(String[] args) {

        StackCheck s1= new StackCheck();

        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int [] ans =s1.stockSpan(price);

        for (int x : ans) {
            System.out.print(x + " ");
        }

    }
}

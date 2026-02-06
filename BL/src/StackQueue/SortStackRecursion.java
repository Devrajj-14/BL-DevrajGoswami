package StackQueue;

import java.util.Stack;

class stack{
     void storeStack(Stack<Integer> st){
         if(st.empty())return;

         int top=  st.pop();
         insertStack(st,top);
     }
     void insertStack(Stack<Integer> st , int top){
         if(st.empty() || top<=st.peek()){
             st.push(top);
             return;
         }
         int t =st.pop();
         insertStack(st,top);
         st.push(t);
     }

}

public class SortStackRecursion {
    public static void main(String[] args) {

        stack s1 = new stack();

        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        s1.storeStack(st);
        System.out.println(st);
    }
}
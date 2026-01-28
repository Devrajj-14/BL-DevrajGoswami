package javaContorlFlow.level1;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {

        // loops for tables 6 to 9
        for (int num = 6; num <= 9; num++) {
            System.out.println("Table of " + num);

            // loop from 1 to 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.println();
        }
    }
}

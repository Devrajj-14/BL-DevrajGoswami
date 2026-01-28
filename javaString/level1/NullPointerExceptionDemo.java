package javaString.level1;

/*
   shows nullpointerexception in two ways:
   1) generates exception (handled in main so program doesn't die)
   2) handles exception inside method using try-catch
*/
public class NullPointerExceptionDemo {

    static void generateException() {
        String text = null;
        System.out.println(text.length()); // this line will throw exception
    }

    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("caught nullpointerexception");
        } catch (RuntimeException e) {
            System.out.println("caught runtime exception");
        }
    }

    public static void main(String[] args) {
        System.out.println("generating...");
        try {
            generateException();
        } catch (RuntimeException e) {
            System.out.println("program stopped, exception came");
        }

        System.out.println("handling...");
        handleException();
    }
}

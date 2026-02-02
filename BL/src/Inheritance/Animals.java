package Inheritance;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void makeSound(){
    }
}
class Dog extends Animal{
    Dog(String name ,int  age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("dog barks ");
    }
}
class cat extends Animal{
    cat(String name, int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("cat meow");
    }
}
class bird extends Animal{
    bird(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("the bird flys");
    }
}

public class  Animals{
    public static void main(String[] args){
        Animal a1 =new Dog("cocc",10);
        Animal a2 = new cat("ros",9);
        Animal a3 = new bird("aaa",90);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();

    }
}

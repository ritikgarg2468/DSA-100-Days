// OOPS Concepts in Java

// 1. Encapsulation Example
class Person {
    private String name; // private = encapsulated
    private int age;

    // Public getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

// 2. Inheritance Example
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 3. Polymorphism Example
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// 4. Abstraction Example
abstract class Vehicle {
    abstract void start(); // abstract method
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts");
    }
}

// Main class to demonstrate all concepts
public class OOPS {
    public static void main(String[] args) {
        // Encapsulation
        Person p = new Person();
        p.setName("Alice");
        p.setAge(25);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());

        // Inheritance
        Dog d = new Dog();
        d.eat(); // inherited from Animal
        d.bark();

        // Polymorphism
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.draw(); // Drawing a circle
        s2.draw(); // Drawing a square

        // Abstraction
        Vehicle v = new Car();
        v.start();
    }
}

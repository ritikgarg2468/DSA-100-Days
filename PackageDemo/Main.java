import pom.Calculator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calc = new Calculator();
        
        // Use the calculator methods
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
} 
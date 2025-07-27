
//Functional Interface
@FunctionalInterface
interface MathOperation {
 int operate(int a, int b);
}

public class LambdaExpUsingFunctionalInterface {
 public static void main(String[] args) {
     // Lambda for Addition
     MathOperation add = (a, b) -> a + b;

     // Lambda for Subtraction
     MathOperation subtract = (a, b) -> a - b;

     // Lambda for Multiplication
     MathOperation multiply = (a, b) -> a * b;

     // Call each lambda expression
     System.out.println("Addition: " + add.operate(10, 5));         // Output: 15
     System.out.println("Subtraction: " + subtract.operate(10, 5)); // Output: 5
     System.out.println("Multiplication: " + multiply.operate(10, 5)); // Output: 50
 }
}


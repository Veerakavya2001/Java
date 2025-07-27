
//Write a program to show:
//o Pre/post increment
//o Bitwise shift operators
//o Logical vs Bitwise & and &&
public class OperatorsDemo {
    public static void main(String[] args) {

        // 🔹 1. Pre/Post Increment
        int a = 5;
        System.out.println("Original a: " + a);
        System.out.println("Post-increment (a++): " + (a++)); // prints 5, then a becomes 6
        System.out.println("After post-increment, a: " + a);  // prints 6
        System.out.println("Pre-increment (++a): " + (++a));  // a becomes 7, then prints 7

        // 🔹 2. Bitwise Shift Operators
        int x = 8; // binary: 1000
        System.out.println("\nOriginal x: " + x);
        System.out.println("Left shift (x << 1): " + (x << 1));  // 16 (10000)
        System.out.println("Right shift (x >> 1): " + (x >> 1)); // 4  (0100)

        // 🔹 3. Logical vs Bitwise AND
        int num1 = 10, num2 = 5;

        System.out.println("\nLogical AND (&&):");
        // Short-circuit: right side is not checked if left is false
        if (num1 < 5 && ++num2 > 3) {
            System.out.println("Inside logical AND");
        }
        System.out.println("Value of num2 after logical AND: " + num2); // num2 not incremented

        num2 = 5; // reset value

        System.out.println("\nBitwise AND (&):");
        // Both sides are checked even if left is false
        if (num1 < 5 & ++num2 > 3) {
            System.out.println("Inside bitwise AND");
        }
        System.out.println("Value of num2 after bitwise AND: " + num2); // num2 incremented
    }
}


package OOP_XAN;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Instantiate the modules
        ArithMod arith = new ArithMod();
        Circle circle = new Circle();
        NumberAnalysis nal = new NumberAnalysis();

        // --- Test Case Group 2: Arithmetic Operations ---
        arith.setOperands(15, 10);
        System.out.println("The result of adding " + Arrays.toString(arith.getOperands().toArray()) +
                " is: " + arith.addAll() + ".");

        // --- Test Case 2.1 - Division by Zero ---
        arith.setOperands(20, 0);
        String divOutput = arith.divideAll(); // This returns "Undefined" safely
        System.out.println("The result of dividing " + Arrays.toString(arith.getOperands().toArray()) +
                " is: " + divOutput + ".");

        // --- Test Case Group 3: Geometry Operations ---
        circle.setRadius(5);
        System.out.println("OOP_XAN.Circle Area: " + circle.computeArea());

        circle.setRadius(-3); // This will print error to System.err
        System.out.println("OOP_XAN.Circle Area (r=-3): " + circle.computeArea());

        // --- Test Case Group 4: Number Analysis Module ---

        // Test Case 4.1 – Prime Number Check (Input: 7)
        nal.setNumber(7);
        System.out.println("Input: " + nal.getOperand(0) + " -> Result: " + nal.primeCheck());

        // Test Case 4.2 – Non-Prime Number Check (Input: 10)
        nal.setNumber(10);
        System.out.println("Input: " + nal.getOperand(0) + " -> Result: " + nal.primeCheck());

        // Test Case 4.3 – Factorial Check
        nal.setNumber(5);
        System.out.println("Factorial of " + nal.getOperand(0) + " is: " + nal.factorial());
    }
}
package OOP_XAN;

import java.util.List;

public class NumberAnalysis extends MathOp {


    public void setNumber(double number) {
        super.setOperand(0, number);
    }


    public String primeCheck() {
        List<Double> ops = getOperands();
        if (ops == null || ops.isEmpty()) {
            return "No number provided.";
        }

        double n = ops.get(0);


        if (n != (int)n || n <= 1) {
            return "Not a prime number.";
        }

        int num = (int)n;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return "Not a prime number.";
            }
        }

        return "A prime number.";
    }


    public String factorial() {
        List<Double> ops = getOperands();
        if (ops == null || ops.isEmpty()) {
            return "No number provided.";
        }

        double n = ops.get(0);
        long result = 1;

        if (n < 0) {
            return "The factorial is not defined for negative numbers.";
        } else {
            // Factorial is for integers
            for (int i = 1; i <= (int)n; i++) {
                result *= i;
            }
        }
        return String.valueOf(result) + ".";
    }

    // Implementing abstract method from OOP_XAN.MathOp
    @Override
    public double calculate() {
        // Default behavior: check if it's prime, return 1 for true, 0 for false
        return primeCheck().equals("A prime number.") ? 1.0 : 0.0;
    }
}
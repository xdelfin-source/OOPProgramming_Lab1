package OOP_XAN;

import java.util.List;

public class ArithMod extends MathOp {

    // Helper method to ensure operands exist
    private void checkOperands() {
        if (getOperands() == null || getOperands().isEmpty()) {
            throw new IllegalStateException("Operands are not set.");
        }
    }

    public double addAll() {
        checkOperands();
        double sum = 0;
        for (double val : getOperands()) {
            sum += val;
        }
        return sum;
    }

    public double multiplyAll() {
        checkOperands();
        double product = 1;
        // TWEAK: getOperands() returns List<Double>
        for (double val : getOperands()) {
            product *= val;
        }
        return product;
    }

    public double subtractAll() {
        checkOperands();
        List<Double> ops = getOperands();
        double result = ops.get(0);
        for (int i = 1; i < ops.size(); i++) {
            result -= ops.get(i);
        }
        return result;
    }

    public String divideAll() {
        checkOperands();
        List<Double> ops = getOperands();
        double result = ops.get(0);
        for (int i = 1; i < ops.size(); i++) {
            if (ops.get(i) == 0) {
                return "Undefined";
            }
            result /= ops.get(i);
        }
        return String.valueOf(result);
    }

    @Override
    public double calculate() {
        // Default behavior: return result of addition
        return addAll();
    }
}
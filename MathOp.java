import java.util.ArrayList;
import java.util.List;

public class MathOp {

    private List<Double> operands;

    public MathOp() {
        this.operands = new ArrayList<>();
    }


    public void setOperands(double... values) {
        this.operands.clear();
        for (double value : values) {
            this.operands.add(value);
        }
    }


    public void setOperand(int index, double value) {
        while (operands.size() <= index) {
            operands.add(0.0);
        }
        operands.set(index, value);
    }

    public List<Double> getOperands() {
        return new ArrayList<>(operands);
    }

    // Original method preserved
    public double getOperand(int index) {
        if (index < 0 || index >= operands.size()) {
            throw new IndexOutOfBoundsException("Operand index out of range.");
        }
        return operands.get(index);
    }


    public double calculate() {
        throw new UnsupportedOperationException("Subclass must implement calculate()");
    }

    public void clearOperands() {
        operands.clear();
    }
}
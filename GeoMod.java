import java.util.List;


abstract class GeometryOperations extends MathOp {
    public abstract String computeArea();
}

// Circle Implementation
class Circle extends GeometryOperations {

    // Using setter to match requested logic
    public void setRadius(double radius) {
        // Ensuring we use only index 0 for radius
        super.setOperand(0, radius);
    }

    @Override
    public String computeArea() {
        List<Double> ops = getOperands();

        // Safety check
        if (ops == null || ops.isEmpty()) {
            return "0";
        }

        double radius = ops.get(0);

        // Logic from target code
        if (radius < 0) {
            return "This circle has a negative radius";
        }

        return String.valueOf(Math.PI * Math.pow(radius, 2));
    }

    public double computeCircumference() {
        List<Double> ops = getOperands();
        if (ops == null || ops.isEmpty()) {
            return 0;
        }

        double radius = ops.get(0);
        return 2 * Math.PI * radius;
    }

    // Implementing abstract method from MathOp
    @Override
    public double calculate() {
        try {
            return Double.parseDouble(computeArea());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}

// Rectangle Implementation
class Rectangle extends GeometryOperations {

    public void setDimensions(double length, double width) {
        super.setOperand(0, length);
        super.setOperand(1, width);
    }

    @Override
    public String computeArea() {
        List<Double> ops = getOperands();
        if (ops == null || ops.size() < 2) {
            return "0";
        }

        double length = ops.get(0);
        double width = ops.get(1);

        if (length < 0 || width < 0) {
            return "Dimensions cannot be negative";
        }

        return String.valueOf(length * width);
    }

    public double computePerimeter() {
        List<Double> ops = getOperands();
        if (ops == null || ops.size() < 2) {
            return 0;
        }

        double length = ops.get(0);
        double width = ops.get(1);
        return 2 * (length + width);
    }

    // Implementing abstract method from MathOp
    @Override
    public double calculate() {
        try {
            return Double.parseDouble(computeArea());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
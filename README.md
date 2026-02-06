
# OOP Math Operations Project


OPP_XAN
    ├── Main.java           # Entry point and test cases
    ├── MathOp.java         # Base Class (Encapsulation)
    ├── ArithMod.java       # Derived Class: Arithmetic
    ├── GeoMod.java         # Derived Class: Geometry (Circle/Rectangle)
    └── NumberAnalysis.java # Derived Class: Number Theory

## Design Requirements Met

### 1. Base Class: `MathOp`

* **Encapsulation**: Operands are stored in a `private List<Double>` to protect data integrity.
* **Access**: Data is accessed via public methods (`setOperands`, `getOperands`).
* **Genericity**: The class provides a foundation for any math operation without being specific to one.

### 2. Derived Classes

* **Inheritance**: `ArithMod`, `GeoMod`, and `NumberAnalysis` extend `MathOp`.
* **Specialization**:
* **`ArithMod`**: Performs addition, subtraction, multiplication, and division. Includes safety checks for division by zero.
* **`GeoMod`**: Handles shape calculations (Area, Circumference/Perimeter) with negative value checks.
* **`NumberAnalysis`**: Handles specialized calculations like prime number checks and factorials.


Example Output

The result of adding [15.0, 10.0] is: 25.0.
The result of dividing [20.0, 0.0] is: Undefined.
Circle Area: 78.53981633974483
Circle Area (r=-3): This circle has a negative radius
Input: 7.0 -> Result: A prime number.
Input: 10.0 -> Result: Not a prime number.
Factorial of 5.0 is: 120.

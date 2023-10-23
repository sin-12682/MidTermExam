package arithmetic;

public class ArithmeticBase {
    public double calculate(double x, double y, ArithmeticOperation operation) {
        return operation.apply(x, y);
    }
}

package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();

        // Get the arithmetic operation from the user
        System.out.println("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE): ");
        ArithmeticOperation operation = ArithmeticOperation.valueOf(in.next().toUpperCase());

        double result = r.calculate(m, n, operation);
        System.out.println("Result: " + result);
    }
}

package math;

public class Calculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }
    public int subtractNumbers(int a, int b) {
        return a - b;
    }
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }
    public int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

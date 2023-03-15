package pl.plonka.marcel;

public class FactorialWithRecursion implements Factorial {
    private int factorialNumber;

    private int factorialRecursionResult(int factorialNumber) {
        if (factorialNumber < 2) {
            return factorialNumber;
        }
        return factorialNumber * factorialRecursionResult(factorialNumber - 1);
    }
    @Override
    public void printResult() {
        System.out.println("The factorial of the number is: " + factorialRecursionResult(factorialNumber));
    }

    public void setFactorialNumber(int factorialNumber) {
        this.factorialNumber = factorialNumber;
    }
}

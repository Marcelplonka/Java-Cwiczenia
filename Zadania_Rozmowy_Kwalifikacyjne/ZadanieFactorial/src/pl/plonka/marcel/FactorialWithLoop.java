package pl.plonka.marcel;

public class FactorialWithLoop implements Factorial {
    private int factorialNumber;

    private int factorialLoopResult(int factorialNumber) throws IllegalArgumentException{
        int number = 1;
        if (factorialNumber < 1) {
            throw new IllegalArgumentException("The wrong numerical variable ha been entered.");
        }

        do {
            number *= factorialNumber;
            factorialNumber--;
        } while (factorialNumber > 1);
        return number;
    }
    @Override
    public void printResult() {
        try {
            System.out.println("The factorial of the number is: " + factorialLoopResult(factorialNumber));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public void setFactorialNumber(int factorialNumber) {
        this.factorialNumber = factorialNumber;
    }
}

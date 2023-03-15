package pl.plonka.marcel;

public class CheckPalindrome {
    private int number;

    public CheckPalindrome() {}

    // Check Palindrome Number

    public void checkNumber() {
        if (number < 0) number *= -1;
        int reverseNumber = reverse(number);

        if (number == reverseNumber) {
            System.out.println("Palindrome number.");
        } else {
            System.out.println("Not palindrome number.");
        }
    }
    private int reverse(int reverseNumber) {
        int temp = 0;

        while (reverseNumber != 0) {
            temp *= 10;
            temp += reverseNumber % 10;
            reverseNumber /= 10;
        }

        return temp;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

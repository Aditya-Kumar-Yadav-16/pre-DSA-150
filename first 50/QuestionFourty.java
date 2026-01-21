// Calculating the Sum of Digits of a Number Until Single Digit
// Difficulty: Medium
// Topics: Mathematical Computations
// Description: Write a program to keep summing the digits of a number until a single digit is obtained.
// Example:
// Input: number = 9875
// Output: 2
// Explanation: The sum of digits is 9 + 8 + 7 + 5 = 29, and then 2 + 9 = 11, and finally 1 + 1 = 2.

import java.util.*;
public class QuestionFourty{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = sumOfDigitsUntilSingleDigit(number);
        System.out.println("The single digit sum is: " + result);
    }

    public static int sumOfDigitsUntilSingleDigit(int number) {
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}

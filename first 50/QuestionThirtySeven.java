// Finding the Sum of Squares of Digits
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to find the sum of the squares of the digits of a number

import java.util.*;

public class QuestionThirtySeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sumOfSquares = 0;
        while(number > 0){
            int digit = number % 10;
            sumOfSquares += digit * digit;
            System.out.println("Digit: " + digit + ", Square: " + (digit * digit) + ", Current Sum: " + sumOfSquares);
            number /=10;
            
        }
        System.out.println("Sum of squares of digits: " + sumOfSquares);
    }
}
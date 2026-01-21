// Finding the Fibonacci Number at a Specific Position
// Difficulty: Easy
// Topics: Basic Programming, Sequences
// Description: Write a program to find the Fibonacci number at a specific position.

import java.util.*;
public class QuestionTwentyThree {
    public static int fibonacci(int n){
        if(n <= 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the position to find the Fibonacci number:");
        int n = sc.nextInt();
        int fibNumber = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fibNumber);
    }
}
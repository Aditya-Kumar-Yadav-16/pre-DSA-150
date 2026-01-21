// Checking for Armstrong Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find all Armstrong numbers within a given range.

import java.util.*;

public class QuestionSeventeen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range (two numbers):");
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        System.out.println("Range is: [" + lower + ", " + upper + "]");
        System.out.println("Armstrong numbers in the given range are:");

        printArmstrong(lower, upper);
    }

    public static void printArmstrong(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            int original = i;
            int sum = 0;

            int digits = String.valueOf(i).length();
            int current = i;

            while (current != 0) {
                int digit = current % 10;
                sum += (int) Math.pow(digit, digits);
                current /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}

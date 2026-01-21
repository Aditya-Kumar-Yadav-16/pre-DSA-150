// Calculating the Power of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to calculate the power of a number.

import java.util.*;
public class QuestionThirtyThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= exponent; i++){
            result = result * base ;
        }
        System.out.println("The result is: " + result);
    }
}
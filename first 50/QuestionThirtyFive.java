// Finding the Sum of Prime Numbers in a Range
// Difficulty: Medium
// Topics: Number Theory, Mathematical Computations
// Description: Write a program to calculate the sum of all prime numbers within a given range.

import java.util.*;
public class QuestionThirtyFive {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start = Sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end = Sc.nextInt();
        System.out.println("Calculating the sum of prime numbers from " + start + " to " + end);    
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.print(i + " is a prime number."+ "\n");
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers in the range is: " + sum);
    }
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
// Finding the Sum of Prime Factors of a Number
// Difficulty: Medium
// Topics: Number Theory, Mathematical Computations
// Description: Write a program to find the sum of the prime factors of a given number.
// Example:
// Input: number = 12
// Output: 5
// Explanation: The prime factors of 12 are 2 and 3, and their sum is 2 + 3 = 5.


import java.util.*;
public class QuestionFourtyEight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number:");
        int number = sc.nextInt();
        int sum =0;
        for(int i=2;i<=number;i++){
            if(PrimeNumber(i) == 1 && number % i == 0){
                sum +=i;
                while(number % i == 0){
                    number /=i;
                }
            }
        }
        System.out.println(sum);
    }
    public static int PrimeNumber(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return 0;
            }
        }
        return 1;
    }
}
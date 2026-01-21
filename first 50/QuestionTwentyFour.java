// Printing Prime Numbers Less Than a Given Number
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to print all prime numbers less than a given number.

import java.util.*;
public class QuestionTwentyFour {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
        }return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number:");
        int limit = sc.nextInt();
        System.out.println("Prime number less than "+limit+" are:");
        for(int i=2;i<limit;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
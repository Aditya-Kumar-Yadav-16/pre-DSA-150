// Finding Prime Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find all prime numbers within a given range.

import java.util.*;
public class QuestionNinteen {
    public static boolean isPrime(int num){
        
        if(num<=1){
            return false;
        }
        for(int j=2;j<=Math.sqrt(num);j++){
            if (num%j==0){
                return false;
            }
        }
        return true;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the lower limit:");
        int lower =sc.nextInt();
        System.out.println("Entre the upper limit:");
        int upper = sc.nextInt();
        System.out.println("range is:["+lower+","+upper+"]");
        System.out.println("Prime numbers in the given range are:");
        for(int num = lower; num<=upper;num++){
            if(isPrime(num)){
                System.out.print(num+" ");
            }
        }
    }
}
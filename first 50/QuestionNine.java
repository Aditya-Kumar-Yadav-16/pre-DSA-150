// Summing Digits of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to calculate the sum of digits of a number.

import java.util.*;
public class QuestionNine{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number");
        int num=sc.nextInt();

        int sum=0;
        while(num>0){
            int digit=num%10;
            sum +=digit;
            num /=10;
        }
        System.out.println("the sum of the digits is:"+sum);
    }
}
// Calculating the Sum of Even Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to find the sum of all even numbers within a given range.

import java.util.*;
public class QuestionTwentyOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the ranges:");
        int lower = sc.nextInt();
        int upper= sc.nextInt();
        int sum=0;
        for(int i=lower;i<=upper;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("the sum of even number between "+lower+" and "+upper+" is: "+sum);
    }
}
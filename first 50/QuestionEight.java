// Finding the Factorial of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to compute the factorial of a given number.

import java.util.*;
public class QuestionEight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of "+n+"is:"+fact);
    }
}
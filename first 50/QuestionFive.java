// Generating the Fibonacci Series
// Difficulty: Easy
// Topics: Basic Programming, Sequences
// Description: Write a program to generate the Fibonacci series up to a given number.

import java.util.*;
public class QuestionFive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second =1;

        System.out.print("Fibonacci Series: "+first +" "+second);

        for (int i=2;i<n;i++){
            int next=first+second;
            System.out.print(" "+next);
            first=second;
            second=next;
        }
    }
}
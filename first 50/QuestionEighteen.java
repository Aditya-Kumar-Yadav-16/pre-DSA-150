// Generating Multiplication Tables
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to generate multiplication tables for a given number.

import java.util.*;
public class QuestionEighteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number to generate its multiplication table:");
        int num = sc.nextInt();
        System.out.println("Multiplication of "+num+" is:");
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
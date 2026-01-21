// Finding the Number of Digits in a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to count the number of digits in a given number.

import java.util.*;
public class QuestionTwentyFive{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre a number:");
    int number=sc.nextInt();
    int count=0;
    while(number!=0){
        number=number/10;
        count++;
    }
    System.out.println("Number of digits: "+count);
}
}

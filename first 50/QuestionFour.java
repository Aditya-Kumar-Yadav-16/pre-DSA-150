// Calculating Armstrong Numbers
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to check if a number is an Armstrong number.

import java.util.*;
public class QuestionFour{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int orignalNum=num;
        int sum=0;

        while(num !=0){
            int digit=num%10;
            sum += digit*digit*digit;
            num /=10;

        }
        if (orignalNum==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong number");
        }
}
}
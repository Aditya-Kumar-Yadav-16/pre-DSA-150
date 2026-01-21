// Validating Leap Years
// Difficulty: Easy
// Topics: Basic Programming, Date Handling
// Description: Write a program to check if a given year is a leap year.

import java.util.*;
public class QuestionThree{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        if (year%4==0){
            System.out.println("leap year");

        }else{
            System.out.println("not a leap year");
        }
    }
}
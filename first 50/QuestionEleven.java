// Finding the Least Common Multiple (LCM)
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find the LCM of two numbers.

import java.util.*;

public class QuestionEleven{
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int b =sc.nextInt();
        int gcd=1;

        int lcm=(a*b)/gcd(a,b);
        System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
    }
}

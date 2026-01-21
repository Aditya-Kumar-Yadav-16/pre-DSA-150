// Finding the Greatest Common Divisor (GCD)
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find the GCD of two numbers.

import java.util.*;
public class QuestionTen{

    public static int gcd(int a, int b){
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number:");
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is: "+gcd(a,b));
    }
}


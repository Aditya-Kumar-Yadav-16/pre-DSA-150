// Calculating the Sum of Odd Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to find the sum of all odd numbers within a given range.

import java.util.*;
public class QuestionTwentyTwo{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();
        int sum = 0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                sum += i;
            }
        }System.out.println("The Sum of Odd Numbers from "+start+" to "+end+" is: "+sum);
    }
}
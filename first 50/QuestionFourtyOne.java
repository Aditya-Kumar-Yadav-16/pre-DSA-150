// Finding the Count of Specific Digits in a Number
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to count the occurrences of a specific digit in a number.
// Example:
// Input: number = 122333, digit = 3
// Output: 3
// Explanation: The digit 3 occurs 3 times in the number 122333.

import java.util.*;
public class QuestionFourtyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        System.out.print("Enter the digit to count: ");
        char digit = sc.nextLine().charAt(0);
        
        int count = 0;
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == digit){
                count++;
            }
        }
        
        System.out.println("The digit " + digit + " occurs " + count + " times in the number " + number + ".");
    }
}
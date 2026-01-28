// Determining the Length of a String Without Using Built-In Functions
// Difficulty: Medium
// Topics: String Manipulation
// Description: Write a program to determine the length of a string without using built-in functions.
// Example:
// Input: string = "hello"
// Output: 5
// Explanation: The length of the string "hello" is determined without using built-in functions.

import java.util.*;
class QuestionFortySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int length = getStringLength(inputString);
        System.out.println("Length of the string: " + length);
    }
    public static int getStringLength(String str){
        int length = 0;
        for(char c : str.toCharArray()){
            length++;
        }
        return length;
    }
}
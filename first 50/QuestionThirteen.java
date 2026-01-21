// Reversing a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to reverse a given string.
import java.util.*;
public class QuestionThirteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //enter a sting 
        System.out.println("Enter a sting:");
        //asking from user to input a string
        String str = sc.nextLine();
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String is: "+rev);
        }
}
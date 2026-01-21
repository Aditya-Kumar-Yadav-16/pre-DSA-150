// Checking for an Anagram
// Difficulty: Easy
// Topics: String Manipulation
// Description: Write a program to check if two strings are anagrams.

import java.util.*;
public class QuestionThirtyFour {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String atr2 = sc.nextLine();
        if(areAnagrams(str1, atr2)){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1 ,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        else {
            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();
            Arrays.sort(strArr1);
            Arrays.sort(strArr2);
            return Arrays.equals(strArr1, strArr2);
            
        }
    }
}
// Identifying Palindromes
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to check if a string or number is a palindrome

import java.util.*;
public class QuestionSix{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String rev="";
        int len=str.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if (str.equals(rev)){
            System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
}
}

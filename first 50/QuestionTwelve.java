// .Counting Vowels and Consonants in a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to count vowels and consonants in a given string.

import java.util.*;
public class QuestionTwelve{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int vowels =0 ,consonants=0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Number of Vowels: "+vowels);
        System.out.println("Number of Consonants: "+consonants);
    }

}

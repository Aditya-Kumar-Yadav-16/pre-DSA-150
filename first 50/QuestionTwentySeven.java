// Generating a Pattern of Numbers
// Difficulty: Easy
// Topics: Basic Programming, Patterns
// Description: Write a program to generate number patterns

import java.util.*;
public class QuestionTwentySeven {
    public static void StarPattern(int n){
        int num=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n = sc.nextInt();
        StarPattern(n);
    }
}
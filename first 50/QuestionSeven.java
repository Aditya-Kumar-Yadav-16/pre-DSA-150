// Crafting Star Patterns
// Difficulty: Easy
// Topics: Basic Programming, Patterns
// Description: Write a program to create different star patterns (e.g., pyramid, diamond).

import java.util.*;
public class QuestionSeven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            //space
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
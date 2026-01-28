// Generating a Number Pyramid
// Difficulty: Medium
// Topics: Patterns, Basic Programming
// Description: Write a program to generate a pyramid of numbers (e.g., 1, 12, 123, etc.).
// Example:
// Input: rows = 4
// Output:
// 1
// 12
// 123
// 1234

// Explanation: A number pyramid with 4 rows is generated.

import java.util.*;
class QuestionFortySeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        //generateNumberPyramid(rows);
        // NumberPyrmaid(rows);
        Characterpyramid(rows);
    }
    public static void generateNumberPyramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

// Star Pyramid
    public static void NumberPyrmaid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Characterpyramid(int rows){
        char ch = 'A';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
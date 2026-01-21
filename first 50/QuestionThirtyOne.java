// Generating a Pascal’s Triangle
// Difficulty: Medium
// Topics: Arrays, Mathematical Computations
// Description: Write a program to generate Pascal's Triangle up to a given number of rows.

import java.util.*;
public class QuestionThirtyOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRow = sc.nextInt();
        for(int i = 0; i < numRow; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(PascalTriangle(i, j) + " ");
            }
            System.out.println();
        }
    }
    // Method 1: Using Recursion
    public static int PascalTriangle(int n, int r){
        if(r == 0 || r == n){
            return 1;
        }
        return PascalTriangle(n - 1, r - 1) + PascalTriangle(n - 1, r);
    }
}

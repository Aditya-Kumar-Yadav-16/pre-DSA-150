// Finding the N-th Triangular Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations

import java.util.*;
public class QuestionThirtySix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a N for finding N-th Triangular Number: ");
        int n =sc.nextInt();
        int TriangularNumber = n*(n+1)/2;
        System.out.println("the "+ n + "th Triangular Number is: " + TriangularNumber);
    }
}
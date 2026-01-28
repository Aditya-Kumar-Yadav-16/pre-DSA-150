// Generating a Fibonacci Sequence Using Recursion
// Difficulty: Medium
// Topics: Recursion, Sequences
// Description: Write a recursive program to generate the Fibonacci sequence up to a given number.
// Example:
// Input: number = 5
// Output: 0, 1, 1, 2, 3
// Explanation: The Fibonacci sequence up to 5 is generated.

import java.util.*;
class QuestionFourtyTwo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Fibonacci sequence up to " + number + ": ");
        for(int i = 0; i < number; i++){
            System.out.print(fibonacci(i) + (i < number - 1 ? ", " : ""));
        }  
    }
    public static int fibonacci(int n){
        if(n <= 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

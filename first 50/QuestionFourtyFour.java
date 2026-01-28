// Finding the Average of Numbers in an Array
// Difficulty: Easy
// Topics: Arrays, Mathematical Computations
// Description: Write a program to calculate the average of numbers in an array.
// Example:
// Input: array = [1, 2, 3, 4, 5]
// Output: 3
// Explanation: The average of the numbers is (1 + 2 + 3 + 4 + 5) / 5 = 3

import java.util.*;
class QuestionFourtyFour {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();   
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        double average = calculateAverage(array);
        System.out.println("The average of the numbers in the array is: " + average);
    }
    public static double calculateAverage(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
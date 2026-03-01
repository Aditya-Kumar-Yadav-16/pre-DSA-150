// Finding the Second Largest Number in an Array
// Difficulty: Medium
// Topics: Arrays, Sorting
// Description: Write a program to find the second largest number in an array.
// Example:
// Input: array = [10, 20, 4, 45, 99]
// Output: 45
// Explanation: The second largest number in the array is 45.

import java.util.*;
public class QuestionFourtyNine{
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        //to store the number in array
        for(int i=0;i<5;i++){
            arr[i] =sc.nextInt();

        }

        //to sort the array and the second last elemnt will be the Seconf highest number
        Arrays.sort(arr);
        System.out.println("The second largest number is: "+arr[arr.length-2]);
        
        //method 2
        int largest = Integer.MIN_VALUE;
        int SecLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SecLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>SecLargest && arr[i]!=largest){
                SecLargest = arr[i];
            }
        }
        System.out.println("The second largest number is: "+SecLargest);
    }
}
// Finding the Median of an Array
// Difficulty: Medium
// Topics: Arrays, Sorting
// Description: Write a program to find the median of an array of numbers.
// Example:
// Input: array = [3, 1, 2, 4, 5]
// Output: 3
// Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.


import java.util.*;
public class QuestionThirtyTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int median = n / 2;
        if(n % 2 == 0){
            System.out.println("The median is: " + (arr[median - 1] + arr[median]) / 2.0);
        } else {
            System.out.println("The median is: " + arr[median]);
    }
}
}

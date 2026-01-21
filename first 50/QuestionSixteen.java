// Finding the Sum of Elements in an Array
// Difficulty: Easy
// Topics: Basic Programming, Arrays
// Description: Write a program to find the sum of elements in an array.

import java.util.*;
public class QuestionSixteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];  // Declare the array size
        System.out.println("Entre the element in an array:");
        for (int i=0;i<n;i++){
            arr[i] =sc.nextInt(); //Input elements
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"  ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("the Sum of the aray element is:"+sum);
        

    }
}
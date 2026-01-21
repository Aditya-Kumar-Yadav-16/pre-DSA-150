// Finding the Largest and Smallest Numbers in an Array
// Difficulty: Easy
// Topics: Basic Programming, Arrays
// Description: Write a program to find the largest and smallest numbers in an array.

import java.util.*;
public class QuestionForteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        // Input the elements in the array
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //print the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        //largest ad the smallest numbers in the array
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest number in an array is:"+largest);
        System.out.println("Smallest number in an array is:"+smallest);
        

    }
}
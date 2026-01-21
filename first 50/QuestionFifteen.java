// Sorting an Array
// Difficulty: Easy
// Topics: Basic Programming, Sorting Algorithms
// Description: Write a program to sort an array of numbers in ascending order.

import java.util.*;
public class QuestionFifteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the size of the array:");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array:");
        //Input the elements of the array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //printing the original array
        System.out.println("Original array:");
        for( int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Sorting the array in ascending order
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //printing the sorted array
        System.out.println("Sorted array in ascending order:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
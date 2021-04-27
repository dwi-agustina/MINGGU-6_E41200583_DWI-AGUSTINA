/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortexample;

/**
 *
 * @author axioo
 */
public class BubbleSortExample {

    //BKPM
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {3,7,2,8,4};
        
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        bubbleSort(arr);    //sorting array elements using bubble sort
        
        //Sort Ascending
        System.out.println("Array After Bubble Sort (Ascending");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        
        //Sort Descending
        System.out.println("Array After Bubble Sort (Descending)");
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

    
    }
    
}

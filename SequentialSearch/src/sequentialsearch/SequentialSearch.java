/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

/**
 *
 * @author axioo
 */
public class SequentialSearch {

   
    public static void main(String[] args) {
        int[] exampleVariableOne = {2,9,6,7,4,5,3,0,1};
        int target = 7;
        
        System.out.println("Elements of array");
        for (int i = 0; i < exampleVariableOne.length; i++) {
            System.out.print(exampleVariableOne[i] + " ");
        }
        System.out.println();
        System.out.println("Find the element : " + target);
        
        SequentialSearch(exampleVariableOne, target);
    }

    public static void SequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        //searches each index of the array until it reaches the last index
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                //if the target is found, int index is set as the value of i and the for loop is terminated
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Your target integer does not exist in the array");
        } else {
            System.out.println("Your target integer is in index " + index + " of the array");
        }
    }
    
}

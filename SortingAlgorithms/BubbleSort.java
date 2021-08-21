/*****************************************************************************
 * Copyright @ Sadan K. sadan.cse@gmail.com
 * 
 * Instruction
 * * One can use these algorithms to sort the arrays of values.
 * * Here arrays of objects are concidered as the list or the naming convention.
 * 
 *****************Available Methods.*******************************************
 * bubbleSort(int[] n)
 *      Remarks:
 *          Bubble Sort is the simplest sorting algorithm that 
 *          works by repeatedly swapping the 
 *          adjacent elements if they are in wrong order.
 *      Based on: Comparision
 *      Time Complexity
 *          Best Case: O(n), Average Case: O(n2), Worst Case: O(n2) 
 *      Space Complexity
 *          O(1)
*******************************************************************************/
package SortingAlgorithms;

public class BubbleSort {
    public void bubbleSort(int[] arr, int order) {
        int n = arr.length;
        if(order != 0){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n - i -1; j++){
                    if(arr[j] < arr[j+1]){
                        //Swapping arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        } else {
            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    if(arr[j] > arr[j+1]) {
                        //Swapping arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    }
}

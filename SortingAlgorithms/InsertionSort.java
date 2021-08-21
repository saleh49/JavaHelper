/*****************************************************************************
 * Copyright @ Sadan K. sadan.cse@gmail.com
 * 
 * Instruction
 * * One can use these algorithms to sort the arrays of values.
 * * Here arrays of objects are concidered as the list or the naming convention.
 * 
 *****************Available Methods.*******************************************
 * insertionSort(int[] n)
 *      Remarks:
 *          The array is splitted into a sorted and an unsorted part.
 *          The values from the unsorted part are picked and 
 *          placed at the correct position in the sorted part. 
 *          More like Playing card.
 *      Based on: Comparision
 *      Time Complexity
 *          Best Case: O(n), Average Case: O(n2), Worst Case: O(n2) 
 *      Space Complexity
 *          O(1)
*******************************************************************************/
package SortingAlgorithms;
public class InsertionSort{
    public void insertionSort(int[] arr, int order){
        int n = arr.length;
        if(order != 0){
            for(int i = 1; i < n; ++i){
                int key = arr[i];
                int j = i - 1;

                while(j >= 0 && arr[j] < key){
                    arr[j+1] = arr[j];
                    j = j - 1;
                }
                arr[j+1] = key;
            }
        } else{
            for(int i = 1; i < n; ++i){
                int key = arr[i];
                int j = i - 1;

                while(j >= 0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j = j - 1;
                }
                arr[j+1] = key;
            }
        }
    }
}
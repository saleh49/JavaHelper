/*****************************************************************************
 * Copyright @ Sadan K. sadan.cse@gmail.com
 * 
 * Instruction
 * * One can use these algorithms to sort the arrays of values.
 * * Here arrays of objects are concidered as the list or the naming convention.
 * 
 *****************Available Methods.*******************************************
 * 1. bubbleSort(int[] n)
 *      Remarks:
 *          Bubble Sort is the simplest sorting algorithm that 
 *          works by repeatedly swapping the 
 *          adjacent elements if they are in wrong order.
 *      Based on: Comparision
 *      Time Complexity
 *          Best Case: O(n), Average Case: O(n2), Worst Case: O(n2) 
 *      Space Complexity
 *          O(1)
 * 2. insertionSort(int[] n)
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
 * 2. getIntList() and showIntList(int[] n)
 *      -> input - 34 54 223 34 output - 34 54 223 34
 * 3. getChar() and showChar(char c)
 * 4. getCharList and showCharList(char[] c)
 * 5. getItemsList() and showItemsList(String[] arr)
 * 6. nextLine()
 * 7. skipLines(int n)
 * 8. separatorLine(char sym, int n) 
 *      -> Used as sperator, sym = '-', '*', '#' etc. and n is number of dots.
*******************************************************************************/
public class SortingAlgorithms {
    //private int order = 0;
    public static void main(String[] args) {
        int[] x = {2, 4, 1, 9, 8, 7, 4};
        JavaReadWrite.printText("Before Sorting");
        JavaReadWrite.showIntList(x);
        insertionSort(x, 1);
        //JavaReadWrite ob = new JavaReadWrite();
        JavaReadWrite.skipLines(2);
        JavaReadWrite.printText("After Sorting.");
        JavaReadWrite.showIntList(x);
    }
    /* Bubble Sort */
    public static void bubbleSort(int[] arr, int order) {
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

    public static void insertionSort(int[] arr, int order){
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

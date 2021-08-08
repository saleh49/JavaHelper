/*****************************************************************************
 * Copyright @ Sadan K. sadan.cse@gmail.com
 * 
 * Instruction
 * * One can use this input read and write using java.
 * * Here arrays of objects are concidered as the list or the naming convention.
 * 
 *****************Available Methods.*******************************************
 1. getInt(void) and showInt(int n)
 2. getIntList() and showIntList(int[] n)
 3. getItemsList() and showItemsList(String[] arr)
*******************************************************************************/
import java.io.*;


class JavaReadWrite {
    public static void main(String[] args) throws IOException {
        /* Reading Input */
        int x1          = getInt();
        int[] x2        = getIntList();
        String[] x3     = getItemsList();

        
        /* Writing Output */
        showInt(x1);
        showIntList(x2);
        showItemsList(x3);
    }
    /* Read Integer */
    public static int getInt() {
        int n = 0; //Default
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(reader.readLine().trim());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Please provide provide some integer value.");
            //e.printStackTrace();
        } 
        return n;
    }
    public static void showInt(int n) {
        System.out.printf("%d", n);
    }

    /* It will read the integer array or list. The input - 1 2 3 4 5 */
    public static int[] getIntList() {
        int[] numbers = {0, 1, 2};//Default Value
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String rawArray = reader.readLine().trim();
            String[] splitStr = rawArray.split("\\s+");
            int n = splitStr.length;
            numbers = new int[n];
            for(int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(splitStr[i]);
            }  
        } catch (NumberFormatException | IOException e) {
            System.out.println("Please provide a number array like - 1 2 3 4 10.");
            e.printStackTrace();
        }
        return numbers;
    }

    public static void showIntList(int[] intArray) {
        int n = intArray.length;
        for(int i = 0; i < n; i++){
            System.out.print(intArray[i]);
            if(i >= 0 && i < n - 1){
                System.out.print(" ");
            }
        }
    }

    /* Read Array of strings aka list items */
    public static String[] getItemsList(){
        String[] strItems = {"Sahir", "Samar","Saleh"};

        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String rawArray = reader.readLine().trim();
            strItems = rawArray.split("\\s+");
             
        } catch (NumberFormatException | IOException e) {
            System.out.println("Please provide a number array like - 1 2 3 4 10.");
            e.printStackTrace();
        }
        return strItems;
    }

    /* Show String Array - aka itemsList */
    public static void showItemsList(String[] strArray) {
        int n = strArray.length;
        for(int i = 0; i < n; i++){
            System.out.print(strArray[i]);
            if(i >= 0 && i < n - 1){
                System.out.print(" ");
            }
        }
    }

}
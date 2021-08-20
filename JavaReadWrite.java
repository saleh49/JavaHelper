/*****************************************************************************
 * Copyright @ Sadan K. sadan.cse@gmail.com
 * 
 * Instruction
 * * One can use this input read and write using java.
 * * Here arrays of objects are concidered as the list or the naming convention.
 * 
 *****************Available Methods.*******************************************
 * 1. getInt(void) and showInt(int n)
 *      -> input - 3 etc. output - 3
 * 2. getIntList() and showIntList(int[] n)
 *      -> input - 34 54 223 34 output - 34 54 223 34
 * 3. getChar() and showChar(char c)
 * 4. getCharList and showCharList(char[] c)
 * 5. getItemsList() and showItemsList(String[] arr)
 * 6. nextLine()
 * 7. skipLines(int n)
 * 8. separatorLine(char sym, int n) 
 *      -> Used as sperator, sym = '-', '*', '#' etc. and n is number of dots.
 * 9. printText(String message);
*******************************************************************************/
import java.io.*;


class JavaReadWrite {
    public static void main(String[] args) throws IOException {
        /* Reading Input 
        int x1          = getInt();
        int[] x2        = getIntList();
        char c          = getChar();
        String[] x3     = getItemsList();*/
        
        /* Writing Output 
        showInt(x1);
        showChar(c);
        nextLine();
        showIntList(x2);
        nextLine();
        showItemsList(x3);
        skipLines(10);*/
        seprator('-', 15);
    }
    /* Print given message, usually for User Interaction */
    public static void printText(String message){
        System.out.println(message);
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

    /* Read Character */
    public static char getChar() {
        char c = 's'; //Default
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            c = (char)(reader.read());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Please provide provide some integer value.");
            //e.printStackTrace();
        } 
        return c;
    }
    public static void showChar(char c) {
        System.out.printf("%c", c);
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
    public static void nextLine() {
        System.out.printf("\n");
    }

    public static void skipLines(int n) {
        for(int i = 0; i < n; i++)
            System.out.printf("\n");
    }

    private static void seprator(char c, int n) {
        System.out.printf("\n");
        for(int i = 0; i < n; i++){
            System.out.printf("%c", c);
        }
        System.out.printf("\n");
    }

}
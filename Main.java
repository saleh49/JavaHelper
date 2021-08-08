import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        int[] intArray = readIntegerArray();
        showArray(intArray);
    }

    /* It will read the integer array. The input - 1 2 3 4 5 */
    public static int[] readIntegerArray() {
        int[] numbers = {0};//Default Value
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

    public static void showArray(int[] intArray) {
        int n = intArray.length;
        for(int i = 0; i < n; i++){
            System.out.print(intArray[i]);
            if(i >= 0 && i < n - 1){
                System.out.print(" ");
            }
        }
    }
}
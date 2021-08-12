public class BubbleSort {
    public static int[] swap(int a, int b) {  // a = 10    b = 3
        int[] output = new int[2];  
        int temp=0;                           //temp = 3
        temp = a;
        a=b;
        b=temp;
        output[0] = a;
        output[1] = b;
        return output;
    }
    public static void printArray(int[] a) {
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int[] input = {5, 4, 3, 2, 1};
        int n = input.length;
        int[] swappedArray = new int[2];
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(input[j] > input[j+1]) {
                    swappedArray = swap(input[j], input[j+1]);
                    input[j] = swappedArray[0];
                    input[j+1] = swappedArray[1];
                }
            }
        }
        printArray(input);
    }
}

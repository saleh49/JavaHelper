import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine().trim();
        String arr = in.nextLine().trim();
        /*Convert to integer*/
        int n = Integer.parseInt(x);
        /*Splitting the string by space and storing it as an array*/
        String[] splitStr = arr.split("\\s+");
        //System.out.println(splitStr);
        
        int[] numbers = new int[n+1];
        for(int i = 0; i < n; i++) {
            numbers[i+1] = Integer.parseInt(splitStr[i]);
        }
        int sum = 0;
        int mul = 1;

        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                sum += numbers[i];
            } else if(i%2 != 0){
                mul *= numbers[i];
            }
        }
        System.out.printf("%d %d",sum, mul);
        //System.out.println(Arrays.toString(numbers));
        

        
	}
}
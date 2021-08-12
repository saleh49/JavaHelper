import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
		try{
			String x = in.nextLine().trim();
        	String arr = in.nextLine().trim();
        	/*Convert to integer*/
        	int n = Integer.parseInt(x);
        	/*Splitting the string by space and storing it as an array*/
        	String[] splitStr = arr.split("\\s+");
        	//System.out.println(splitStr);
        
        	int[] numbers = new int[n+1];
        	for(int i = 0; i < n; i++) {
            	numbers[i] = Integer.parseInt(splitStr[i]);
        	}
        	for(int i = 0; i < n; i++){
				System.out.printf("%d ", numbers[i]);
			}

		} finally{
			in.close();
		}
	}
}
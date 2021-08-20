import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        /* Scanner in = new Scanner(System.in);
		try{
			String x = in.nextLine().trim();
        	String arr = in.nextLine().trim();
        	
        	int n = Integer.parseInt(x);
        	/*Splitting the string by space and storing it as an array
        	String[] splitStr = arr.split("\\s+");
        	//System.out.println(splitStr);
        
        	int[] numbers = new int[n+1];
        	for(int i = 0; i < n; i++) {
            	numbers[i] = Integer.parseInt(splitStr[i]);
        	}
        	for(int i = 0; i < n; i++){
				System.out.printf("%d ", numbers[i]);
			}

		}  */
		System.out.printf("%d", sumOfProductOfDigits(1, 1));
	}

	public static int sumOfProductOfDigits(int n1, int n2) {
		if(n1 > 0 && n2 > 0){
			int length1 = (int) (Math.log10(n1) + 1);
			int length2 = (int) (Math.log10(n2) + 1);
			int sum = 0;
			int[] numbers1 = numbers(n1);
			int[] numbers2 = numbers(n2);
			for(int i = Math.min(length1, length2) - 1; i >= 0 ; i--){
				//System.out.printf("%d \t %d", numbers1[length1 - 1], numbers2[length2 - 1]);
				sum += numbers1[length1 - 1] * numbers2[length2 - 1];
				length1--;
				length2--;
			}
			return sum;
		} else{
			return n1 * n2;
		}	
	}


	public static int[] numbers(int n){
		int[] numbers = {0, 1, 2};//Default Value
		String number = String.valueOf(n);

		String[] digits = number.split("(?<=.)");
		
		numbers = new int[digits.length];
		for(int i = 0; i < digits.length; i++) {
			numbers[i] = Integer.parseInt(digits[i]);
		}
		return numbers;  
	}
}
package MiniMaxSum;

import java.util.Scanner;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	
    	Long minimumValue = getMinimumValue(arr);
    	Long maximumValue = getMaximumValue(arr);
    	
    	System.out.println(minimumValue + " " + maximumValue);
    }

    private static Long getMaximumValue(int[] arr) {
    	
    	Integer smallerNumber = 0;;
    	Long result = 0L;
    	
    	for(int value : arr) {
    		
    		if(smallerNumber == 0 || smallerNumber > value) {
    			smallerNumber = value;
    		}
    		
    		result += value;
    	}
    	
    	result -= smallerNumber;
    	
		return result;
	}

	private static Long getMinimumValue(int[] arr) {
				
    	Integer biggerNumber = 0;;
    	Long result = 0L;
    	
    	for(int value : arr) {
    		
    		if(biggerNumber == 0 || biggerNumber < value) {
    			biggerNumber = value;
    		}
    		
    		result += value;
    	}
    	
    	result -= biggerNumber;
    	
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

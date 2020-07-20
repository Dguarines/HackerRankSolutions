package BirthdayCakeCandles;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    	
    	int tallestCandle = getTallestCandle(ar);
    	int counts = countHowManyCanBeBlowOut(ar, tallestCandle);
    	
    	return counts;
    }

	private static int getTallestCandle(int[] ar) {
		
		int tallestCandle = 0;
		
		for(int value : ar) {
			if(tallestCandle == 0 || (tallestCandle < value)) {
				tallestCandle = value;
			}
		}
		
		return tallestCandle;
	}
	
    private static int countHowManyCanBeBlowOut(int[] ar, int tallestCandle) {
		
    	int counts = 0;
    	
    	for(int value : ar) {
    		if(value == tallestCandle) {
    			counts++;
    		}
    	}
    	
    	return counts;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
 
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        
        System.out.println(result);

        scanner.close();
    }
}

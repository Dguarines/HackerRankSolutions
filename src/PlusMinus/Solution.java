package PlusMinus;

import java.util.Scanner;

public class Solution {
	
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	
		Double length = (double) arr.length;
		Double positives = countPositiveNumbers(arr);
		Double negatives = countNegativeNumbers(arr);
		Double zeros = countZerosNumbers(arr);
				
		System.out.println(String.format("%.6f", positives / length));
		System.out.println(String.format("%.6f", negatives / length));
		System.out.println(String.format("%.6f", zeros / length));
    }

	private static Double countZerosNumbers(int[] arr) {
		
		Double result = 0D;
		
		for(int number : arr) {
			if(number == 0) {
				result++;
			}
		}
		
		return result;
	}

	private static Double countNegativeNumbers(int[] arr) {
		
		Double result = 0D;
		
		for(int number : arr) {
			if(number < 0) {
				result++;
			}
		}
		
		return result;
	}

	private static Double countPositiveNumbers(int[] arr) {
		
		Double result = 0D;
		
		for(int number : arr) {
			if(number > 0) {
				result++;
			}
		}
		
		return result;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

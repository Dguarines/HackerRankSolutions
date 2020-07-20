package DiagonalDifference;

import static java.lang.Math.abs;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

    	Integer result = 0;
    	
    	if(isNotEmpty(arr)) {
    		
    		int leftToRightSum = calculateSumLeftToRightDiagonal(arr);
    		int rightToLeftSum = calculateSumRightToLeftDiagonal(arr);
    		
    		result = leftToRightSum - rightToLeftSum;
    	}
    	
    	return abs(result);
    }

	private static int calculateSumLeftToRightDiagonal(int[][] arr) {
		
		int length = arr.length;
		int result = 0;
		
		for(int i = 0; i <= length - 1 ; i++ ) {
			result += arr[i][i];
		}
		
		return result;
	}
	
	private static int calculateSumRightToLeftDiagonal(int[][] arr) {
		
		int length = arr.length;
		int result = 0;
		int j = 0;
		
		
		for(int i = length - 1; i >= 0 ; i-- ) {
			result += arr[j][i];
			j++;
		}
		
		return result;
	}

	private static boolean isNotEmpty(int[][] arr) {
		return arr.length != 0 || arr != null;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        System.out.println(result);
        
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

        scanner.close();
    }
}


package Staircase;

import java.util.Scanner;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
    	
    	String result = "";
    	
    	for(int i = 1; i < n + 1; i++) {
    		result = repeatString(i);
    		result = String.format("%" + (n) + "s", result);
    		System.out.println(result);
    	}
    }
    
    private static String repeatString(int n) {
		
    	String result = "";
    	
    	for(int i = 0; i < n; i++) {
    		result += "#";
    	}
    	
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

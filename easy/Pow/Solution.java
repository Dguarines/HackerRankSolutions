package Pow;

import java.util.Scanner;

public class Solution {
	
    // Complete the plusMinus function below.
    static void plusMinus(int n) {
    	
		Double valor = Double.valueOf(n);
		
		Double result = Math.pow(valor, 0.5);
				
		System.out.println(String.format("%.3f", result));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        plusMinus(n);

        scanner.close();
    }
}

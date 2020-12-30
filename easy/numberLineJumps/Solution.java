package numberLineJumps;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
		
    	Double x1d = Double.valueOf(x1);
    	Double v1d = Double.valueOf(v1);
    	Double x2d = Double.valueOf(x2);
    	Double v2d = Double.valueOf(v2);
    	
    	if(cannotBeZero(v1d, v2d)) {
    		return "NO";
    	}
    	
    	Double y = (x2d - x1d) / (v1d - v2d);
    	
    	if(isAPositiveAndIntegerNumber(y)) {
    		return "YES";
    	}
    	
    	return "NO";
    }

	private static boolean isAPositiveAndIntegerNumber(Double y) {
		return y > 0 && y == Math.floor(y);
	}

	private static boolean cannotBeZero(Double v1d, Double v2d) {
		return (v1d - v2d) == 0;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);
        
        System.out.println(result);

        scanner.close();
    }
}

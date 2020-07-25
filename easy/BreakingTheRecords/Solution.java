package BreakingTheRecords;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Solution {
	
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	
    	List<Integer> newScores  = Arrays.stream(scores).boxed().collect(Collectors.toList());
    	
    	int bestRecords = countBestRecords(newScores);
    	int worstRecords = countWorstRecords(newScores);
    	
    	return new int[]{bestRecords, worstRecords};
    }
    
	private static int countWorstRecords(List<Integer> scores) {
		
		Integer lastValor = null;
		Integer counter = 0;
						
		for(Integer actualValor: scores) {
			
			if(lastValor == null) {
				lastValor = actualValor;
				
			}else if(lastValor > actualValor) {
				lastValor = actualValor;
				counter++;
			}
		}
		
		return counter;
	}

	private static int countBestRecords(List<Integer> scores) {
		
		Integer lastValor = null;
		Integer counter = 0;
		
		for(Integer actualValor: scores) {
			
			if(lastValor == null) {
				lastValor = actualValor;
				
			}else if(lastValor < actualValor) {
				lastValor = actualValor;
				counter++;
			}
		}
		
		return counter;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        
        System.out.println(result[0] + " " + result[1]);
        
        /*
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
        */

        scanner.close();
    }
}

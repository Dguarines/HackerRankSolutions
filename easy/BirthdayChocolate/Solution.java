package BirthdayChocolate;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
	
	
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	
    	
    	
    	for(int i = 0; i < s.size() - 1; i++) {
    		
    		int actualValor = s.get(i);
    		int nextValor = s.get(i + 1) != null ? s.get(i + 1) : 0;
    	}
    	
    	return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);
        
        System.out.println(result);
        
        bufferedReader.close();
    }
}

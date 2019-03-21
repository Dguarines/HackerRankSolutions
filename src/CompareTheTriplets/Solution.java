package CompareTheTriplets;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
    	List<Integer> results = new ArrayList<>();
    	
    	if(hasSameSize(a, b)) {
    		
    		int alicePoints = 0;
    		int bobPoints = 0;
    		
    		for(int i = 0; i < a.size() ; i++) {
        		if(a.get(i) > b.get(i)) {
        			alicePoints++;
        		}
        		if(a.get(i) < b.get(i)) {
        			bobPoints++;
        		}
        	}
    		
    		results.add(alicePoints);
    		results.add(bobPoints);
    	}
    	
    	return results;
    }

	private static boolean hasSameSize(List<Integer> a, List<Integer> b) {
		return a.size() == b.size();
	}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.stream().map(Object::toString).collect(joining(" ")));
        
        bufferedReader.close();
        //bufferedWriter.close();
    }
}
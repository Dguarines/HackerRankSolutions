package GradingStudents;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    	
    	List<Integer> newGrades = new ArrayList<>();
    	
    	for(Integer grade: grades) {
    		
    		if(grade > 35) {
    			
    			if(isMultipleOf5(grade)) {
    				newGrades.add(grade);
    			}else {
    				Integer finalGrade = findNextMultipleOf5(grade);
    				
    				if(finalGrade - grade > 2) {
    					newGrades.add(grade);
    				}else {
    					newGrades.add(finalGrade);
    				}
    			}
    		}else {
    			newGrades.add(grade);
    		}
    	}
    	
    	return newGrades;
    }
    
    public static boolean isMultipleOf5(Integer grade) {
    	return grade % 5 == 0;
    }
    
    public static Integer findNextMultipleOf5(Integer grade) {
    	
    	Integer newGrade = grade;
    	
    	while(!isMultipleOf5(newGrade)) {
    		newGrade++;
    	}
    	
    	return newGrade;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        
        System.out.println(result);

		/*
		 * bufferedWriter.write( result.stream() .map(Object::toString)
		 * .collect(joining("\n")) + "\n" );
		 */

        bufferedReader.close();
        //bufferedWriter.close();
    }
}


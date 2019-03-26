package TimeConversion;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
    	String amPm = s.substring(s.length() - 2);
    	String time = s.replace(amPm, "");
    	String convertedTime = "";
    	
    	if(amPm.equals("PM")) {
    		
    		String hour = s.substring(0, 2);
    		
    		String convertedHour = convertHour(hour);
    		
    		String timewithoutHour = time.substring(2);
    		
    		convertedTime = convertedHour + timewithoutHour;
    	}else {
    		
    		String hour = s.substring(0, 2);
    		
    		if(hour.equals("12")) {
    			
    			String timewithoutHour = time.substring(2);
    			convertedTime = "00" + timewithoutHour;
    		}else {
    			
    			convertedTime = time;
    		}
    	}
    	
    	return convertedTime;
    }

	private static String convertHour(String hour) {
		String convertedHour = null;
		switch (hour) {
		case "00":
			convertedHour = "12";
			break;
		case "01":
			convertedHour = "13";
			break;
		case "02":
			convertedHour = "14";
			break;
		case "03":
			convertedHour = "15";
			break;
		case "04":
			convertedHour = "16";
			break;
		case "05":
			convertedHour = "17";
			break;
		case "06":
			convertedHour = "18";
			break;
		case "07":
			convertedHour = "19";
			break;
		case "08":
			convertedHour = "20";
			break;
		case "09":
			convertedHour = "21";
			break;
		case "10":
			convertedHour = "22";
			break;
		case "11":
			convertedHour = "23";
			break;
		case "12":
			convertedHour = "12";
			break;
		}
		return convertedHour;
	}

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        
        System.out.println(result);

		/*
		 * bw.write(result); bw.newLine();
		 * 
		 * bw.close();
		 */
    }
}


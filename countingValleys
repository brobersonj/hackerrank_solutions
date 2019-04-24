import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int numberOfValleys = 0;
        char[] steps = s.toCharArray();

        int seaLevel = 0;
        boolean countValley = true;
        for(int i = 0; i < steps.length; i++) {
            if(seaLevel == 0) {
                countValley = true;
            
            } 

            if(steps[i] == 'U') {
                seaLevel = seaLevel + 1;

            } else {
                seaLevel = seaLevel - 1;

            }

            if (seaLevel <= -1 && countValley) {
                numberOfValleys++;
                countValley = false;
            }

        }
        
        return numberOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

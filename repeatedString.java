import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numberOfLetters = 0;
        int strLength = s.length();
        long factor = n / strLength;
        long remainder = n % strLength;


        for (int i=0; i < strLength; i++) {
            if (s.charAt(i) == 'a') {
                if (i < remainder) {
                    numberOfLetters += factor + 1;

                } else {
                    numberOfLetters += factor;
                    
                }
                
            }
        }

        return numberOfLetters;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

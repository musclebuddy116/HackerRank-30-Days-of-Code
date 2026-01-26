import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        int remainder = 0;
        int consecOnes = 0;
        int maxConsecOnes = 0;
        while (n > 0) {
            // System.out.println("n: " + n);
            remainder = n % 2;
            n = n / 2;
            // System.out.println("Remainder: " + remainder);
            if (remainder == 1) {
                consecOnes++;
            } else {
                if (consecOnes > maxConsecOnes) {
                    maxConsecOnes = consecOnes;
                }
                consecOnes = 0;
            }
        }
        if (consecOnes > maxConsecOnes) {
            maxConsecOnes = consecOnes;
        }
        
        System.out.println(maxConsecOnes);

        bufferedReader.close();
    }
}

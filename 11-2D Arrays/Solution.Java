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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maxSum = 
            arr.get(0).get(0) +
            arr.get(0).get(1) +
            arr.get(0).get(2) +
            arr.get(1).get(1) +
            arr.get(2).get(0) +
            arr.get(2).get(1) +
            arr.get(2).get(2);
        
        for (int i = 0; i < 4; i++) { //Top of hourglass
            for (int j = 0; j < 4; j++) { //Left of hourglass
                // System.out.println("Testing hourglass " + i + "," + j);
                int sum =
                    arr.get(i).get(j) +     //Top left
                    arr.get(i).get(j+1) +   //Top middle
                    arr.get(i).get(j+2) +   //Top right
                    arr.get(i+1).get(j+1) + //Middle middle
                    arr.get(i+2).get(j) +   //Bottom left
                    arr.get(i+2).get(j+1) + //Bottom middle
                    arr.get(i+2).get(j+2);  //Bottom right
                    
                // System.out.println("maxSum: " + maxSum);
                // System.out.println("sum:    " + sum);
                
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        
        System.out.println(maxSum);

        bufferedReader.close();
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Read input: number of items, then items into array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        //Check each item in array
        for(int x : arr) {
            boolean prime = true;
            if(x == 1) {
                prime = false;
            }
            // System.out.println("Checking " + x);
            for(int y = 2; y <= Math.sqrt(x); y++) {
                // System.out.println(x + " % " + y + " = " + x%y);
                if(x % y == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.println(prime ? "Prime" : "Not prime");
        }
    }
}
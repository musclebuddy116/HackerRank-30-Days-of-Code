import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            String even = "";
            String odd = "";
            for (int j = 0; j < chars.length; j++) {
                if (j % 2 == 0) {
                    even = even + chars[j];
                } else {
                    odd = odd + chars[j];
                }
            }
            System.out.println(even + " " + odd);
        }
        
        scanner.close();
        
        
    }
}

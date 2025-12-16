import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        Scanner scanner = new Scanner(System.in);
        int inputI;
        double inputD;
        String inputS;
        inputI = scanner.nextInt();
        scanner.nextLine();
        inputD = scanner.nextDouble();
        scanner.nextLine();
        inputS = scanner.nextLine();
        
        System.out.println(i + inputI);
        System.out.println(d + inputD);
        System.out.println(s + " " + inputS);
        
        scanner.close();
    }
}
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int retDay, retMonth, retYear;
        int dueDay, dueMonth, dueYear;
        Scanner sc = new Scanner(System.in);
        retDay = sc.nextInt();
        retMonth = sc.nextInt();
        retYear = sc.nextInt();
        dueDay = sc.nextInt();
        dueMonth = sc.nextInt();
        dueYear = sc.nextInt();
        
        sc.close();
        
        int fine;
        
        if (retYear < dueYear) { // If year is before, it's always early: no fine
            fine = 0;
        } else if (retYear == dueYear) { // Same year, could be early or late
            if (retMonth < dueMonth) { // If month is before in same year, it's always early: no fine
                fine = 0;
            } else if (retMonth == dueMonth) { // Same month in same year, could be early or late
                if (retDay <= dueDay) { // If day is before in same month in same year or day is due day: no fine
                    fine = 0;
                } else { // Day is after in same month in same year: 15 * days late
                    fine = 15 * (retDay - dueDay);
                }
            } else { // Month is after in same year: 500 * months late
                fine = 500 * (retMonth - dueMonth);
            }
        } else { // Year is after: 10000
            fine = 10000;
        }
        
        System.out.println(fine);
    }
}

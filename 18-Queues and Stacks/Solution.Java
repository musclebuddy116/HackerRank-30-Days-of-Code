import java.io.*;
import java.util.*;
public class Solution {
    char[] stack;
    char[] queue;
    
    void pushCharacter(char ch) {
        // System.out.println("Pushing " + ch + " onto stack");
        if (stack == null) {
            // System.out.println("No stack, creating stack");
            stack = new char[0];
        }
        
        char[] newStack = new char[stack.length+1];
        // System.out.println("stack had length " + stack.length + ", newStack has length " + newStack.length);
        for (int i = 0; i < stack.length; i++) {
            newStack[i+1] = stack[i];
        }
        
        newStack[0] = ch;
        stack = newStack;
        // for (int i = 0; i < stack.length; i++) {
        //     System.out.println("stack[" + i + "] is " + stack[i]);
        // }
        // System.out.println("---Function Complete.---");
    }
    
    void enqueueCharacter(char ch) {
        // System.out.println("Enqueueing " + ch + " onto queue");
        if (queue == null) {
            // System.out.println("No queue, creating queue");
            queue = new char[0];
        }
        
        char[] newQueue = new char[queue.length+1];
        // System.out.println("queue had length " + queue.length + ", newQueue has length " + newQueue.length);
        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[i];
        }
        
        newQueue[newQueue.length-1] = ch;
        queue = newQueue;
        // for (int i = 0; i < queue.length; i++) {
        //     System.out.println("queue[" + i + "] is " + queue[i]);
        // }
        // System.out.println("---Function Complete---");
    }
    
    char popCharacter() {
        char retChar = stack[0];
        // System.out.println("Popping " + retChar + " from stack");
        char[] newStack = new char[stack.length-1];
        // System.out.println("stack had length " + stack.length + ", newStack has length " + newStack.length);
        
        
        for(int i = 1; i < stack.length; i++) {
            newStack[i-1] = stack[i];
        }
        stack = newStack;
        
        // for (int i = 0; i < stack.length; i++) {
        //     System.out.println("stack[" + i + "] is " + stack[i]);
        // }
        // System.out.println("---Function Complete.---");
        return retChar;
    }
    
    char dequeueCharacter() {
        char retChar = queue[0];
        // System.out.println("Dequeueing " + retChar + " from queue");
        char[] newQueue = new char[queue.length-1];
        // System.out.println("queue had length " + queue.length + ", newQueue has length " + newQueue.length);
        
        for(int i = 1; i < queue.length; i++) {
            newQueue[i-1] = queue[i];
        }
        queue = newQueue;
        
        // for (int i = 0; i < queue.length; i++) {
        //     System.out.println("queue[" + i + "] is " + queue[i]);
        // }
        // System.out.println("---Function Complete---");
        return retChar;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
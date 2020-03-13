package com.drr;

import java.util.*;

public class Day18 {
    // Write your code here.

    Stack<Character> mystack = new  Stack<Character>();

    Queue<Character> myQueue = new LinkedList<Character>();
    public void pushCharacter(char c){
        mystack.push(c);
    }

    public void enqueueCharacter(char c){
        myQueue.add(c);
    }

    public char popCharacter(){
        char c1 = (char) mystack.pop();
        return(c1);
    }

    public char dequeueCharacter(){
        char c2 = (char) myQueue.poll();
        return c2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();




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
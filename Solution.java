import java.util.Scanner;
import java.util.Stack;

/**
 * 151. Reverse Words in a String
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */

 public class Solution {


    /**
     * Given an input string, reverse the string word by word.
     */
    static String reverseWords(String s) {

        // **** split string ****
        String[] words = s.split(" ");

        Stack<String> stack = new Stack<String>();

        // **** push words into stack ****
        for (String word : words) {

            // ???? ????
            // System.out.println("reverseWords <<< word ==>" + word + "<==");

            // **** save word (if needed) ****
            if (!word.equals(""))
                stack.push(word);
        }

        // ???? ????
        // System.out.println("reverseWords <<< stack: " + stack.toString());

        // **** reverse the string ****
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {

            // **** append the next word ****
            sb.append(stack.pop());

            // **** append a ' ' (if needed) ****
            if (!stack.empty())
                sb.append(" ");
        }

        // **** return the reversed string ****
        return sb.toString();
    }


    /**
     * Test scaffolding.
     */
    public static void main(String[] args) {
        
        // **** open scanner ****
        Scanner sc = new Scanner(System.in);

        // **** read string ****
        String s = sc.nextLine();

        // **** close scanner ****
        sc.close();

        // **** display input string ****
        System.out.println("main <<< s ==>" + s + "<==");

        // **** reverse words in the string ****
        System.out.println("main <<< reverseWords ==>" + reverseWords(s) + "<==");
    }

 }
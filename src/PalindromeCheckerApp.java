import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c); // enqueue
            stack.push(c); // push
        }

// Flag to track palindrome status
        boolean isPalindrome = true;

// Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop(); // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}









public class RecursivePalindrome {

    // Helper variable to track left side
    static int left = 0;

    public static boolean isPalindrome(String str, int right) {

        // Base Condition
        if (right <= left) {
            return true;
        }

        // Recursive Call
        boolean isPal = isPalindrome(str, right - 1);

        // Compare characters after recursion unfolds
        if (!isPal) {
            return false;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Move left pointer forward
        left++;

        return true;
    }

    public static void main(String[] args) {
        String input = "madam"; // try "hello"

        boolean result = isPalindrome(input, input.length() - 1);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
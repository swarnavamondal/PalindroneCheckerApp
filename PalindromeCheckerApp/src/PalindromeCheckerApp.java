public class NormalizedPalindrome {

    // Function to check palindrome
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "") // remove spaces & special chars
                .toLowerCase(); // convert to lowercase

        // Step 2: Check palindrome using two-pointer
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
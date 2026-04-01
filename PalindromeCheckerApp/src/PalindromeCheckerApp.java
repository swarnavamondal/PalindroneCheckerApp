import java.util.Scanner;

/**
 * ======================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 3: Palindrome Validation by Reversing String
 *
 * Description:
 * This program checks whether a given string is a palindrome
 * by reversing the string using a loop and comparing it with
 * the original string.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Reverse the string using a loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindrome;

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        // Display result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
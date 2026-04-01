import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method 1: Basic palindrome check
    public static boolean isPalindromeBasic(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Ignore case
    public static boolean isPalindromeIgnoreCase(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Method 3: Ignore spaces and punctuation
    public static boolean isPalindromeIgnoreSpecial(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nResults:");

        if (isPalindromeBasic(input)) {
            System.out.println("Basic Check: The string IS a palindrome.");
        } else {
            System.out.println("Basic Check: The string is NOT a palindrome.");
        }

        if (isPalindromeIgnoreCase(input)) {
            System.out.println("Ignore Case Check: The string IS a palindrome.");
        } else {
            System.out.println("Ignore Case Check: The string is NOT a palindrome.");
        }

        if (isPalindromeIgnoreSpecial(input)) {
            System.out.println("Ignore Special Characters Check: The string IS a palindrome.");
        } else {
            System.out.println("Ignore Special Characters Check: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
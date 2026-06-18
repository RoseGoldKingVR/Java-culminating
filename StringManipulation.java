public class StringManipulation {
    public static void main(String[] args) {
 
        // ── a. Slicing ──────────────────────────────────────────────
        System.out.println("===== a. Slicing =====");
        String sentence = "Hello, World!";
 
        // substring(startIndex)           → from index to end
        // substring(startIndex, endIndex) → from start up to (not including) end
        String firstWord = sentence.substring(0, 5);   // "Hello"
        String lastWord  = sentence.substring(7, 12);  // "World"
        String fromIndex = sentence.substring(7);      // "World!"
 
        System.out.println("Original  : " + sentence);
        System.out.println("First word: " + firstWord);
        System.out.println("Last word : " + lastWord);
        System.out.println("From idx 7: " + fromIndex);
 
        // ── b. Concatenation ─────────────────────────────────────────
        System.out.println("\n===== b. Concatenation =====");
        String firstName = "John";
        String lastName  = "Doe";
 
        // Method 1: + operator
        String fullName1 = firstName + " " + lastName;
        System.out.println("Using +       : " + fullName1);
 
        // Method 2: String.concat()
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat(): " + fullName2);
 
        // Method 3: StringBuilder (best for many concatenations)
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(lastName);
        System.out.println("Using Builder : " + sb.toString());
 
        // ── c. Palindrome Check ───────────────────────────────────────
        System.out.println("\n===== c. Palindrome Check =====");
        checkPalindrome("racecar");
        checkPalindrome("hello");
        checkPalindrome("madam");
        checkPalindrome("Java");
        checkPalindrome("amanaplanacanalpanama");
    }
 
    // Reverse the string and compare it to the original (case-insensitive)
    public static void checkPalindrome(String word) {
        String lower    = word.toLowerCase();
        String reversed = new StringBuilder(lower).reverse().toString();
        boolean isPalin = lower.equals(reversed);
        System.out.printf("%-10s → %s%n", word, isPalin ? "Palindrome ✓" : "Not a palindrome ✗");
    }
}

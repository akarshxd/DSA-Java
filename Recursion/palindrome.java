/*public class palindrome {
    
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters matched
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Mismatch found
        }
        return isPalindrome(str, start + 1, end - 1); // Recursive check
    }

    public static void main(String[] args) {
        String s = "madam";

        if (isPalindrome(s, 0, s.length() - 1)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}

*/

//Better approach

public class palindrome {

    public static boolean isPalindrome(String str, int i) {
        int n = str.length();
        if (i >= n / 2) {
            return true; // Base case: checked all matching pairs
        }
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false; // Mismatch found
        }
        return isPalindrome(str, i + 1); // Move inward
    }

    public static void main(String[] args) {
        String s = "racecar";

        if (isPalindrome(s, 0)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}

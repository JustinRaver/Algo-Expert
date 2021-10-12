package Easy.PalindromeCheck;

public class Solution {
    /*
     * Write a function that takes in a non-empty string and that returns a boolean representing whether the string
     * is a palindrome.
     *
     * A palindrome is defined as a string that's written the same forward as backward. Note single characters are
     * palindromes
     */
    public static boolean isPalindrome(String str) {
        char[] c = str.toCharArray();

        for (int i = 0, j = c.length - 1; i <= j; i++, j--) {
            if (c[i] != c[j]) {
                return false;
            }
        }
        return true;
    }
}

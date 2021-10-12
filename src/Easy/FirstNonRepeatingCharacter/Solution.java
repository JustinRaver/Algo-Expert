package Easy.FirstNonRepeatingCharacter;

public class Solution {
    /*
     * Write a function that takes in a string of lowercase English-alphabet letters and returns the index of strings
     *  first non-repeating character.
     *
     * The first non-repeating character is the first character in a string that occurs only once.
     *
     * If the input string doesn't have any non repeating characters, your function should return -1
     */
    public int firstNonRepeatingCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(string.charAt(i)) == i && string.indexOf(string.charAt(i), i + 1) <= -1) {
                return i;
            }
        }
        return -1;
    }
}

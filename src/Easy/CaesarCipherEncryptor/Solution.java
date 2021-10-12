package Easy.CaesarCipherEncryptor;

public class Solution {
    /*
     * Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function
     * that returns a new string obtained by shifting every letter in the input string by k positions in the
     * alphabet, where k is the key
     *
     * Note that letter should "wrap" around the alphabet; in other words, the letter z shifted by one returns the
     * letter a
     */
    public static String caesarCypherEncryptor(String str, int key) {
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            int newChar = a[i] + key;

            if (newChar <= 'z') {
                a[i] = (char) newChar;
            } else {

                newChar -= 'a';
                newChar %= 26;
                a[i] = (char) (newChar + 'a');
            }
        }
        return String.valueOf(a);
    }
}

package Easy.GenerateDocument;

import java.util.HashMap;

public class Solution {
    /*
     * You're given a string of available characters and a string representing a document that you need to generate.
     * Write a function that determines if you can generate the document using the available characters. If you can
     * generate the document, your function should return true; otherwise, it should return false;
     *
     * Youre only able to generate the document i the frequency of unique characters in the characters string is
     * greater than or equal to the frequency of unique characters in the document string. For example ,if youre
     * given characters = "abcabc and document = "aabbccc" you cannot generate the document because youre missing one c
     *
     * The document you need to create may contain any characters, including special characters, capital letters,
     * numbers, and spaces
     */

    public boolean generateDocument(String characters, String document) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : characters.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : document.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

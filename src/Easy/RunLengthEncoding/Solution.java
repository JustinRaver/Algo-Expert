package Easy.RunLengthEncoding;

public class Solution {
    /*
     * Write a function that takes ina non-empty string and returns its run-length encoding.
     *
     * From wikipedia, run-length encoding is a form of lossless data compression in which runs of data are stored as
     *  a single data value and count, rather than as the original run. For example, the run "AAAAAAAAAA" can't
     * naively be encoded as 12A, since the string can be decoded as either AAAAAAAA or 1AA. Thus, long runs (runs of
     *  10 or more characters) should be encoded in a split fashion; the aforementioned run should be encoded as "9A3A".
     */

    public String runLengthEncoding(String string) {
        // AAAAAAABBCCCCDD

        StringBuilder stringBuilder = new StringBuilder();

        char[] array = string.toCharArray();

        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1] || count == 9) {
                stringBuilder.append(count).append(array[i]);
                count = 0;
            }
            count++;
        }
        stringBuilder.append(count).append(array[array.length - 1]);
        return stringBuilder.toString();
    }
}

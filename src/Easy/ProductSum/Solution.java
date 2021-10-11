package Easy.ProductSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
     * Write a function that takes in a "Special" array and returns its product sum.
     *
     * A "Special" array is a non-empty array that contains either integers of other "special" arrays inside it are
     * product sum of a  "Special" array is the sum of its elements, where "Special" arrays inside it are summed
     * themselves and then multiplied bt their level of depth.
     *
     * The depth of a "Special" array is how far nested it is. For instance, the depth of [] is 1; the depth of the
     * inner array in [[]] is 2; the depth of the innermost array in [[[[]]] is 3.
     *
     * Therefore, the product sum of [x,y] is x+y; the product sum of [x,[y,z]] is x+2*(y+z); the product sum of [x,
     * [y, [z]] is x+2*(y+3z).
     */
    public static int productSum(List<Object> array) {
        return productSumDepth(array, 1);
    }

    public static int productSumDepth(List<Object> array, int depth) {
        int sum = 0;
        for (Object o : array) {
            if (o instanceof ArrayList) {
                sum += productSumDepth((ArrayList<Object>) o, depth + 1);
                continue;
            }
            sum += (Integer) o;
        }
        return depth * sum;
    }
}

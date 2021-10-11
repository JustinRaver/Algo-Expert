package Easy.TandemBicycle;

import java.util.Arrays;

public class Solution {
    /*
     * A tandem bicycle is a bicycle that's operated by two people: a person A and a person B. Both people pedal the
     * bicycle, but the person that pedals faster dictates the speed of the bicycle. So if person a pedals at a speed
     *  of 5, and person B pedals at a speed of 4, the tandem bicycle moves at a speed of 5 (i.e tandemSpeed = max
     * (speedA, speedB) )
     *
     * You're given two lists of positive integer: one that contains the speeds of riders wearing red shirts and one
     * that contains teh speeds of riders wearing blue shirts. Each rider is represented by a single positive
     * integer, which is the speed that they pedal the tandem bicycle. Both lists have the same length, meaning that
     * there are as many red-shirts as blue shirts. Your goal is to pair every rider wearing a red shirt with a rider
     *  wearing a blue shirt to operate a tandem bicycle.
     *
     * Write a function that returns the maximum possible total speed of the minimum possible total speed of all of
     * teh tandem bicycles being ridden based on an input parameter, fastest. If fastest = true, your function should
     * return the maximum possible total speed: otherwise it should return the minimum total speed.
     *
     * Total speed is defined as the sum of all the speeds of the tandem bicycles being ridden. For example, if
     * there are 4 riders (2 red shirt riders and 2 blue shirt riders) who have speeds 1, 3, 4, 5, and if they're paired
     *  on tandem bicycles as follows [1, 4], [5, 3], then the total speed of these tandem bicycles is 4+5 = 9.
     */
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int speedSum = 0;
        for (int i = 0, j = fastest ? redShirtSpeeds.length - 1 : 0; i < redShirtSpeeds.length; i++, j = fastest ? j - 1 : j + 1) {
            speedSum += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }
        return speedSum;
    }
}

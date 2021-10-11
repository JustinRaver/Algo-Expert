package Easy.ClassPhotos;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    /*
     * It's photo day at the local school, and you're the photographer assigned to take class photos. The class that
     * you'll be photographing has an even number of students, and all these students are wearing red or blue shirts.
     * In fact, exactly half of the class is wearing red shirts, and the other half is wearing blue shirts. You're
     * responsible for arranging the students in two rows before taking the photo. Each row should contain the same
     * number of students and should adhere to the following guidelines:
     *
     * All students wearing red shirts must be in the same row
     * All students wearing blue shirts must be in the same row
     * Each student in the back row must be strictly taller than teh student directly in front of them in the front row
     */
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        ArrayList<Integer> frontRow = null;
        ArrayList<Integer> backRow = null;

        if (redShirtHeights.get(0) == blueShirtHeights.get(0)) {
            return false;
        } else if (redShirtHeights.get(0) > blueShirtHeights.get(0)) {
            backRow = redShirtHeights;
            frontRow = blueShirtHeights;
        } else {
            backRow = blueShirtHeights;
            frontRow = redShirtHeights;
        }

        for (int i = 1; i < redShirtHeights.size(); i++) {
            if (backRow.get(i) < frontRow.get(i)) {
                return false;
            }
        }

        return true;
    }
}

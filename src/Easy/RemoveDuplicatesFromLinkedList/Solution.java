package Easy.RemoveDuplicatesFromLinkedList;

public class Solution {
    /*
     * You're given the head of a singly linked list whose nodes are in sorted order with respect to their values.
     * Write a function that returns a modified version of the Linked List that doesnt contain any nodes with
     * duplicate values. The Linked List should be modified in place and the modified Linked List should sitll have
     * its nodes sorted with respect to their values.
     *
     * Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to
     * None/null if its the tail of the list
     */
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList previous = linkedList;
        LinkedList current = linkedList.next;

        while(current != null){
            if(current.value == previous.value){
                previous.next = current.next;

                current = previous.next;
                continue;
            }
            previous = current;
            current = current.next;
        }
        return linkedList;
    }
}

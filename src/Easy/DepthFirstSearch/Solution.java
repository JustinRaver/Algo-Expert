package Easy.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    /*
     * You're given a node class that has a name and an array of optional children nodes. When put together, nodes
     * form an acyclic tree-like structure.
     *
     * Implement the depthFirstSear method on the node class, which takes in an empty array, traverses the tree using
     * the Depth-first search approach (specifically navigating the tree from the left to right, stores all the
     * nodes' name in the input array and returns it.
     *
     * If you're unfamiliar with Depth-first-search, we recommend watching the Conceptual overview section of this
     * question's video explanation before starting coding
     */
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            Stack<Node> stack = new Stack<>();

            stack.add(this);

            while (!stack.isEmpty()) {
                Node node = stack.pop();

                array.add(node.name);

                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.push(node.children.get(i));
                }
            }

            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}

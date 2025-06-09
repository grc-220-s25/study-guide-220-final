import java.util.HashMap;
import java.util.Map;

public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT
        if (head == null) return 0;

        int idx = 0;
        int sum = 0;
        ListNode current = head;
        while (current != null) {
            if (idx % 2 != 0) sum += current.data;
            idx++;
            current = current.next;
        }
        return sum;
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
    /**
     * return the largest of only the last 3 values of the list.
     * 
     * If passed a null head, returns 0.
     * 
     * Example:
     * 7 -> 3 -> 19 -> 21 -> 14 -> 33 -> 8 -> 26 -> 11 -> 5
     * Expected Answer: 26
     * Last 3 values are: 26  11  5, the largest of which is 26
     * 
     * @param head the head of the linked list
     * @return the largest of only the last 3 values of the list.
     */
    public static int highestOfLastThree(ListNode head) {
        if (head == null) return 0;

        ListNode current = head;
        int highest = current.data;
        while (current != null) {
            if (current.next != null && current.next.next != null && current.next.next.next == null) {
                return Math.max(current.data, Math.max(current.next.data, current.next.next.data));
            } else if (current.next != null && current.next.next == null) {
                return Math.max(current.data, current.next.data);
            }
            current = current.next;
        }
        return highest;
    }

    /**
     * Given a reference to the root of a tree,  
     * return the sum of the leaf nodes with even values in the tree.
     * Do not include any odd or branch nodes. 
     *
     * If passed a null root, returns 0.
     * 
     * Example:
     * Tree:
     *        12
     *      /    \
     *     6      18
     *    / \    /  \
     *   4   8  16   20
     *  /               \
     * 3                22
     * 
     * Expected Answer: 46
     * The leaf nodes are 3   8   16   22, and the even ones are 8   16   22.
     * The sum of the even leaf nodes is 8+16+22 = 46
     * 
     * @param node the root of the tree
     * @return the return the sum of the leaf nodes with even values in the tree.
     */
    public static int evenSumLeaf(TreeNode node) {
        // check if the tree is leaf, no left or right child
        // check if node is even
        // add to sum
        if (node == null) return 0;
        
        int sum = 0;
        if (node.left == null && node.right == null) {
            if (node.data % 2 == 0) sum += node.data;
        }
        sum += evenSumLeaf(node.left);
        sum += evenSumLeaf(node.right);
        
        return sum;
    }

    /**
     * Given a reference to the root of a tree,
     * return the sum of the branch nodes with odd values in the tree.
     * Do not include any even or leaf nodes.
     *
     * If passed a null root, returns 0.
     * 
     * Example:
     * Tree:
     *         15
     *       /    \
     *      9      4
     *     / \    /  \
     *    8   11 21   30
     *   / \        \
     *  2   6        23
     * 
     * Expected Answer: 45
     * The branch nodes are 15  9  4  8  21, and the odd ones are 15  9   21
     * The sum of the odd branch nodes is 15+9+21=45
     * 
     * @param node the root of the tree
     * @return the return the sum of the branch nodes with odd values in the tree.
     */

     public static int oddSumBranch(TreeNode node) {
        // check if node is branch
        // check if node data is odd
        // sum all branche nodes
        if (node == null) return 0;

        int sum = 0;
        if (node.left != null || node.right != null) {
            if (node.data % 2 != 0) sum += node.data;
        }
        sum += oddSumBranch(node.left);
        sum += oddSumBranch(node.right);
        return sum;
     }

    /** 
     * Given a reference to a head node in a linked list of integers, 
     * return a Map<Integer, Integer> containing each value along with the number of times it shows up.
     * 
     * Example:
     * Linked List:
     * 4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8
     *
     * Expected Return Map (order is unimportant): 
     * { 
     *   4: 3,
     *   8: 2,
     *   16: 2,
     *   29: 1,
     *   34: 1
     * }
     * 
     */
    public static Map<Integer, Integer> linkedListToMap(ListNode head) {
        // create map 
        // while loop to run thru each node
        // check if data exist in map if not add to map
        Map<Integer, Integer> map = new HashMap<>();

        ListNode current = head;
        while (current != null) {
            if (map.containsKey(current.data)) {
                map.put(current.data, map.get(current.data) + 1);
            } else {
                map.put(current.data, 1);
            }
            current = current.next;
        }
        return map;
    }



}

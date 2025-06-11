
import java.util.HashMap;
import java.util.Map;

public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked-list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked-list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        ListNode curr = head;
        if (curr == null) return 0;

        int count = 0;
        int sum = 0;
  
        while (curr != null) {
            if (count % 2 != 0) {
                sum += curr.data;
            }
            count++;
            curr = curr.next;
        }
        return sum;
    }

    /**
     * Return the largest of only the last 3 values of the linked-list.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked-list
     * @return the largest value of the last three ListNodes.
     */
    public static int findLargestOfLastThree(ListNode head) {
        if (head == null) return 0;

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < 2; i++) {
            if (fast == null) {
                return 0;
            }
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if (slow == null || slow.next == null || slow.next.next == null) {
            return 0;
        }
        
        int first = slow.data;
        int second = slow.next.data;
        int third = slow.next.next.data;

        return Math.max(third, Math.max(first, second));
        }

    /**
     * Return the sum of the leaf nodes with even values in the tree.
     * 
     * If passed a null node, returns 0.
     * 
     * @param node the root TreeNode of a tree.
     * @return the sum of even leaf nodes.
     */        
    public static int sumEvenLeafNodes(TreeNode node) {
        if (node == null) return 0;

        if (node.left == null && node.right == null) {
            if (node.data % 2 == 0) {
                return node.data;
            }
            return 0;
        }
        return sumEvenLeafNodes(node.left) + sumEvenLeafNodes(node.right);
        }

    /**
     * Return the sum of the branch nodes with odd values in the tree.
     * 
     * If passed a null node, returns 0.
     * 
     * @param node the root TreeNode of a tree.
     * @return the sum of odd branch nodes.
     */      
    public static int sumOddBranchNodes(TreeNode node) {
        if (node == null) return 0;
        
        if (node.left != null || node.right != null) {
            if (node.data % 2 != 0) {
                return node.data + sumOddBranchNodes(node.left) + sumOddBranchNodes(node.right);
            }
        }
        return sumOddBranchNodes(node.left) + sumOddBranchNodes(node.right);
    }

    /**
     * Return a Map<Integer, Integer> containing each value along with the number of times it shows up.
     * 
     * If passed a null head, returns a new HashMap.
     * 
     * @param head the head of the linked-list
     * @return the map that shows a frequency for each value.
     */
    public static Map<Integer, Integer> frequencyMap(ListNode head) {
        ListNode curr = head;
        if (curr == null) return new HashMap<>();

        Map<Integer, Integer> freqMap = new HashMap<>();

        while (curr != null) {
            Integer count = freqMap.get(curr.data);
            if (count == null) {
                freqMap.put(curr.data, 1);
            } else {
                freqMap.put(curr.data, count + 1);
        }
            curr = curr.next;
        }   
        return freqMap;
    }
} 



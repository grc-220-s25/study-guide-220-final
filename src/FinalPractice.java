import java.util.HashMap;
import java.util.LinkedList;
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
        int sum = 0;
    int index = 0;
    ListNode current = head;

    while (current != null) {
        if (index % 2 == 1) {
            sum += current.data;
        }
        current = current.next;
        index++;
    }

    return sum;
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
    public static int largestOfLast3(ListNode head) {
        if (head == null) return Integer.MIN_VALUE;

        LinkedList<Integer> lastThree = new LinkedList<>();
        while (head != null) {
            if (lastThree.size() == 3) {
                lastThree.poll();
            }
            lastThree.add(head.data);
            head = head.next;
        }

        int max = Integer.MIN_VALUE;
        for (int val : lastThree) {
            if (val > max) max = val;
        }
        return max;
    }

    public static int sumEvenLeaf(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null && root.data % 2 == 0) return root.data;
        return sumEvenLeaf(root.left) + sumEvenLeaf(root.right);
    }

    public static int sumOddBranches(TreeNode root) {
        if (root == null) return 0;
        boolean isBranch = root.left != null || root.right != null;
        int sum = 0;
        if (isBranch && root.data % 2 == 1) sum += root.data;
        sum += sumOddBranches(root.left);
        sum += sumOddBranches(root.right);
        return sum;
    }

    public static Map<Integer, Integer> frequencyMap(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            map.put(head.data, map.getOrDefault(head.data, 0) + 1);
            head = head.next;
        }
        return map;
    }
}


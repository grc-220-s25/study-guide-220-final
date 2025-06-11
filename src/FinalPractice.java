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
        int index = 0;
        int sum = 0;
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
    public static int maxOfLast3(ListNode head) {
        if (head == null) {
            throw new IllegalArgumentException("List must have at least 3 nodes");
        }

        ListNode first = head;
        ListNode second = head.next;
        ListNode third = (second != null) ? second.next : null;

        while (third != null && third.next != null) {
            first = first.next;
            second = second.next;
            third = third.next;
        }

        if (third == null) {
            throw new IllegalArgumentException("List must have at least 3 nodes");
        }

        return Math.max(first.data, Math.max(second.data, third.data));
    }

    public static int sumEvenLeafNodes(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) {
            return (root.data % 2 == 0) ? root.data : 0;
        }

        return sumEvenLeafNodes(root.left) + sumEvenLeafNodes(root.right);
    }

    public static int sumOddBranchNodes(TreeNode root) {
        if (root == null) return 0;

        boolean isBranch = root.left != null || root.right != null;
        int sum = 0;

        if (isBranch && root.data % 2 != 0) {
            sum += root.data;
        }

        sum += sumOddBranchNodes(root.left);
        sum += sumOddBranchNodes(root.right);

        return sum;
    }
}

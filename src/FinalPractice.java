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
        int index = 0;
        int sum = 0;
        ListNode current = head;

        while (current != null) {
            if (index % 2 != 0) {
                sum += current.data;
            }
            current = current.next;
            index++;
        }

    return sum;
    }

    public static int maxOfLastThree(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return -1;
        }

        ListNode first = head;
        ListNode second = null;
        ListNode third = null;

        if (head.next != null) {
            second = head.next;
        }

        if (second != null && second.next != null) {
            third = second.next;
        }

        while (third != null && third.next != null) {
            first = second;
            second = third;
            third = third.next;
        }

        return Math.max(first.data, Math.max(second.data, third.data));
    }

    public static int sumEvenLeaves(TreeNode node) {
    if (node == null) {
        return 0;
    }

    if (node.left == null && node.right == null) {
        return (node.data % 2 == 0) ? node.data : 0;
    }

    return sumEvenLeaves(node.left) + sumEvenLeaves(node.right);
}


}

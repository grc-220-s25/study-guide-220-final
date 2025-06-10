
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
    } 



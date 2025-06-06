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

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
    }


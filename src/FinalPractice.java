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
}

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
        int currentIndex = 0;
        int sum = 0;
        while (head != null) {
            if (currentIndex % 2 != 0) {
                sum += head.data;
            }
            currentIndex++;
            head = head.next;
        }
        return sum;

        /*
         CHECK TO SEE IF HEAD IS NULL THEN RETURN 0

         NEED TO TRACK OUR INDEX USING SOME SORT OF VARIBLE INT vari =0; start a first index

         skip current one and dont add could possibly use % to just check whether the counter is odd

         then store that indexs data in a variable.

         once null is reached return

         While node != null {
            node = node.next
         }
         */
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
}

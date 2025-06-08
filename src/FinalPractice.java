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
        if(head == null) return 0;

        ListNode current = head;
        int sum = 0;
        int position = 0;

        while(current != null) {
           if(position % 2 != 0) {
            sum += current.data;
           }
            current = current.next;
            position++;
        }

        return sum;
    }
    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
    public static int LargestOfLastThree(ListNode head) {
        if(head == null) return 0;

        ListNode current = head;

        int firstLast = 0;
        int secondLast = 0;
        int last = 0;
        int fourthLast = 0;
        
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }

        current = head;
        int max = Integer.MIN_VALUE;

        if(count < 4) {
            while(current != null) {
            if(current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;

    } else {

        while(current != null) {

            firstLast = secondLast;
            secondLast = last;
            last = fourthLast;
            fourthLast = current.data;

            current = current.next;
        }
       int maxOfFour = Math.max(Math.max(firstLast, secondLast), Math.max(last, fourthLast));
       return maxOfFour;
     }
    }
}


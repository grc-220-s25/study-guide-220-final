import java.util.*;

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
        if (head == null){
            return 0;
        }
        
        int index = 0;
        int sum = 0;

        ListNode current = head;

        while (current != null){
            if (index % 2 != 0){
                sum += current.data;
            }

            index++;
            current = current.next;
        }

        return sum;
    }

    public static int largestOfLastThree(ListNode head){
        ListNode current = head;

        Queue<Integer> lastThree = new LinkedList<>();
        

        while (current != null) {
            if (lastThree.size() == 3) {
                lastThree.poll(); // remove the oldest
            }
            lastThree.offer(current.data); // add the newest
            current = current.next;
        }

        int maxNum = Integer.MIN_VALUE;

        for (int num : lastThree){
            maxNum = Math.max(maxNum, num);
        }


        return maxNum;
    }
}

public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment
        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 

        // ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        // System.out.println(oddIndexSum(list));

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
            if (index % 2 == 1) {
                sum += current.data;
            }
            current = current.next;
            index++;
        }
        return sum;
    }



       // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT
       public static int countNodes(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) { 
            count++; current = current.next;
        }
        return count;
       }
       @Override
       public boolean equals(Object obj) {
           return super.equals(obj);
       }
    
   
   
       @Override0er99ds
       public String toString() {
           return super.toString();
       }
    }



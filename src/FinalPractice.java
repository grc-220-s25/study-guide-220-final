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
        if(head == null) return 0;

        ListNode current = head;
        int sum = 0;
        int oddIndex = 0;

        while(current != null) {
           if(oddIndex % 2 != 0) {
            sum += current.data;
           }
            current = current.next;
            oddIndex++;
        }

        return sum;
    }

    public static int evenIndexSum(ListNode head) {

        if(head == null) return 0;

        ListNode current = head;
        int sum = 0;
        int evenIndex = 0;

        while(current != null) {
            if(evenIndex % 2 == 0) {
                sum += current.data;
            }
            current = current.next;
            evenIndex++;
        }
        return sum;
    }
    
    public static int LargestOfLastThree(ListNode head) {
        if(head == null) return 0;

        ListNode current = head;

        int firstLast = 0;
        int secondLast = 0;
        int last = 0;

        while(current != null) {

            firstLast = secondLast;
            secondLast = last;
            last = current.data;

            current = current.next;
        }
        int maxOfThree = Math.max(Math.max(firstLast, secondLast), last);
        return maxOfThree;
    }

    public static int LargestlastFour(ListNode head) {
        if(head == null) return 0;

        int lastFirst = 0;
        int lastSecond = 0;
        int lastThird = 0;
        int lastFour = 0;

        ListNode current = head;

        while(current != null) {

            lastFirst = lastSecond;
            lastSecond = lastThird;
            lastThird = lastFour;
            lastFour = current.data;

            current = current.next;

            }
            int maxFour = Math.max(Math.max(lastFirst, lastSecond), Math.max(lastThird, lastFour));
            return maxFour;
        }
        
        
    public static int treeNodeEven(TreeNode root) {
        if(root == null) return 0;

        int sum = 0;
        if(root.left == null && root.right == null) {
            if(root.data % 2 == 0) {
                sum += root.data;
            }
        }
        sum += treeNodeEven(root.left);
        sum += treeNodeEven(root.right);
        return sum;
    }

    public static int branchNodeOdd(TreeNode root) {
        if(root == null) return 0;

        int sum = 0;
        if((root.left != null || root.right != null) && root.data % 2 != 0) {
                sum += root.data;
            }
            sum += branchNodeOdd(root.left);
            sum += branchNodeOdd(root.right);
            return sum;
    
        }
        
    public static Map<Integer, Integer> intMap(ListNode head) {

        if(head == null) return new HashMap<>();

        ListNode current = head;

        Map<Integer, Integer> countMap = new HashMap<>();

        while(current != null) {
            int value = current.data;
            if(countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1 );
            } else {
                countMap.put(value, 1);
            }
            current = current.next;
        }
            return countMap;
    }
}



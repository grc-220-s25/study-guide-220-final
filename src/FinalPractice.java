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

        ListNode current = head;

        // int count = 0;

        // while(current != null) {
        //     count++;
        //     current = current.next;
        // }

        // if(count < 3) {
        //     return -1;
        // }

        // current = head;

        int firstLastNode = 0;
        int secondLastNode = 0;
        int thirdLastNode = 0;

        while(current != null) {

            firstLastNode = secondLastNode;
            secondLastNode = thirdLastNode;
            thirdLastNode = current.data;

            current = current.next;
        }
        int largestOfLastMax = Math.max(Math.max(firstLastNode, secondLastNode), thirdLastNode);
        return largestOfLastMax;
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
        
        return sum + treeNodeEven(root.right) + treeNodeEven(root.left) ;
    }

    public static int leafNodeOdd(TreeNode root) {

        int sum = 0;
        if(root.left == null && root.right == null) {
            if(root.data % 2 == 0) {
                sum += root.data;
            }
        }
        return sum;
    }

    public static int branchNodeOdd(TreeNode root) {
        if(root == null) return 0;

        int sum = 0;
        if((root.left != null || root.right != null) && root.data % 2 != 0) {
                sum += root.data;
            }

            return sum + branchNodeOdd(root.left) + branchNodeOdd(root.right);
    
        }
        
    public static Map<Integer, Integer> intMap(ListNode head) {
        if(head == null) return new HashMap<>();

        ListNode current = head;

        Map<Integer, Integer> countMap = new HashMap<>();

        while(current != null) {
            int value = current.data;
            if(countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1);
            } else {
                countMap.put(value,1);
            }
            current = current.next;
        }
        return countMap;
    }
}



public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment
        TreeNode tree = new TreeNode(1,
        new TreeNode(1,
        new TreeNode(2, null,null),
        new TreeNode(1, null,null)),
        //right
        new TreeNode(1,
        new TreeNode(1, null, null),
        new TreeNode(2, null, null)));
        int evenLeafSum = 0;
        if (tree.left == null && tree.right == null && tree.data % 2 == 0)  {
            System.out.println("Leaf found: " + tree.data);
            evenLeafSum += tree.data;
        }
        evenLeafSum += sumOfLeafevenLeafNodes(tree.left);
        evenLeafSum += sumOfLeafevenLeafNodes(tree.right);
        System.out.println(evenLeafSum);
        
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
     public static int evenIndexSum(ListNode head) {
        if (head == null) return 0;
        int currentIndex = 0;
        int sum = 0;
        while (head != null) {
            if (currentIndex % 2 == 0) {
                sum+= head.data;
            }
            currentIndex++;
            head = head.next;
        }
        return sum;
     }
     /*
      * Given a reference to the head of a linked list, return the largest of only the last 3 values of the list.
        Example:
        Linked List:
        7 -> 3 -> 19 -> 21 -> 14 -> 33 -> 8 -> 26 -> 11 -> 5
        Expected Answer: 26
        Last 3 values are: 26  11  5, the largest of which is 26
        POSSIBLE VARIATION: Largest of last 4 values
      */
     public static int largestOfLastThree(ListNode head){
        if (head == null) return 0;
        if (head.next == null || head.next == null || head.next.next == null) {
            return head.data;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        int maxOfthree = 0;
        while (head != null && head.next != null && head.next.next != null) {
            first = head.data;
            second = head.next.data;
            third = head.next.next.data;
            head = head.next;
        }
        maxOfthree = Math.max(first, Math.max(second, third));
        
        

        return maxOfthree;

        /*
         First we check if its null and if so return 0;

         create varible called largests value of last three

         loop through using the while loop, and checking if the currentvalue is larger than the next.

         We will only start checking when head.next.next.next == null meaning that we are at the last three.

         from there we will start updating the value starting at that node.data
         */
     }
     public static int largestOfLastFour(ListNode head){
        if (head == null) return 0;
        if (head.next == null || head.next == null || head.next.next == null) {
            return head.data;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;
        int maxOfLastFour = 0;
        while (head != null && head.next != null && head.next.next != null && head.next.next.next != null) {
            first = head.data;
            second = head.next.data;
            third = head.next.next.data;
            fourth = head.next.next.next.data;
            head = head.next;
        }
        maxOfLastFour = Math.max(Math.max(first, second), Math.max(third, fourth));
        
        

        return maxOfLastFour;
    }
    /*
     * Given a reference to the root of a tree, return the sum of the leaf nodes with even values in the tree. Do not include any odd or branch nodes.
        Example:
        Tree:
               12
             /    \
            6      18
           / \    /  \
          4   8  16   20
         /              \
        3                22

        Expected Answer: 46
        The leaf nodes are 3   8   16   22, and the even ones are 8   16   22.
        The sum of the even leaf nodes is 8+16+22 = 46
        POSSIBLE VARIATION: Sum of leaf nodes with odd values


     */
    public static int sumOfLeafevenLeafNodes(TreeNode head){
        /*
         if head is null return 0

         create a variable to store the sum of evenLeafNodes

         recurse through using sumOfLeafevenLeafNodes();
          if the node on the left and right == null and node.data % 2 == 0
          sum that node.data
             0
            / \
           1   2

                      1
                    /   \
                  1       1
                 / \     / \
                2   1   1   2
------------------------------------

                   1
                  /
                12

         */
        if (head == null) return 0;
        int evenLeafSum = 0;
        if (head.left == null && head.right == null && head.data % 2 == 0)  {
            System.out.println("Leaf found: " + head.data);
            evenLeafSum += head.data;
        }
        evenLeafSum += sumOfLeafevenLeafNodes(head.left);
        evenLeafSum += sumOfLeafevenLeafNodes(head.right);
        
        return evenLeafSum;
    }
    /*
     Given a reference to the root of a tree, return the sum of the branch nodes with odd values in the tree. Do not include any even or leaf nodes.
        Example:
        Tree:
            15
          /    \
         9      4
        / \    /  \
       8   11 21   30
      / \        \
     2   6        23

        Expected Answer: 45
        The branch nodes are 15  9  4  8  21, and the odd ones are 15  9   21
        The sum of the odd branch nodes is 15+9+21=45
        POSSIBLE VARIATION: Sum of branch nodes with even values

        Given a reference to a head node in a linked list of integers, return a Map<Integer, Integer> containing each value along with the number of times it shows up.
        Example:
        Linked List:
        4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8

        Expected Return Map (order is unimportant): 
        { 
        4: 3,
        8: 2,
        16: 2,
        29: 1,
        34: 1
        } 

        Explanation
        4 shows up three times
        8 shows up two times
        16 shows up two times
        29 shows up one time
        34 shows up one time    

     */
    public static int sumOfoddBranchNodes(TreeNode tree){
        /*
         check if null return 0;
         create a sumofOddbranche varibel
         use recursion to check only the branch nodes if node.left || node.right != null

         if the current data % 2 != 0 
         add to the sumOfoddBranches varible
           Tree:
            15
          /    \
         9      4
        / \    /  \
       8   11 21   30
      / \        \
     2   6        23
         */
        if(tree == null) return 0;
        int sumOfOddbranches = 0;
        if ((tree.left != null || tree.right != null) && tree.data % 2 != 0) {
            sumOfOddbranches += tree.data;
        }
        sumOfOddbranches += sumOfoddBranchNodes(tree.left);
        sumOfOddbranches += sumOfoddBranchNodes(tree.right);
        return sumOfOddbranches;
    }
}   

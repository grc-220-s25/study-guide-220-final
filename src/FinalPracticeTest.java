import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10, new ListNode(12, new ListNode(14, new ListNode(16, new ListNode(18)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(40, actual);
    }
    @Test
    void testEvenIndexSum_nullLengthList() {
        int actual = FinalPractice.oddIndexSum(null);
        assertEquals(0, actual);
    }

    @Test
    void testSingleNode() {
        ListNode list = new ListNode(5);
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void testTwoNode() {
        ListNode list = new ListNode(5, new ListNode(10));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(10, actual);
    }

    @Test
    void testFourNode() {
        ListNode list = new ListNode(5, new ListNode(10, new ListNode(15, new ListNode(20))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(30,actual);
    }
       // --- Test for LargestOfLastThree --- //
    // TODO: Make thorough tests for ALL the questions on the study guide
    @Test
    void testForLargestLastThree() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(55, new ListNode(34)))))))));
        int actual = FinalPractice.LargestOfLastThree(list);
        assertEquals(55, actual);
    }

    @Test
    void testForLargestFourValues() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(55, new ListNode(22, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.LargestOfLastThree(list);
        assertEquals(55, actual);
    }

    @Test
    void testForLastNodeNull() {
        int actual = FinalPractice.LargestOfLastThree(null);
        assertEquals(0, actual);
    }
    // --- test for treeNodeEven --- //
    @Test
    public void testForLeafNodeEven() {
        TreeNode root = new TreeNode(2,
            new TreeNode(4),
            new TreeNode(6, new TreeNode(8), null));
            assertEquals(12, FinalPractice.treeNodeEven(root));
        }
        
        @Test
    public void testForLeafNodeOdd() {
        TreeNode root = new TreeNode(1,
            new TreeNode(3),
            new TreeNode(5, new TreeNode(7), new TreeNode(9)));
            assertEquals(0, FinalPractice.treeNodeEven(root));
        }    

    // --- test for hashmap --- //    

        @Test
        void testForHashMap() {
            ListNode head = new ListNode(4);
            head.next = new ListNode(34);
            head.next.next = new ListNode(4);
            head.next.next.next = new ListNode(16);
            head.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next = new ListNode(16);
            head.next.next.next.next.next.next = new ListNode(29);
            head.next.next.next.next.next.next.next = new ListNode(8);
            head.next.next.next.next.next.next.next.next = new ListNode(8);


            Map<Integer, Integer> expected = new HashMap<>();
            expected.put(4, 3);
            expected.put(34, 1);
            expected.put(16,2);
            expected.put(8,2);
            expected.put(29,1);

            Map<Integer, Integer> actual = FinalPractice.intMap(head);

            assertEquals(expected, actual);
        }

        @Test
        void testForHashMap_null() {
            Map<Integer, Integer> expected = new HashMap<>();

            Map<Integer, Integer> actual = FinalPractice.intMap(null);

            assertEquals(expected, actual);
        }
        
        @Test
        void testForHashMap_AllUnique() {
            ListNode head = new ListNode(4);
            head.next = new ListNode(8);
            head.next.next = new ListNode(12);
            head.next.next.next = new ListNode(16);
            head.next.next.next.next = new ListNode(20);

            Map<Integer, Integer> expected = new HashMap<>();
            expected.put(4, 1);
            expected.put(8, 1);
            expected.put(12, 1);
            expected.put(16, 1);
            expected.put(20, 1);

            Map<Integer, Integer> actual = FinalPractice.intMap(head);

            assertEquals(expected, actual);
        }
        
        @Test
        void testForHashMap_AllDup() {
            ListNode head = new ListNode(4);
            head.next = new ListNode(4);
            head.next.next = new ListNode(4);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(4);

            Map<Integer, Integer> expected = new HashMap<>();
            expected.put(4, 5);
            Map<Integer, Integer> actual = FinalPractice.intMap(head);

            assertEquals(expected, actual);
        }

        @Test
        void testEvenIndexSum_evenList() {
            ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
            int actual = FinalPractice.evenIndexSum(list);
            assertEquals(87, actual);
        }
        
    }
        
 

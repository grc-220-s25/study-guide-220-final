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
       /* Test for LargestLastThree */
    @Test
    void testForLargestLastThree() {
        ListNode list = new ListNode(7, new ListNode(3, new ListNode(19, new ListNode(21, new ListNode(14, new ListNode(33, new ListNode(8, new ListNode(26, new ListNode(11, new ListNode(5))))))))));
        int actual = FinalPractice.LargestOfLastThree(list);
        assertEquals(26, actual);
    }

    @Test
    void testForLastNodeNull() {
        int actual = FinalPractice.LargestOfLastThree(null);
        assertEquals(0, actual);
    }

    @Test
    void testForLargestLastThree_Dup() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(11, new ListNode(11)))))))));
        int actual = FinalPractice.LargestOfLastThree(list);
        assertEquals(11, actual);
    }

    @Test
    void testForLargestLastThree_OneNode() {
        ListNode list = new ListNode(4);
        int actual = FinalPractice.LargestOfLastThree(list);
        assertEquals(4, actual);
    }

    @Test
    void testForLargestLastThree_TwoNode() {
        ListNode list = new ListNode(4, new ListNode(6));
        int actual = FinalPractice.LargestOfLastThree(list);
        assertEquals(6, actual);
    }

    
    
    /* Test for LeafNodeEven */
    @Test
    public void testForLeafNodeEven() {
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4,
                    new TreeNode(3),
                    null),
                new TreeNode(8)),
            new TreeNode(18,
                new TreeNode(16),
                new TreeNode(20,
                    null,
                    new TreeNode(22)))
        );
        int actual = FinalPractice.treeNodeEven(root);
        int expected = 46;
        assertEquals(expected, actual);
        }
        
    @Test
    public void testForLeafNodeNull() {
        assertEquals(0, FinalPractice.treeNodeEven(null));
        }
    
    @Test
    public void testForLeafNodeSinlge() {
            TreeNode root = new TreeNode(12);
            int actual = FinalPractice.treeNodeEven(root);
            int expected = 12;
            assertEquals(expected, actual);
            }

   @Test
   public void testForLeafNodeDup() {
    TreeNode root = new TreeNode(12,
            new TreeNode(12,
                new TreeNode(12,
                    new TreeNode(12),
                    null),
                new TreeNode(12)),
            new TreeNode(12,
                new TreeNode(12),
                new TreeNode(12,
                    null,
                    new TreeNode(12)))
        );
        int actual = FinalPractice.treeNodeEven(root);
        int expected = 48;
        assertEquals(actual, expected);
   }
    



    /* Test for HashMaps */

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

        /* Test for evenIndexSum */
        @Test
        void testEvenIndexSum_evenList() {
            ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
            int actual = FinalPractice.evenIndexSum(list);
            assertEquals(87, actual);
        }

        @Test
        void testEvenIndexSum_Null() {
            int actual = FinalPractice.evenIndexSum(null);
            assertEquals(0, actual);
        }

        @Test
        void testEvenIndexSum_AllDup() {
            ListNode list = new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(4)))))))));
            int actual = FinalPractice.evenIndexSum(list);
            assertEquals(20, actual);
        }

        @Test
        void testEvenIndexSum_oddList() {
            ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23)))));
            int actual = FinalPractice.evenIndexSum(list);
            assertEquals(42, actual);
        }
        /* Test for LargestLastFour */

        @Test
        void testForLargestLastFour() {
            ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(12, new ListNode(34)))))))));
            int actual = FinalPractice.LargestlastFour(list);
            assertEquals(42, actual);
        }
        
        @Test
        void testForLargestLastFour_FourNodes() {
            ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16))));
            int actual = FinalPractice.LargestOfLastThree(list);
            assertEquals(16, actual);
        }

        @Test
        void testForLargestLastFour_Null() {
            int actual = FinalPractice.LargestOfLastThree(null);
            assertEquals(0, actual);
        }

        /* Test for branchNodeOdd */

        @Test
        void testForBranchNode() {
            TreeNode root = new TreeNode(15,
            new TreeNode(9,
                new TreeNode(8,
                    new TreeNode(2),
                    new TreeNode(6)
                ),
                new TreeNode(11)
            ),
            new TreeNode(4,
                new TreeNode(21, new TreeNode(0), null),
                new TreeNode(30,
                    null,
                    new TreeNode(23)
                )
            )
        );
        int expected = 45;
        int result = FinalPractice.branchNodeOdd(root);
        assertEquals(expected, result);
    }

    @Test
    void testForBranchNode_Null() {
    int expected = 0;
    int result = FinalPractice.branchNodeOdd(null);
    assertEquals(expected, result);

    }
    @Test
    void testForBranchNode_Even() {
        TreeNode root = new TreeNode(10,
            new TreeNode(8,
                new TreeNode(2,
                    new TreeNode(0),
                    null
                ),
                new TreeNode(6)
            ),
            new TreeNode(4,
                new TreeNode(14),
                new TreeNode(20,
                    null,
                    new TreeNode(22)
                )
            )
        );
        int expected = 0;
        int result = FinalPractice.branchNodeOdd(root);
        assertEquals(expected, result);
    }

    @Test
    void testForBranchNode_One() {
        TreeNode root = new TreeNode(12, new TreeNode(8), null);
        int expected = 0;
        int result = FinalPractice.branchNodeOdd(root);
        assertEquals(expected, result);
    }
}
        
 

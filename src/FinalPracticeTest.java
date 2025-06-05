import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    /*
     * 
     * Tests for oddIndexSum()
     */
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16,
                new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(2 + 4 + 6, actual);
    }

    @Test
    void testOddIndexSum_emptyList() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void testOddIndexSum_singleNode() {
        ListNode list = new ListNode(99);
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual); 
    }

    @Test
    void testOddIndexSum_twoNodes() {
        ListNode list = new ListNode(10, new ListNode(20));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(20, actual); 
    }

    @Test
    void testOddIndexSum_allOddIndexesZero() {
        ListNode list = new ListNode(1, new ListNode(0, new ListNode(2, new ListNode(0,
                new ListNode(3, new ListNode(0))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0 + 0 + 0, actual);
    }

    /*
     * Test for largestOfLastThree()
     */

    @Test
    void testLargestOfLastThree_typicalCase() {
        ListNode list = new ListNode(7, new ListNode(3, new ListNode(19, new ListNode(21,
                new ListNode(14, new ListNode(33, new ListNode(8, new ListNode(26,
                        new ListNode(11, new ListNode(5))))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(26, actual); 
    }

    @Test
    void testLargestOfLastThree_exactlyThreeNodes() {
        ListNode list = new ListNode(9, new ListNode(4, new ListNode(12)));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(12, actual); 
    }

    @Test
    void testLargestOfLastThree_allEqualValues() {
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1,
                new ListNode(1, new ListNode(7, new ListNode(7, new ListNode(7))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(7, actual); 
    }

    @Test
    void testLargestOfLastThree_descendingOrder() {
        ListNode list = new ListNode(10, new ListNode(9, new ListNode(8, new ListNode(7,
                new ListNode(6, new ListNode(5, new ListNode(4, new ListNode(3,
                        new ListNode(2, new ListNode(1))))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(3, actual);
    }

    @Test
    void testLargestOfLastThree_ascendingOrder() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8,
                        new ListNode(9, new ListNode(10))))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(10, actual); 
    }


    /*
     * Tests for sumLeafEvenNodes()
     */

    @Test
    void testSumLeafEvenNodes_typicalCase() {
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4,
                    new TreeNode(3),
                    null
                ),
                new TreeNode(8)
            ),
            new TreeNode(18,
                new TreeNode(16),
                new TreeNode(20,
                    null,
                    new TreeNode(22)
                )
            )
        );

        int actual = FinalPractice.sumLeafEvenNodes(root);
        assertEquals(46, actual); 
    }

    @Test
    void testSumLeafEvenNodes_allOddLeaves() {
        TreeNode root = new TreeNode(10,
            new TreeNode(3),
            new TreeNode(5,
                new TreeNode(7),
                new TreeNode(9)
            )
        );

        int actual = FinalPractice.sumLeafEvenNodes(root);
        assertEquals(0, actual); 
    }

    @Test
    void testSumLeafEvenNodes_singleEvenLeaf() {
        TreeNode root = new TreeNode(10,
            null,
            new TreeNode(8)
        );

        int actual = FinalPractice.sumLeafEvenNodes(root);
        assertEquals(8, actual);
    }

    @Test
    void testSumLeafEvenNodes_singleOddLeaf() {
        TreeNode root = new TreeNode(10,
            null,
            new TreeNode(9)
        );

        int actual = FinalPractice.sumLeafEvenNodes(root);
        assertEquals(0, actual);
    }

    @Test
    void testSumLeafEvenNodes_nullTree() {
        TreeNode root = null;
        int actual = FinalPractice.sumLeafEvenNodes(root);
        assertEquals(0, actual);
    }

    @Test
    void testSumLeafEvenNodes_rootIsEvenLeaf() {
        TreeNode root = new TreeNode(6);
        int actual = FinalPractice.sumLeafEvenNodes(root);
        assertEquals(6, actual); 
    }

    @Test
    void testSumLeafEvenNodes_rootIsOddLeaf() {
        TreeNode root = new TreeNode(7);
        int actual = FinalPractice.sumLeafEvenNodes(root);
        assertEquals(0, actual); 
    }

    /*
     * tests for sumOddBranchNodes()
     */

    @Test
    void testSumOddBranchNodes_typicalCase() {
        TreeNode root = new TreeNode(15,
            new TreeNode(9,
                new TreeNode(8,
                    new TreeNode(2),
                    new TreeNode(6)
                ),
                new TreeNode(11)
            ),
            new TreeNode(4,
                new TreeNode(21,
                    null,
                    new TreeNode(23)
                ),
                new TreeNode(30)
            )
        );

        int actual = FinalPractice.sumOddBranchNodes(root);
        assertEquals(45, actual);
    }

    @Test
    void testSumOddBranchNodes_allEvenBranches() {
        TreeNode root = new TreeNode(8,
            new TreeNode(4,
                new TreeNode(2),
                new TreeNode(6)
            ),
            new TreeNode(10)
        );

        int actual = FinalPractice.sumOddBranchNodes(root);
        assertEquals(0, actual);
    }

    @Test
    void testSumOddBranchNodes_allOddLeaves() {
        TreeNode root = new TreeNode(1,
            new TreeNode(3),
            new TreeNode(5)
        );

        int actual = FinalPractice.sumOddBranchNodes(root);
        assertEquals(1, actual);
    }

    @Test
    void testSumOddBranchNodes_rootIsOnlyOddLeaf() {
        TreeNode root = new TreeNode(11);
        int actual = FinalPractice.sumOddBranchNodes(root);
        assertEquals(0, actual);
    }

    @Test
    void testSumOddBranchNodes_rootIsOddBranch() {
        TreeNode root = new TreeNode(7,
            new TreeNode(1),
            null
        );

        int actual = FinalPractice.sumOddBranchNodes(root);
        assertEquals(7, actual);
    }

    @Test
    void testSumOddBranchNodes_nullTree() {
        TreeNode root = null;
        int actual = FinalPractice.sumOddBranchNodes(root);
        assertEquals(0, actual);
    }
}

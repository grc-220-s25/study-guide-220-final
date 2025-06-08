import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // TODO: Make more tests for oddIndexSum
    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, 
        new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10))))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(30, actual);
    }

    @Test
    void testOddIndexSum_nullHead() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void testOddIndexSum_allOddIsZero() {
        ListNode list = new ListNode(1, new ListNode(0, new ListNode(3, new ListNode(0, new ListNode(5,
        new ListNode(0, new ListNode(7, new ListNode(0))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void testOddIndexSum_allEvenIsZero() {
        ListNode list = new ListNode(0, new ListNode(5, new ListNode(0, new ListNode(10, new ListNode(0,
        new ListNode(15, new ListNode(0, new ListNode(20))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(50, actual);
    }

    // TODO: Make thorough tests for ALL the questions on the study guide
    @Test
    void testHighestOfLastThree_nullHead() {
        ListNode list = null;
        int actual = FinalPractice.highestOfLastThree(list);
        assertEquals(0, actual);
    }

    @Test
    void testHighestOfLastThree_oneNodeList() {
        ListNode list = new ListNode(999);
        int actual = FinalPractice.highestOfLastThree(list);
        assertEquals(999, actual);
    }

    @Test
    void testHighestOfLastThree_twoNodesList() {
        ListNode list = new ListNode(9, new ListNode(99));
        int actual = FinalPractice.highestOfLastThree(list);
        assertEquals(99, actual);
    }

    @Test
    void testHighestOfLastThree_threeNodesList() {
        ListNode list = new ListNode(9, new ListNode(99, new ListNode(999)));
        int actual = FinalPractice.highestOfLastThree(list);
        assertEquals(999, actual);
    }

    @Test
    void testHighestOfLastThree_multipleNodesList() {
        ListNode list = new ListNode(7, new ListNode(3, new ListNode(19, new ListNode(21, new ListNode(14,
        new ListNode(33, new ListNode(8, new ListNode(26, new ListNode(11, new ListNode(5))))))))));
        int actual = FinalPractice.highestOfLastThree(list);
        assertEquals(26, actual);
    }

    // *        12
    // *      /    \
    // *     6      18
    // *    / \    /  \
    // *   4   8  16   20
    // *  /               \
    // * 3                22

    @Test
    void testEvenSumLeaf_mixedTree() {
        TreeNode root = new TreeNode(12, new TreeNode(6, 
        new TreeNode(4, new TreeNode(3), null), new TreeNode(8)), 
        new TreeNode(18, new TreeNode(16), new TreeNode(20, null, new TreeNode(22))));
        int actual = FinalPractice.evenSumLeaf(root);
        assertEquals(46, actual);
    }

    @Test
    void testEvenSumLeaf_nullRootTree() {
        TreeNode root = null;
        int actual = FinalPractice.evenSumLeaf(root);
        assertEquals(0, actual);
    }

    @Test
    void testEvenSumLeaf_onlyOddRootTree() {
        TreeNode root = new TreeNode(5);
        int actual = FinalPractice.evenSumLeaf(root);
        assertEquals(0, actual);
    }

    @Test
    void testEvenSumLeaf_onlyEvenRootTree() {
        TreeNode root = new TreeNode(10);
        int actual = FinalPractice.evenSumLeaf(root);
        assertEquals(10, actual);
    }


    // * Tree:
    //  *          -2
    //  *          / \
    //  *        -6  -4
    //  *       /      \
    //  *     -8       -10
    @Test
    void testEvenSumLeaf_onlyNegativeEvenTree() {
        TreeNode root = new TreeNode(-2,
            new TreeNode(-6,
                new TreeNode(-8),
                null
            ),
            new TreeNode(-4, null,
                new TreeNode(-10)
            )
        );
        int actual = FinalPractice.evenSumLeaf(root);
        assertEquals(-18, actual);
    }

    // * Tree:
    // *             10
    // *            /  \
    // *          -5    6
    // *         / \     \
    // *        3   0     -2
    // *             \
    // *              7
    // *
    // * Mixed positive, negative, and zero (four levels)
    // */
    @Test
    void testEvenSumLeaf_mixedTreeFourLevels() {
        TreeNode root = new TreeNode(10,
            new TreeNode(-5,
                new TreeNode(3),
                new TreeNode(0, null,
                    new TreeNode(7)
                )
            ),
            new TreeNode(6, null,
                new TreeNode(-2)
            )
        );
        int actual = FinalPractice.evenSumLeaf(root);
        assertEquals(-2, actual);
    }
}

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

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

    // *         15
    // *       /    \
    // *      9      4
    // *     / \    /  \
    // *    8   11 21   30
    // *   / \        \
    // *  2   6        23
    @Test
    void testOddSumBranch_mixedTree() {
        TreeNode root = new TreeNode(15, 
        new TreeNode(9, 
            new TreeNode(8, new TreeNode(2), new TreeNode(6)), 
            new TreeNode(11)), 
        new TreeNode(4,
            new TreeNode(21, null, new TreeNode(23)),
            new TreeNode(30)));
        int actual = FinalPractice.oddSumBranch(root);
        assertEquals(45, actual);
    }

    @Test
    void testOddSumBranch_nullRootTree() {
        TreeNode root = null;
        int actual = FinalPractice.oddSumBranch(root);
        assertEquals(0, actual);
    }

    // * Tree:
    // *             10
    // *            /  \
    // *          -4    6
    // *         / \     \
    // *        3   0     -2
    // *             \
    // *              7
    // *
    // * Mixed positive, negative, and zero (four levels)
    // */
    @Test
    void testOddSumBranch_noOddBranchTree() {
        TreeNode root = new TreeNode(10,
        new TreeNode(-4,
            new TreeNode(3),
            new TreeNode(0, null, new TreeNode(7))),
        new TreeNode(6, null, new TreeNode(-2)));
        int actual = FinalPractice.oddSumBranch(root);
        assertEquals(0, actual);
    }

    // * Tree:
    //  *          -1
    //  *          / \
    //  *        -2  -3
    //  *       /      \
    //  *     -4       -5    
    @Test
    void testOddSumBranch_allNegativeOddBranchTree() {
        TreeNode root = new TreeNode(-1,
        new TreeNode(-2, new TreeNode(-4), null),
        new TreeNode(-3, null, new TreeNode(-5)));
        int actual = FinalPractice.oddSumBranch(root);
        assertEquals(-4, actual);
    }

    @Test
    void testOddSumBranch_onlyRootTree() {
        TreeNode root = new TreeNode(5);
        int actual = FinalPractice.oddSumBranch(root);
        assertEquals(0, actual);
    }

    // * Linked List:
    // * 4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8
    // * Expected Return Map (order is unimportant): 
    // * { 
    // *   4: 3,
    // *   8: 2,
    // *   16: 2,
    // *   29: 1,
    // *   34: 1
    // * }
    @Test
    void testLinkedListToMap_mixedListNodes() {
        ListNode list = new ListNode(4, new ListNode(34, new ListNode(4, new ListNode(16,
        new ListNode(4, new ListNode(16, new ListNode(29, new ListNode(8, new ListNode(8)))))))));
        Map<Integer, Integer> actual = FinalPractice.linkedListToMap(list);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(4, 3);
        map.put(8, 2);
        map.put(16, 2);
        map.put(29, 1);
        map.put(34, 1);
        assertEquals(map, actual);
    }

    @Test
    void testLinkedListToMap_nullHead() {
        ListNode list = null;
        Map<Integer, Integer> actual = FinalPractice.linkedListToMap(list);
        Map<Integer, Integer> map = new HashMap<>();
        assertEquals(map, actual);
    }

    @Test
    void testLinkedListToMap_allOnesListNodes() {
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1,
        new ListNode(1)))));
        Map<Integer, Integer> actual = FinalPractice.linkedListToMap(list);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        assertEquals(map, actual);
    }

    @Test
    void testLinkedListToMap_mixedListNodes2() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, 
        new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, 
        new ListNode(34)))))))));
        Map<Integer, Integer> actual = FinalPractice.linkedListToMap(list);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(4, 1);
        map.put(8, 1);
        map.put(15, 1);
        map.put(16, 1);
        map.put(23, 1);
        map.put(42, 1);
        map.put(11, 1);
        map.put(29, 1);
        map.put(34, 1);
        assertEquals(map, actual);
    }
    
}

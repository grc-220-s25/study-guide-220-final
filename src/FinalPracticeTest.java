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
    void testOddIndexSum_singleNode() {
        ListNode list = new ListNode(10);
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test 
    void testOddIndexSum_negativeValues() {
        ListNode list = new ListNode(-1, new ListNode(-2, new ListNode(-3, new ListNode(-4, new ListNode(-5)))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(-2 + -4, actual);
    }

    // TODO: Make thorough tests for ALL the questions on the study guide
    @Test
    void testMaxOfLast3_typicalList() {
        ListNode list = new ListNode(7, new ListNode(3, new ListNode(19, new ListNode(21, new ListNode(14, new ListNode(33, new ListNode(8, new ListNode(26, new ListNode(11, new ListNode(5))))))))));
        int actual = FinalPractice.maxOfLast3(list);
        assertEquals(26, actual);
    }

    @Test
    void testMaxOfLast3_withNegatives() {
        ListNode list = new ListNode(-10, new ListNode(-20, new ListNode(-5, new ListNode(-30, new ListNode(-1)))));
        int actual = FinalPractice.maxOfLast3(list);
        assertEquals(-1, actual);
    }

    @Test
    void testMaxOfLast3_tooShort() {
        ListNode list = new ListNode(7, new ListNode(2));
        assertThrows(IllegalArgumentException.class, () -> FinalPractice.maxOfLast3(list));
    }

    @Test
    void testSumEvenLeafNodes_exampleTree() {
        TreeNode tree = new TreeNode(12, new TreeNode(6, new TreeNode(4, new TreeNode(3), null), new TreeNode(8)), new TreeNode(18, new TreeNode(16), new TreeNode(20, null, new TreeNode(22))));
        int actual = FinalPractice.sumEvenLeafNodes(tree);
        assertEquals(46, actual);
    }

    @Test
    void testSumEvenLeafNodes_singleEvenLeaf() {
        TreeNode tree = new TreeNode(1, null, new TreeNode(2));
        int actual = FinalPractice.sumEvenLeafNodes(tree);
        assertEquals(2, actual);
    }

    @Test
    void testSumEvenLeafNodes_singleOddLeaf() {
        TreeNode tree = new TreeNode(1, null, new TreeNode(3));
        int actual = FinalPractice.sumEvenLeafNodes(tree);
        assertEquals(0, actual);
    }
}

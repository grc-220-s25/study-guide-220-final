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
        ListNode list = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10, new ListNode(12, new ListNode(14, new ListNode(16, new ListNode(18)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(40, actual);
    }
    @Test
    void testEvenIndexSum_nullLengthList() {
        ListNode list = new ListNode(0);
        int actual = FinalPractice.oddIndexSum(list);
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
    public void testForLeafNodeEven() {
        TreeNode root = new TreeNode(2,
            new TreeNode(4),
            new TreeNode(6, new TreeNode(8), null));
            assertEquals(12, FinalPractice.treeNodeEven(root));
        }
    }
        


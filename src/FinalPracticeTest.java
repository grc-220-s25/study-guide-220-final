import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    @Test
    public void testTwoElements() {
        ListNode test4 = new ListNode(5, new ListNode(20));
        assertEquals(20, FinalPractice.oddIndexSum(test4));
    }

    @Test
    public void testOddIndexesZero() {
        ListNode test5 = new ListNode(1,
                            new ListNode(0,
                            new ListNode(2,
                            new ListNode(0,
                            new ListNode(3,
                            new ListNode(0))))));
        assertEquals(0, FinalPractice.oddIndexSum(test5));
    }

    @Test
    public void testEvenIndexesZero() {
        ListNode test6 = new ListNode(0,
                            new ListNode(7,
                            new ListNode(0,
                            new ListNode(5,
                            new ListNode(0,
                            new ListNode(3))))));
        assertEquals(15, FinalPractice.oddIndexSum(test6));
    }
    @Test
    public void testExampleList() {
        ListNode list = new ListNode(7,
                            new ListNode(3,
                            new ListNode(19,
                            new ListNode(21,
                            new ListNode(14,
                            new ListNode(33,
                            new ListNode(8,
                            new ListNode(26,
                            new ListNode(11,
                            new ListNode(5))))))))));
        assertEquals(26, FinalPractice.maxOfLastThree(list));
    }

    @Test
    public void testExactlyThreeElements() {
        ListNode list = new ListNode(10,
                            new ListNode(20,
                            new ListNode(30)));
        assertEquals(30, FinalPractice.maxOfLastThree(list));
    }

    @Test
    public void testNegativeNumbers() {
        ListNode list = new ListNode(-5,
                            new ListNode(-10,
                            new ListNode(-3,
                            new ListNode(-1,
                            new ListNode(-20)))));
        // last three: -3, -1, -20 => max = -1
        assertEquals(-1, FinalPractice.maxOfLastThree(list));
    }

    @Test
    public void testDuplicates() {
        ListNode list = new ListNode(1,
                            new ListNode(2,
                            new ListNode(3,
                            new ListNode(4,
                            new ListNode(3,
                            new ListNode(3))))));
        // last three: 4, 3, 3 => max = 4
        assertEquals(4, FinalPractice.maxOfLastThree(list));
    }

    @Test
    public void testTooShortListReturnsNegativeOne() {
    ListNode oneNode = new ListNode(42);
    assertEquals(-1, FinalPractice.maxOfLastThree(oneNode));

    ListNode twoNodes = new ListNode(10, new ListNode(20));
    assertEquals(-1, FinalPractice.maxOfLastThree(twoNodes));
}
}








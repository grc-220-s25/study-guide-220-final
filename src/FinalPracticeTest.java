import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    // @Test
    // void testOddIndexSum_oddLengthList() {
    //     ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
    //     int actual = FinalPractice.oddIndexSum(list);
    //     assertEquals(95, actual);
    // }
    /*
     * 
     * Tests for oddIndexSum()
     */
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16,
                new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual); // 8 + 16 + 42 + 29 = 95
    }

    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(2 + 4 + 6, actual); // = 12
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
        assertEquals(0, actual); // Index 0 is not odd
    }

    @Test
    void testOddIndexSum_twoNodes() {
        ListNode list = new ListNode(10, new ListNode(20));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(20, actual); // Only index 1 is odd
    }

    @Test
    void testOddIndexSum_allOddIndexesZero() {
        ListNode list = new ListNode(1, new ListNode(0, new ListNode(2, new ListNode(0,
                new ListNode(3, new ListNode(0))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0 + 0 + 0, actual); // = 0
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
        assertEquals(26, actual); // last 3 values: 26, 11, 5
    }

    @Test
    void testLargestOfLastThree_exactlyThreeNodes() {
        ListNode list = new ListNode(9, new ListNode(4, new ListNode(12)));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(12, actual); // last 3: 9, 4, 12
    }

    @Test
    void testLargestOfLastThree_allEqualValues() {
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1,
                new ListNode(1, new ListNode(7, new ListNode(7, new ListNode(7))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(7, actual); // last 3: 7, 7, 7
    }

    @Test
    void testLargestOfLastThree_descendingOrder() {
        ListNode list = new ListNode(10, new ListNode(9, new ListNode(8, new ListNode(7,
                new ListNode(6, new ListNode(5, new ListNode(4, new ListNode(3,
                        new ListNode(2, new ListNode(1))))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(3, actual); // last 3: 3, 2, 1
    }

    @Test
    void testLargestOfLastThree_ascendingOrder() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8,
                        new ListNode(9, new ListNode(10))))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(10, actual); // last 3: 8, 9, 10
    }
}

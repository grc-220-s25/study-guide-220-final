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
        assertEquals(20, sumOddIndexes(test4));
    }

    @Test
    public void testOddIndexesZero() {
        ListNode test5 = new ListNode(1,
                            new ListNode(0,
                            new ListNode(2,
                            new ListNode(0,
                            new ListNode(3,
                            new ListNode(0))))));
        assertEquals(0, sumOddIndexes(test5));
    }

    @Test
    public void testEvenIndexesZero() {
        ListNode test6 = new ListNode(0,
                            new ListNode(7,
                            new ListNode(0,
                            new ListNode(5,
                            new ListNode(0,
                            new ListNode(3))))));
        assertEquals(15, sumOddIndexes(test6));
    }

    // Helper method if not already imported
    public static int sumOddIndexes(ListNode head) {
        int index = 0, sum = 0;
        ListNode current = head;
        while (current != null) {
            if (index % 2 == 1) {
                sum += current.data;
            }
            current = current.next;
            index++;
        }
        return sum;
    }
}



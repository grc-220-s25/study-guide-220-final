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
}

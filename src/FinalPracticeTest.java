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

    // TODO: Make thorough tests for ALL the questions on the study guide

// @Test
// void testSomeOtherMethod_basicCase() {
//     // Arrange (set up input)
//     // Act (call the method)
//     // Assert (check results)
//}



    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        assertEquals(6, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_singleElement() {
        ListNode list = new ListNode(10);
        assertEquals(0, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_twoElements() {
        ListNode list = new ListNode(5, new ListNode(7));
        assertEquals(7, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_emptyList() {
        assertEquals(0, FinalPractice.oddIndexSum(null));
    }
}

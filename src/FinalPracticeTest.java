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
    void testOddIndexSum_ZeroOnlyPassedIN(){
        ListNode list = new ListNode(0);
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(-1, actual);
    }
    @Test
    void testOddIndexSum_NullOnlyPassedIN(){
        int actual = FinalPractice.oddIndexSum(null);
        assertEquals(0, actual);
    }
    @Test
    void testOddIndexSum_OnlyOneNegativeAtFirstIndexPassedIN(){
        ListNode list = new ListNode(0, new ListNode(-10));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(-10, actual);
    }
    @Test
    void testOddIndexSum_AllEvenOnlyPassedIN(){
        ListNode list = new ListNode(0, new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(18, actual);
    }
    @Test
    void testOddIndexSum_AllNegativeOnlyPassedIN(){
        ListNode list = new ListNode(-1, new ListNode(-2, new ListNode(-4, new ListNode(-6, new ListNode(-8, new ListNode(-10))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(-18, actual);
    }
    
    // TODO: Make thorough tests for ALL the questions on the study guide
}

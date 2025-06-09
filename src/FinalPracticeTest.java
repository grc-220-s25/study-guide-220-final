import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    
        //testOddIndexSum

    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_evenLengthList() {
    ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29))))))));
    int actual = FinalPractice.oddIndexSum(list);
    assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_onlyOddNodes() {
    ListNode list = new ListNode(3, new ListNode(7, new ListNode(15, new ListNode(5, new ListNode(23, new ListNode(41, new ListNode(11)))))));
    int actual = FinalPractice.oddIndexSum(list);
    assertEquals(53, actual);
    }

    @Test
    void testOddIndexSum_onlyEvenNodes() {
    ListNode list = new ListNode(3, new ListNode(6, new ListNode(14, new ListNode(12, new ListNode(4, new ListNode(96, new ListNode(20)))))));
    int actual = FinalPractice.oddIndexSum(list);
    assertEquals(114, actual);
    }
    @Test
    void testOddIndexSum_allZero() {
    ListNode list = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0)))))));
    int actual = FinalPractice.oddIndexSum(list);
    assertEquals(0, actual);
    }
    @Test
    void testOddIndexSum_allNegative() {
        ListNode list = new ListNode(-4, new ListNode(-8, new ListNode(-15, new ListNode(-16, new ListNode(-23, new ListNode(-42, new ListNode(-11, new ListNode(-29, new ListNode(-34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(-95, actual);
    }
    @Test
    void testOddIndexSum_isNull() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }
        
    //findLargestOfLastThree method

    @Test
    void testFindLargestOfLastThree_whenPositive() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.findLargestofLastThree(list);
        assertEquals(34, actual);
    }
    @Test
    void testFindLargestOfLastThree_whenNegative() {
        ListNode list = new ListNode(-4, new ListNode(-8, new ListNode(-15, new ListNode(-16, new ListNode(-23, new ListNode(-42, new ListNode(-11, new ListNode(-29, new ListNode(-34)))))))));
        int actual = FinalPractice.findLargestofLastThree(list);
        assertEquals(-11, actual);
    }
    @Test
    void testFindLargestOfLastThree_whenPostiveAndNegative() {
        ListNode list = new ListNode(4, new ListNode(-8, new ListNode(15, new ListNode(-16, new ListNode(23, new ListNode(-42, new ListNode(11, new ListNode(-29, new ListNode(34)))))))));
        int actual = FinalPractice.findLargestofLastThree(list);
        assertEquals(34, actual);
    }
    @Test
    void testFindLargestOfLastThree_isNull() {
        ListNode list = null;
        int actual = FinalPractice.findLargestofLastThree(list);
        assertEquals(0, actual);    
    }
    @Test
    void testFindLargestOfLastThree_onlyOneNode() {
        ListNode list = new ListNode(100);
        int actual = FinalPractice.findLargestofLastThree(list);
        assertEquals(0, actual);
    }
    @Test
    void testFindLargestOfLastThree_onlyTwoNodes() {
        ListNode list = new ListNode(4, new ListNode(8));
        int actual = FinalPractice.findLargestofLastThree(list);
        assertEquals(0, actual);
    }
    @Test
    void testFindLargestOfLastThree_onlyThreeNodes() {
        ListNode list = new ListNode(4, new ListNode(-99, new ListNode(99)));
        int actual = FinalPractice.findLargestofLastThree(list);
        assertEquals(99, actual);
    }
}

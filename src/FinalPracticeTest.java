import static org.junit.Assert.*;

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
void testOddIndexSum_nullList() {
    assertEquals(0, FinalPractice.oddIndexSum(null));
}

@Test
void testOddIndexSum_singleNode() {
    ListNode list = new ListNode(10);
    assertEquals(0, FinalPractice.oddIndexSum(list));  // No odd index
}

@Test
void testOddIndexSum_twoNodes() {
    ListNode list = new ListNode(10, new ListNode(20));
    assertEquals(20, FinalPractice.oddIndexSum(list)); 
}

@Test
void testOddIndexSum_threeNodes() {
    ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
    assertEquals(2, FinalPractice.oddIndexSum(list)); 
}

@Test
void testOddIndexSum_evenLengthList() {
    ListNode list = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7))));
    assertEquals(10, FinalPractice.oddIndexSum(list)); 
}

@Test
void testOddIndexSum_allZeros() {
    ListNode list = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0)))));
    assertEquals(0, FinalPractice.oddIndexSum(list));
}


    // TODO: Make thorough tests for ALL the questions on the study guide
     @Test
    void testOddIndexSum_basic() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        assertEquals(95, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_empty() {
        assertEquals(0, FinalPractice.oddIndexSum(null));
    }

    @Test
    void testLargestOfLast3_basic() {
        ListNode list = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7, new ListNode(9, new ListNode(11, new ListNode(13)))))));
        assertEquals(13, FinalPractice.largestOfLast3(list));
    }

    @Test
    void testLargestOfLast3_onlyThree() {
        ListNode list = new ListNode(2, new ListNode(9, new ListNode(5)));
        assertEquals(9, FinalPractice.largestOfLast3(list));
    }

    @Test
    void testSumEvenLeaf() {
        TreeNode tree = new TreeNode(12,
                new TreeNode(6,
                    new TreeNode(4,
                        new TreeNode(3), null),
                    new TreeNode(8)),
                new TreeNode(18,
                    new TreeNode(16),
                    new TreeNode(20, null, new TreeNode(22))));
        assertEquals(46, FinalPractice.sumEvenLeaf(tree));
    }

    @Test
    void testSumOddBranches() {
        TreeNode tree = new TreeNode(15,
                new TreeNode(9,
                    new TreeNode(8,
                        new TreeNode(2), new TreeNode(6)),
                    new TreeNode(11)),
                new TreeNode(4,
                    new TreeNode(21, null, new TreeNode(23)),
                    new TreeNode(30)));
        assertEquals(45, FinalPractice.sumOddBranches(tree));
    }

    @Test
    void testFrequencyMap() {
        ListNode list = new ListNode(4, new ListNode(34, new ListNode(4, new ListNode(16, new ListNode(4, new ListNode(16, new ListNode(29, new ListNode(8, new ListNode(8)))))))));
        Map<Integer, Integer> expected = Map.of(
                4, 3,
                34, 1,
                16, 2,
                29, 1,
                8, 2
        );
        assertEquals(expected, FinalPractice.frequencyMap(list));
    }
@Test
void testFrequencyMap_allUnique() {
    ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    Map<Integer, Integer> expected = Map.of(
        1, 1,
        2, 1,
        3, 1,
        4, 1
    );
    assertEquals(expected, FinalPractice.frequencyMap(list));
}

}

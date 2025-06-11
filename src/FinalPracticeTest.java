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
        int actual = FinalPractice.findLargestOfLastThree(list);
        assertEquals(34, actual);
    }
    @Test
    void testFindLargestOfLastThree_whenNegative() {
        ListNode list = new ListNode(-4, new ListNode(-8, new ListNode(-15, new ListNode(-16, new ListNode(-23, new ListNode(-42, new ListNode(-11, new ListNode(-29, new ListNode(-34)))))))));
        int actual = FinalPractice.findLargestOfLastThree(list);
        assertEquals(-11, actual);
    }
    @Test
    void testFindLargestOfLastThree_whenPostiveAndNegative() {
        ListNode list = new ListNode(4, new ListNode(-8, new ListNode(15, new ListNode(-16, new ListNode(23, new ListNode(-42, new ListNode(11, new ListNode(-29, new ListNode(34)))))))));
        int actual = FinalPractice.findLargestOfLastThree(list);
        assertEquals(34, actual);
    }
    @Test
    void testFindLargestOfLastThree_isNull() {
        ListNode list = null;
        int actual = FinalPractice.findLargestOfLastThree(list);
        assertEquals(0, actual);    
    }
    @Test
    void testFindLargestOfLastThree_onlyOneNode() {
        ListNode list = new ListNode(100);
        int actual = FinalPractice.findLargestOfLastThree(list);
        assertEquals(0, actual);
    }
    @Test
    void testFindLargestOfLastThree_onlyTwoNodes() {
        ListNode list = new ListNode(4, new ListNode(8));
        int actual = FinalPractice.findLargestOfLastThree(list);
        assertEquals(0, actual);
    }
    @Test
    void testFindLargestOfLastThree_onlyThreeNodes() {
        ListNode list = new ListNode(4, new ListNode(-99, new ListNode(99)));
        int actual = FinalPractice.findLargestOfLastThree(list);
        assertEquals(99, actual);
    }

// SumEvenLeafNodes

    @Test
    void testSumEvenLeafNodes_singleLeafNodePerBranch() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(3);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(8);
        assertEquals(12, FinalPractice.sumEvenLeafNodes(root));
    }
    @Test
    void testSumEvenLeafNodes_pairOfLeafNodesPerBranch() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(3);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        assertEquals(10, FinalPractice.sumEvenLeafNodes(root));
    }
    @Test
    void testSumEvenLeafNodes_onlyOddLeaves() {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(13);
        root.right = new TreeNode(11);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
        assertEquals(0, FinalPractice.sumEvenLeafNodes(root));
    }
    @Test
    void testSumEvenLeafNodes_onlyEvenLeaves() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(12);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(16);
        assertEquals(28, FinalPractice.sumEvenLeafNodes(root));
    }
    @Test
    void testSumEvenLeafNodes_whenOnlyRoot() {
        TreeNode root = new TreeNode(10);
        assertEquals(10, FinalPractice.sumEvenLeafNodes(root));
    }
    @Test
    void testSumEvenLeafNodes_whenNull() {
        TreeNode root = null;
        assertEquals(0, FinalPractice.sumEvenLeafNodes(root));
    }

    //sumOddBranchNodes

    @Test
    void testSumOddBranchNodes_whenLeftBranchIsOdd() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(3);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(8);
        assertEquals(3, FinalPractice.sumOddBranchNodes(root));
    }
    @Test
    void testSumOddBranchNodes_whenRightBranchIsOdd() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(11);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(8);
        assertEquals(11, FinalPractice.sumOddBranchNodes(root));
    }
    @Test
    void testSumOddBranchNodes_complexTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(-15);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.left.left.left = new TreeNode(-2);
        root.left.left.right = new TreeNode(5);
        
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(-17);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(-16);
        root.right.right.right = new TreeNode(20);
        assertEquals(-32, FinalPractice.sumOddBranchNodes(root));
    }
    @Test
    void testSumOddBranchNodes_complexTreeIsOdd() {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(7);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(9);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(19);

        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(21);
        root.right.left.right = new TreeNode(23);
        root.right.right.left = new TreeNode(27);
        root.right.right.right = new TreeNode(33);
        assertEquals(66, FinalPractice.sumOddBranchNodes(root));
    }
    @Test
    void testSumOddBranchNodes_complexTreeIsEven() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(18);

        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(22);
        root.right.left.right = new TreeNode(24);
        root.right.right.left = new TreeNode(26);
        root.right.right.right = new TreeNode(32);
        assertEquals(0, FinalPractice.sumOddBranchNodes(root));
    }
    @Test
    void testSumOddBranchNodes_whenRootHasTwoChildren() {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(6);
        root.right = new TreeNode(14);
        assertEquals(9, FinalPractice.sumOddBranchNodes(root));
    }
    @Test
    void testSumOddBranchNodes_whenOnlyRoot() {
        TreeNode root = new TreeNode(9);
        assertEquals(0, FinalPractice.sumOddBranchNodes(root));
    }
    @Test
    void testSumOddBranchNodes_whenNull() {
        TreeNode root = null;
        assertEquals(0, FinalPractice.sumOddBranchNodes(root));
    }
}


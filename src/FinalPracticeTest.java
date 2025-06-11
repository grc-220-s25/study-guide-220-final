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
        assertEquals(0, actual);
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

    //TODO: Make tests for evenIndexSum
    @Test
    void testevenIndexSum_evenLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(87, actual);
    }
    @Test
    void testEvenIndexSum_ZeroOnlyPassedIN(){
        ListNode list = new ListNode(0);
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(0, actual);
    }
    @Test
    void testEvenIndexSum_NullOnlyPassedIN(){
        int actual = FinalPractice.evenIndexSum(null);
        assertEquals(0, actual);
    }
    @Test
    void testEvenIndexSum_OnlyOneNegativeAtZeroIndexPassedIN(){
        ListNode list = new ListNode(-10, new ListNode(0));
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(-10, actual);
    }
    @Test
    void testEvenIndexSum_AllEvenOnlyPassedIN(){
        ListNode list = new ListNode(0, new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10))))));
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(12, actual);
    }
    @Test
    void testEvenIndexSum_AllNegativeOnlyPassedIN(){
        ListNode list = new ListNode(-1, new ListNode(-2, new ListNode(-4, new ListNode(-6, new ListNode(-8, new ListNode(-10))))));
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(-13, actual);
    }

    //TODO: Make tests for LargestOFLastThree
    @Test
    void testlargestOfLastThree_LargestIsActuallyLargestOfThree(){
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
    int actual = FinalPractice.largestOfLastThree(list);
    assertEquals(26, actual);
    }
    @Test
    void testlargestOfLastThree_AllNegative(){
        ListNode list = new ListNode(-7,
    new ListNode(-3,
    new ListNode(-19,
    new ListNode(-21,
    new ListNode(-14,
    new ListNode(-33,
    new ListNode(-8,
    new ListNode(-26,
    new ListNode(-11,
    new ListNode(-5))))))))));
    int actual = FinalPractice.largestOfLastThree(list);
    assertEquals(-5, actual);
    }
    @Test
    void testlargestOfLastThree_OnlyNull(){
    int actual = FinalPractice.largestOfLastThree(null);
    assertEquals(0, actual);
    }
    @Test
    void testlargestOfLastThree_OnlyOneValue(){
    ListNode list = new ListNode(100);
    int actual = FinalPractice.largestOfLastThree(list);
    assertEquals(100, actual);
    }
    @Test
    void testlargestOfLastThree_OnlyThreeNodes(){
    ListNode list = new ListNode(10,
    new ListNode(100,
    new ListNode(1000)));
    int actual = FinalPractice.largestOfLastThree(list);
    assertEquals(1000, actual);
    }
    @Test
    void testlargestOfLastThree_AllTheSame(){
    ListNode list = new ListNode(100,
    new ListNode(1000,
    new ListNode(1000)));
    int actual = FinalPractice.largestOfLastThree(list);
    assertEquals(1000, actual);
    }
    //TODO: Make tests for sumOfLeafevenLeafNodes
    
    @Test
    void testSumOfLeafevenLeafNodes_twoEvenLeafsOnly(){
        TreeNode tree = new TreeNode(25,
        //left
        new TreeNode(15,
         new TreeNode(10,
         null,
         null),
          new TreeNode(18,
          new TreeNode(17,
          null, 
          null),
          null)),
        //right
        new TreeNode(35, 
        null, 
        new TreeNode(40,
        new TreeNode(38,
        null,null),
        null)));
        int actual = FinalPractice.sumOfLeafevenLeafNodes(tree);
        assertEquals(48, actual);
    }
    @Test
    void testSumOfLeafevenLeafNodes_onlyOneTreenode(){
        TreeNode tree = new TreeNode(0);
        int actual = FinalPractice.sumOfLeafevenLeafNodes(tree);
        assertEquals(0, actual);
    }
    @Test
    void testSumOfLeafevenLeafNodes_allOddNumbers(){
        TreeNode tree = new TreeNode(1,
        new TreeNode(1,
        new TreeNode(1, null,null),
        new TreeNode(1, null,null)),
        //right
        new TreeNode(1,
        new TreeNode(1, null, null),
        new TreeNode(1, null, null)));
        int actual = FinalPractice.sumOfLeafevenLeafNodes(tree);
        assertEquals(0, actual);
    }
    @Test
    void testSumOfLeafevenLeafNodes_onlyOneEvenLeaf(){
        TreeNode tree = new TreeNode(0,
        new TreeNode(1,null,null),
        new TreeNode(2,null,null));
        int actual = FinalPractice.sumOfLeafevenLeafNodes(tree);
        assertEquals(2, actual);
    }
    @Test
    void testSumOfLeafevenLeafNodes_oneLeafEvenOfpairs(){
        TreeNode tree = new TreeNode(1,
        new TreeNode(1,
        new TreeNode(2, null,null),
        new TreeNode(1, null,null)),
        //right
        new TreeNode(1,
        new TreeNode(1, null, null),
        new TreeNode(2, null, null)));
        int actual = FinalPractice.sumOfLeafevenLeafNodes(tree);
        assertEquals(4, actual);
    }
    @Test
    void testSumOfLeafevenLeafNodes_oneLeafEvenSum(){
        TreeNode tree = new TreeNode(1,new TreeNode(12, null, null), null);
        int actual = FinalPractice.sumOfLeafevenLeafNodes(tree);
        assertEquals(12, actual);
    }
    @Test
    void testSumOfLeafevenLeafNodes_singleElementIsNull(){
        int actual = FinalPractice.sumOfLeafevenLeafNodes(null);
        assertEquals(0, actual);
    }

    //TODO: make tests for sumOfoddBranchNodes
    /*
       Tree:
            15
          /    \
         9      4
        / \    /  \
       8   11 21   30
      / \       \
     2   6       23
     */
    @Test
    void sumOfoddBranchNodes_allExampleTest(){
        TreeNode tree = new TreeNode(15,
        //left
        new TreeNode(9,
        new TreeNode(8,
        new TreeNode(2,null,null),
        new TreeNode(6,null,null)),
        new TreeNode(11,null,null)),
        //right
        new TreeNode(4,
        new TreeNode(21,null,new TreeNode(23,null,null)),
        new TreeNode(30,null,null)));
        int actual = FinalPractice.sumOfoddBranchNodes(tree);

        assertEquals(45, actual);
    }
    @Test
    void sumOfoddBranchNodes_TreeNodeIsNull(){
        int actual = FinalPractice.sumOfoddBranchNodes(null);
        assertEquals(0, actual);
    }
    @Test
    void sumOfoddBranchNodes_TwoBranchNodesodd(){
        TreeNode tree = new TreeNode(2,
        new TreeNode(4,
        new TreeNode(1,null,null),
         null),
        new TreeNode(4,
        null,
        new TreeNode(1,null,null)));
        int actual = FinalPractice.sumOfoddBranchNodes(tree);
        assertEquals(2, actual);
    }
    @Test
    void sumOfoddBranchNodes_AllEvenNodes(){
        TreeNode tree = new TreeNode(10,
        new TreeNode(10,
        new TreeNode(10,null,null),
         null),
        new TreeNode(10,
        null,
        new TreeNode(10,null,null)));

        int actual = FinalPractice.sumOfoddBranchNodes(tree);
        assertEquals(0, actual);
    }
    @Test
    void sumOfoddBranchNodes_AllOddNodes(){
        TreeNode tree = new TreeNode(1, new TreeNode(1, new TreeNode(1, new TreeNode(1, null,null),null),null), new TreeNode(1, null, new TreeNode(1,null, new TreeNode(1,null,null))));

        int actual = FinalPractice.sumOfoddBranchNodes(tree);
        assertEquals(5, actual);
    }
     
}

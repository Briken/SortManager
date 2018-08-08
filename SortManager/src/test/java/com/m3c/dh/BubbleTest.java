package com.m3c.dh;

import com.m3c.dh.sortManager.BubbleSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 class BubbleTest {


    private BubbleSort bubbleSort;

    private int[] unsortedArray;
    private int[] unsortedArray2;

    @Before
    public void setup() {
        unsortedArray = new int[]{9, 8, 7, 4, 5, 6, 0, 3, 2, 1};
        unsortedArray2 = new int[]{546, 54, 76547, 57, 568, 324543, 21, 1342, 2};
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testSortedArray() {
        int[] sortedArray = bubbleSort.sortArray(unsortedArray);
        for (int i = 0; i < sortedArray.length; i++) {
            Assert.assertTrue(sortedArray[i + 1] >= sortedArray[i]);
        }
    }

    public void testEmptyArray() {
        int[] sortedArray = new int[]{};

        sortedArray = bubbleSort.sortArray(sortedArray);
    }

}
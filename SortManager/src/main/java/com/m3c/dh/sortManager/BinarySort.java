package com.m3c.dh.sortManager;

import com.m3c.dh.sortManager.BinaryTreePkg.BinarySearchTree;
import com.m3c.dh.sortManager.Sorter;

import java.util.List;

public class BinarySort implements Sorter {

    BinarySearchTree tree  = new BinarySearchTree();

    @Override
    public int[] sortArray(int[] unsortedArray)
    {
        int[] sortedArray = unsortedArray;
        List<Integer> sortedList;

        tree.addElements(sortedArray);
        sortedList = tree.getSortedTreeAsc();
        for (int i = 0; i< sortedList.size(); i++)
        {
            sortedArray[i] = sortedList.get(i);
        }
        return sortedArray;
    }

    public String toString() {return "Binary Tree Sorter";}
}

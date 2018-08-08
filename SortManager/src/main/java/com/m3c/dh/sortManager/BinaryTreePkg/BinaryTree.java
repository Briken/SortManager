package com.m3c.dh.sortManager.BinaryTreePkg;
import java.util.List;

/**
 * Created by keith.dauris on 26/06/2017.
 */
public interface BinaryTree {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    int findElement(int value) throws BinaryException;

    int getLeftChild(int element) throws BinaryException;

    int getRightChild(int element) throws BinaryException;

    List<Integer> getSortedTreeAsc();

    List<Integer> getSortedTreeDesc();
}

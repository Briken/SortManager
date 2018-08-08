package com.m3c.dh.sortManager.BinaryTreePkg;

import java.util.ArrayList;
import java.util.List;


public class BinarySearchTree implements BinaryTree
{

    Node root = null;
    List<Node> nodes = new ArrayList<>();
    List<Integer> sortedNodeVals = new ArrayList<>();



    @Override
    public int getRootElement() {
        if (root == null)
        {
            return 0;
        }
        return root.getKey();
    }

    @Override
    public int getNumberOfElements()
    {
        int counter =  nodes.size();
        return counter;
    }

    @Override
    public void addElement(int element) {
        root = recursiveInsert(root, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++)
        {
            addElement(elements[i]);
        }
    }

    @Override
    public int findElement(int value) throws BinaryException {
        Node foundNode = recursiveSearch(value, root);
        return foundNode.getKey();
    }

    @Override
    public int getLeftChild(int element)throws BinaryException{
        Node foundNode = recursiveSearch(element, root);
        if (foundNode.getLeftN() == null)
        {
            throw new BinaryException("Node: " + element + " has no left child");
        }
        return foundNode.getLeftN().getKey();
    }

    @Override
    public int getRightChild(int element) throws BinaryException{
        Node foundNode = recursiveSearch(element, root);
        if (foundNode.getRightN() == null)
        {
            throw new BinaryException("Node: " + element + " has no left child");
        }
        return foundNode.getRightN().getKey();
    }

    @Override
    public List<Integer> getSortedTreeAsc() {
        sortedNodeVals.clear();
        recursiveSortASC(root);
        return sortedNodeVals;
    }

    @Override
    public List<Integer> getSortedTreeDesc() {
        sortedNodeVals.clear();
        recursiveSortDESC(root);
        return  sortedNodeVals;
    }

    private Node recursiveInsert(Node root, int key)
    {
        if (root==null)
        {
            root =  new Node(key);
            nodes.add(root);
            return root;
        }

        if (key < root.getKey())
        {
            root.setLeftN(recursiveInsert(root.getLeftN(), key));
        }
        else if (key > root.getKey()) {
            root.setRightN(recursiveInsert(root.getRightN(), key));
        }
        return root;
    }

    private Node recursiveSearch(int value, Node sroot) throws BinaryException
    {
        Node result = null;
        if (sroot == null)
            return null;
        if (sroot.getKey() == value)
            return sroot;
        if (value < sroot.getKey()) {
            result = recursiveSearch(value, sroot.getLeftN());
        }
        if (value > sroot.getKey()) {
            result = recursiveSearch(value, sroot.getRightN());
        }
        if (result == null)
        {
            throw new BinaryException("Node Not found");
        }
        return result;
    }

    private void recursiveSortASC(Node root)
    {

        if (root != null) {
            recursiveSortASC(root.getLeftN());
            sortedNodeVals.add(root.getKey());
            recursiveSortASC(root.getRightN());
        }

    }
    private void recursiveSortDESC(Node root)
    {

        if (root != null) {
            recursiveSortDESC(root.getRightN());
            sortedNodeVals.add(root.getKey());
            recursiveSortDESC(root.getLeftN());
        }

    }

}
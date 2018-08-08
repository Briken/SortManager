package com.m3c.dh.sortManager.BinaryTreePkg;

public class Node {
    private final int key;
    private Node leftN;
    private Node rightN;

    public Node (int item)
    {
        key = item;

    }

    public int getKey() {
        return key;
    }

    public Node getLeftN() {

        return leftN;
    }

    public void setLeftN(Node leftN) {
        this.leftN = leftN;
    }

    public Node getRightN() {
        return rightN;
    }

    public void setRightN(Node rightN) {
        this.rightN = rightN;
    }
}

package com.m3c.dh.sortManager.BinaryTreePkg;



public class BinaryException extends Exception {

    private String message;
    public  BinaryException(String s)
    {
        message = s;
    }

    public String getMessage()
    {
        return message;
    }
}

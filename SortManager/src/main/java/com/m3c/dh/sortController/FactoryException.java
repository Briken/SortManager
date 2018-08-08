package com.m3c.dh.sortController;

public class FactoryException extends Exception {

    String message;

    public FactoryException(String s)
    {
        message = s;
    }

    public String getMessage()
    {
        return message;
    }

}

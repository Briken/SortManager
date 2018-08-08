package com.m3c.dh.display;

import java.util.Arrays;

public class DisplayManager {
    public void displayUnsortedArray(int[] unsortedArray, String sorterName){
        System.out.println("Sorted Using the " + sorterName);
        System.out.println("Before sorting:\n" + Arrays.toString(unsortedArray));
    }



    public void displaySortedArray(int[] sortedArray) {
        System.out.println("After sorting: \n" + Arrays.toString( sortedArray));
    }

}




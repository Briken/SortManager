package com.m3c.dh.sortController;

import com.m3c.dh.display.DisplayManager;
import com.m3c.dh.sortManager.BubbleSort;
import com.m3c.dh.sortManager.MergeSort;
import com.m3c.dh.sortManager.Sorter;
//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;

public class SortManager {
    private DisplayManager displayMgr = new DisplayManager();

    private Sorter sorter;

    int[] unsortedArray = new int[] {2665646,54,12,46,32,95,4949,-898,53,89832,-55431,56213,-48545};
    int[] sortedArray;



    public void sortArray() {
        try {
            sorter = chooseSort();
        }
        catch (FactoryException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        displayInput(unsortedArray);
        sortedArray = sorter.sortArray(unsortedArray);
        displayOutput(sortedArray);
    }

    private void displayInput(int[] uArray)
    {
        displayMgr.displayUnsortedArray(uArray, sorter.toString());
    }

    private void displayOutput(int[] sArray)
    {
        displayMgr.displaySortedArray(sArray);
    }
    private Sorter chooseSort() throws FactoryException {
        SortFactory factory = new SortFactory();
        if (factory.getInstance() != null) {
            return factory.getInstance();
        }
        throw new FactoryException("factory failed");
    }
}
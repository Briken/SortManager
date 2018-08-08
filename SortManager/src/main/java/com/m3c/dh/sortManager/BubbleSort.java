package com.m3c.dh.sortManager;

public class BubbleSort implements Sorter{
    public int[] sortArray(int[] arrayToBeSorted)
    {
        sort(arrayToBeSorted);
        return arrayToBeSorted;
    }

    private int[] sort(int[] array)
    {

        int len = array.length;
        int temp =0;
        boolean swapped = true;
        while(swapped) {
            swapped = false;

            for (int i = 0; i < len -1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }

        return array;
    }
    public String toString() {return "Bubble Sorter";}
}

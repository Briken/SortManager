package com.m3c.dh.sortManager;

public class MergeSort implements Sorter
{
    public MergeSort() {

    }
    public int[] sortArray(int[] arrayToBeSorted)
    {
        sort(arrayToBeSorted, 0, arrayToBeSorted.length-1);
        return arrayToBeSorted;
    }


    private void merge(int[] arr, int l, int m, int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;

        int[] la = new int[n1];
        int[] ra = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            la[i] = arr[l+i];
        }

        for (int j = 0; j < n2; j++)
        {
            ra[j] = arr[m+1+j];
        }

        int i = 0, j = 0;

        int k = l;

        while (i < la.length && j < ra.length) {
            if (la[i] < ra[j]) {
                arr[k] = la[i];
                i++;
            } else {
                arr[k] = ra[j];
                j++;
            }
            k++;
        }
        while (i<la.length)
        {
            arr[k] = la[i];
            i++;
            k++;
        }
        while(j < ra.length)
        {
            arr[k] = ra[j];
            j++;
            k++;
        }

    }

    private void sort(int narr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(narr, l, m);
            sort(narr,m+1, r);

            merge(narr, l,m,r);
        }
    }

    @Override
    public String toString() {return "Merge Sorter";}

}

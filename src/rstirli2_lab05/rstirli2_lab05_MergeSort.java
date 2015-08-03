package rstirli2_lab05;

import  java.util.Comparator;

public class rstirli2_lab05_MergeSort{
	
	private Integer[] array;
    private Integer[] tempMergArr;
    private int length;
    rstirli2_lab05_IntegerComparator comp = new rstirli2_lab05_IntegerComparator();
    
    public void sort(Integer[] arr) 
    {
        this.array = arr;
        this.length = arr.length;
        this.tempMergArr = new Integer[length];
        mergeSort(0, length - 1);
    }
 
    private void mergeSort(int lowerIndex, int higherIndex) 
    {
        int middle;
        if (lowerIndex < higherIndex) 
        {
            middle = lowerIndex + (higherIndex - lowerIndex)/2;
            
            mergeSort(lowerIndex, middle);
            
            mergeSort(middle + 1, higherIndex);
            
            merge(lowerIndex, middle, higherIndex);
        }
    }
 
    private void merge(int lowerIndex, int middle, int higherIndex) 
    {
 
        for (int i = lowerIndex; i <= higherIndex; i++)
        {
            tempMergArr[i] = array[i];
        }
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex)
        {
            if (comp.compare(tempMergArr[i],tempMergArr[j])!=1) 
            {
                array[k] = tempMergArr[i];
                i++;
            } 
            else 
            {
                array[k] = tempMergArr[j];
                j++;
            }
            
            k++;
        }
        while (i <= middle) 
        {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

	
    
}

package rstirli2_lab05;

public class rstirli2_lab05_QuickSort {
	
	private int arr[];
    private int length;
 
    public void sort(int[] array) {
         
        if (array == null || array.length == 0) 
        {
            return;
        }
        this.arr = array;
        length = array.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int left, int right) {
         
        int i = left;
        int j = right;
        int pivot = arr[left+(right-left)/2];
        while (i <= j) {
            
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(left, j);
        if (i < right)
            quickSort(i, right);
    }
 
    
	
	private void swap(int m, int n)
	{
		int o = arr[m];
		arr[m]=arr[n];
		arr[n]=o;
	}

}

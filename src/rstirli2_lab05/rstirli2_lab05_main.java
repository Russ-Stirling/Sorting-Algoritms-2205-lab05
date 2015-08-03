package rstirli2_lab05;

import java.util.Arrays;


public class rstirli2_lab05_main {
	
	public static void insertionSort(int[] arr)
	{
		System.out.print("Step:0 ");
        for (int q=0; q<arr.length; q++)
        {
     	   System.out.print(arr[q]+", ");
        }
   	   System.out.println(" ");

        
		for (int i = 1; i <arr.length; i++) 
		{
            int next = arr[i];
            
            int j = i;
            
            
            while (j > 0 && arr[j - 1] >= next)
            {
            		arr[j] = arr[j - 1];
            		j--;
            }
            arr[j] = next;
       	   
            System.out.print("Step:"+i+" ");
            for (int q=0; q<arr.length; q++)
            {
         	   System.out.print(arr[q]+", ");
            }
      	   System.out.println(" ");

        }
	}

    public static void main(String a[]){
        System.out.println("Question 1 begins here:");

        
        
    	rstirli2_lab05_ArrayGenerator gen = new rstirli2_lab05_ArrayGenerator();
    	Integer[] arr1 = gen.generateRandomArray(1000000, 1000000);
    	Integer[] arr2=arr1;
    	int[] arr3=new int[arr1.length];
    	for (int i=0; i<arr1.length; i++)
    	{
    		arr3[i]= ((Integer)arr1[i]).intValue();
    	}
    	int[] arr4=arr3;
    	
    	//System.out.println("Unsorted array");
    	/*for(int i=0; i<arr3.length; i++){
	    	System.out.print(arr3[i]);
	    	System.out.print(" "); 
	    }*/
    	System.out.println("");


    	rstirli2_lab05_MergeSort mMs = new rstirli2_lab05_MergeSort();
    	rstirli2_lab05_QuickSort mQs = new rstirli2_lab05_QuickSort();
    	
    	long start, end, time;
    	start = end = 0; 
    	    	
    	start = System.currentTimeMillis(); 
        mMs.sort(arr1);
        end = System.currentTimeMillis();
        time = end - start; 
        System.out.println("My merge sort time was:"+time);
        start = end = 0; 
        
        /*for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]);
            System.out.print(" "); 
        }*/
        
        System.out.println(" ");

        
        rstirli2_lab05_IntegerComparator comp = new rstirli2_lab05_IntegerComparator();
		
        start = System.currentTimeMillis(); 
        Arrays.sort(arr2, comp);
        end = System.currentTimeMillis();
        time = end - start; 
        System.out.println("Java merge sort time was:"+time);
         
        start = end = 0;        
   	    System.out.println(" ");
   	   
   	    start = System.currentTimeMillis(); 
   	    mQs.sort(arr3);
   	    end = System.currentTimeMillis();
   	    time = end - start; 
   	    System.out.println("My quick sort time was:"+time);
   	   /* for(int i=0; i<arr3.length; i++){
	    	System.out.print(arr3[i]);
	    	System.out.print(" "); 
	    }*/
   	    start = end = 0; 
        
   	    System.out.println(" ");
   	   
   	    start = System.currentTimeMillis(); 
   	    Arrays.sort(arr4);
   	    end = System.currentTimeMillis();
   	    time = end - start; 
   	    System.out.println("Java quick sort time was:"+time);
        
	    System.out.println(" ");

        System.out.println("Question 2 begins here:");
       
        int[] numbers = {31, 19, 76, 24, 94, 99, 21, 74, 40, 73};
       
        insertionSort(numbers);
       
    }
}



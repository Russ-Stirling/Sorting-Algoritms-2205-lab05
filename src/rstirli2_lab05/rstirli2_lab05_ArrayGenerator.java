package rstirli2_lab05;

import java.util.Random;

public class rstirli2_lab05_ArrayGenerator {
	
	public static Integer[] generateRandomArray(int arraySize, int maxValue) 
	{
		Integer[] arr = new Integer[arraySize];
		Random numGen = new Random();
		
		for (int i=0; i<arraySize; i++)
		{
			arr[i] =  Integer.valueOf(numGen.nextInt(maxValue));
		}
		
		return arr;
	}
}

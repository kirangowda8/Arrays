package com.arrays.basic;

import java.util.Arrays;

public class MiddleElements {
      // method to create a new array by excluding the first and last elements of the input array
	public static int[] middleElement(int [] array) {
	  // here i am declaring the new array with a size excluding 2 buckets	
	  int [] newArray = new int [array.length-2];
	  //declaring the new count variable with initializing the 0 value 
	  int count =0;
	  //Iterating the loop 
	  for (int i=1;i<array.length-1;i++) {
      //storing the elements in the new array
		  newArray[count] =array[i];
		  count++; 
	  }
      //returning the new array
	  return newArray;
	
	}	
	public static void main(String[] args) {
		// time complexity =O(n);
		int [] array = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(middleElement(array)).toString());
		
	}
}

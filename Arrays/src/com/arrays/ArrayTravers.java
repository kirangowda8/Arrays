package com.arrays;

public class ArrayTravers {
	public static void main(String[] args) {
		
	ArrayInitialization arrayInitialization = new ArrayInitialization(3);
    for (int i=0 ;i<arrayInitialization.array.length;i++) {
    	//output we will get the Integer.minvalues
    	System.out.println(arrayInitialization.array[i]);
       // time complexity =O(n);
    }
   
	}
}

package com.arrays.basic;

public class SearchInArray {

	public static String seraching(int value,int [] array) {
		for (int i=0;i<array.length;i++) {
			if (array[i] == value)
				return "Value found at the index of "+i;
		    }
		return "value not found";
	}
		
public static void main(String[] args) {
	int [] array = {2,5,23,22,6};
	System.out.println(seraching(2, array));
	 
  }
}
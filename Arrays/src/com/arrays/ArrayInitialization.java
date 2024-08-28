package com.arrays;

public class ArrayInitialization {
    int [] array;
	public ArrayInitialization(int SizeOfArray) {
		array = new int[SizeOfArray];
		for (int i=0;i<array.length;i++) {
			array[i] =Integer.MIN_VALUE;
		}
	}
	public void insert(int index,int valueToBeInserted) {
		try {
		if(array[index] == Integer.MIN_VALUE) {
			array[index]=valueToBeInserted;
			System.out.println("Successfully Inserted");
		}
		else {
			System.out.println("This cell is already occupied");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the array!");
		}
	}
	
 public static void main(String[] args) {
	 
    //initialization on constructor
    ArrayInitialization initialization = new ArrayInitialization(4);
    //adding elements to on array
    initialization.insert(0, 1);
    initialization.insert(1, 10);
    initialization.insert(2, 4);
    initialization.insert(3, 23);
   
    
    //accessing the element 
    var element = initialization.array[2];
    System.out.println(element);
    //time complexity :O(n)
   }
}

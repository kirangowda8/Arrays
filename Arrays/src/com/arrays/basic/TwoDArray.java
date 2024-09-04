package com.arrays.basic;

public class TwoDArray {
	
	public static int SumOf2DArray(int twoDArray[][]) {
		int sum =0;
		for(int row=0;row<twoDArray.length;row++) {
			//sum of the elements 
			sum +=twoDArray[row][row];
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int array [][]= {{1,2,3},{4,5,6},{7,8,9}};
//		time complexity = O(n)
		System.out.println(SumOf2DArray(array));
	}

}

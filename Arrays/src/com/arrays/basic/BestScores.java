package com.arrays.basic;

import java.util.Arrays;

public class BestScores {

	public static int[] findTwoTopScores(int array[]) {
		
		int bestScore_02=0;
		int bestScore_01=0;
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=1;j<array.length;j++) {
				if(bestScore_01 < array[i]) {
					bestScore_02 = bestScore_01;
					System.out.println(bestScore_01+" ,"+bestScore_02+" ,"+ array[i]);
					bestScore_01 = array[i];		
				}
				else if(array[i]<bestScore_01 && array[i]>bestScore_02) {
					bestScore_02 =array[i];
				}
			}
			 
		}
		return new int[] {bestScore_01,bestScore_02};
	}
	public static void main(String[] args) {
		int [] array = {67,4,5,2,23,22};
		System.out.println(Arrays.toString(findTwoTopScores(array)));
		
	}
}

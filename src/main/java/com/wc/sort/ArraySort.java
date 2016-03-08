package com.wc.sort;

public class ArraySort {
	
	public static void main(String[] args) {
		int[] array = {2,1,34,16,31,78,54,11,12};
//		ArraySort.quickSort(array);
		ArraySort.quickSort(array, array.length-1, 0);
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	} 
	
	public static void quickSort(int[] array){
		if(null == array || array.length == 0){
			return;
		}
			for(int i = 0;i<array.length;i++){
				for(int j = 0;j<array.length - 1 - i;j++){
					if(array[j] > array[j+1]){
						int temp = array[j]; 
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
	}
	
	public static void quickSort(int[] array,int high,int low){
		if(low < high){
			int midd = ArraySort.getParition(array, high, low);
			quickSort(array,high,midd+1);
			quickSort(array,midd-1,low);
		}
	}
	
	public static int getParition(int[] array,int high,int low){
		int temp = array[low];
		while(low < high){
			while(low < high && array[high] >= temp){
				high--;
			}
			array[low] = array[high];
			while(low < high && array[low] <= temp){
				low++;
			}
			array[high] = array[low];
		}
		array[low] = temp;
		return low;
	}

}

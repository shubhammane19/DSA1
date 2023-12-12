import java.util.*;

class MaxMinSum{
	
	public static long findMaxMinSum(int[] arr){
		
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		
		for(int num : arr){
			max = Math.max(max,num);
			min = Math.min(min, num);
		}
		return max + min;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++){
			
			arr[i] = sc.nextInt();
		}
		
		long result = findMaxMinSum(arr);
		
		System.out.println("Sum of maximum and minimum elements:" +result);
	}
}
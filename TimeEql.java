import java.util.*;

class TimeEql{
	
	public static int MinTimeTOEqlArray(int[] arr){
		
		int n = arr.length;
		int maxEle = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			
			maxEle = Math.max(maxEle,arr[i]);
		}
		int minTime = 0;
		for(int i=0; i<n; i++){
			minTime += maxEle - arr[i];
		}
		return minTime;
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i =0; i<size; i++){
			
			arr[i]= sc.nextInt();
		}
		
		int result = MinTimeTOEqlArray(arr);
		
		System.out.println("min time required:" +  result);
	}
}
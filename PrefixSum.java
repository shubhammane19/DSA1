import java.util.*;

class PrefixSum{
	
	public static void constructPrefixSum(int[] arr){
		
		int n = arr.length;
		
		for(int i=1; i<n; i++){
			arr[i] += arr[i-1]; 
		}
		for(int num: arr){
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter array size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		constructPrefixSum(arr);
		
		/*for(int i =0; i<size; i++){
			System.out.println(arr[i] +  " ");
		}*/
		/*for(int num : arr){
			System.out.println(num + "");
		}*/
	}
}
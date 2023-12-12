import java.util.*;

class LinearSearch{
	
	public static int countOccurrences(int[] arr,int B){
		
		int count = 0;
		for(int num : arr){
			if(num == B){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter array size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements");
		for(int i = 0; i<size;i++){
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target");
		int target= sc.nextInt();
		
		int result = countOccurrences(arr,target);
		
		System.out.println(result);
	}
}
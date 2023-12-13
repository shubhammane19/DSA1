import java.util.*;

class ProdArray{
	
	public static int[] prodArrayPuzzle(int[] arr){
		
		int n = arr.length;
		
		int[] left = new int[n];
		int[] right = new int[n];
		
		left[0] = 1;
		for(int i=1; i<n; i++){
			left[i] = left[i-1] * arr[i-1];
		}
		right[n -1] = 1;
		for(int i = n-2; i>=0; i--){
			right[i] = right[i+1]*arr[i+1];
		}
			int[] product = new int[n];
			for(int i =0; i<n; i++){
				product[i] = left[i] * right[i];
			}
			
			return product;
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int[] result = prodArrayPuzzle(arr);
		
		//System.out.print("Resulted array:");
		for(int num : result){
			
			System.out.print(num + " ");
		}
	}
}
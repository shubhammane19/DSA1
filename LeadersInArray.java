import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class LeadersInArray {
    public static ArrayList<Integer> findLeaders(int[] A) {
        int n = A.length;

        
        int maxRight = A[n - 1];

       
        ArrayList<Integer> leaders = new ArrayList<>();

       
        leaders.add(maxRight);

       
        for (int i = n - 2; i >= 0; i--) {
            
            if (A[i] > maxRight) {
                
                maxRight = A[i];
                
                leaders.add(maxRight);
            }
        }

        
        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {
        //int[] A = {16, 17, 4, 3, 5, 2};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size  = sc.nextInt();
		
		int[] A = new int[size];
		System.out.println("ENter array ele:");
		for(int i =0; i<size; i++){
			A[i] = sc.nextInt();
		}
        ArrayList<Integer> leaders = findLeaders(A);

        // Print the leaders
        System.out.println("Leaders in the array: " + leaders);
    }
}

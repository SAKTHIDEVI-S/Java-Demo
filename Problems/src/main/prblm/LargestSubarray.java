
package main.prblm;
import java.util.HashMap;
import java.util.Scanner;
public class LargestSubarray {
	 
    int maxLen(int arr[], int n)
    {
        // Create an empty hashMap hM
 
        HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
 
        // Initialize sum of elements
        int sum = 0;
 
        // Initialize results
        int maxLen = 0;
        int endIndex = -1;
        int startIndex = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }
 
        // Traverse through the given array
 
        for (int i = 0; i < n; i++) {
            // Add current element to sum
 
            sum += arr[i];
 
            // To handle sum=0 at last index
 
            if (sum == 0) {
                maxLen = i + 1;
                endIndex = i;
            }
 
            // If this sum is seen before,
            // then update max_len if required
            if (hM.containsKey(sum)) {
                if (maxLen < i - hM.get(sum)) {
                    maxLen = i - hM.get(sum);
                    endIndex = i;
                }
            }
            else // Else put this sum in hash table
                hM.put(sum, i);
        }
 
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }
        if(maxLen==0)
        {
        	System.out.println("No sub-array found");
        }
        else
        {
        startIndex = endIndex - maxLen + 1;
        System.out.println(startIndex + " to " + endIndex);
        }
        return maxLen;
    }
	 
	    public static void main(String[] args)
	    {
	        LargestSubarray sub = new LargestSubarray();
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[20];  
	        for(int i=0; i<n; i++)  
	        {  
	        	//reading array elements from the user   
	        	arr[i]=sc.nextInt();  
	        }  
	        sub.maxLen(arr, n);
	        sc.close();
	    }
}

// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int K = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.minSwap(arr, sizeOfArray, K);
		    System.out.println(ans);
		}
	}
}
// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
            int count = 0;
            for (int i = 0; i < n; ++i)
            if (arr[i] <= k)
                ++count;
         
            // Find unwanted elements in current
            // window of size 'count'
            int bad = 0;
            for (int i = 0; i < count; ++i)
            if (arr[i] > k)
                ++bad;
         
            // Initialize answer with 'bad' value of
            // current window
            int ans = bad;
            for (int i = 0, j = count; j < n; ++i, ++j) {
         
            // Decrement count of previous window
            if (arr[i] > k)
                --bad;
         
            // Increment count of current window
            if (arr[j] > k)
                ++bad;
         
            // Update ans if count of 'bad'
            // is less in current window
            ans = Math.min(ans, bad);
            }
            return ans;
    }
    
    
}

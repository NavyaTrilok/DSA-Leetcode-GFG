// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int i, int j, int arr1[], int arr2[]) 
    {
        
        //int[] arr1 = { -5, 3, 6, 12, 15 };
        //int[] arr2 = { -12, -10, -6, -3, 4, 10 };
  
       // int i = arr1.length;
       // int j = arr2.length;
  
        int[] arr3 = new int[i + j];
  
        // Merge two array into one array
        System.arraycopy(arr1, 0, arr3, 0, i);
        System.arraycopy(arr2, 0, arr3, i, j);
  
        // Sort the merged array
        Arrays.sort(arr3);
        
        int n = arr3.length;
        
        // If length of array is even
        if (n % 2 == 0) 
        {
            int z = n / 2;
            int e = arr3[z];
            int q = arr3[z - 1];
  
            double ans = (float)(e + q) / 2;
            return ans;
        }
        
        // If length if array is odd
        else 
        {
            int z = (n / 2);
            return arr3[z];
        }
    }
}
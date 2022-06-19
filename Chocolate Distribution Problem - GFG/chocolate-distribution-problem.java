// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;
      
        // Sort the given packets
        //Arrays.sort(arr);
        Collections.sort(a);
      
        // Number of students cannot be
        // more than number of packets
        if (n < m)
           return -1;
      
        // Largest number of chocolates
        int min_diff = Integer.MAX_VALUE;
      
        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
         
        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = a.get(i+m-1) - a.get(i);
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
}
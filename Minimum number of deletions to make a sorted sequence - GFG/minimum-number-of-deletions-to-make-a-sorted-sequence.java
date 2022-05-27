// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java
class Solution
{
	public int minDeletions(int arr[], int n) 
	{ 
	   //int n = nums.length;
        
        int[] dps=new int[n];
        //int[] dpe=new int[n];
        
        int lis=0;
        
        for(int i=0;i<n;i++){
            dps[i]=1;
            
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    dps[i]=Math.max(dps[i],dps[j]+1);
                }
            }
            
            lis=Math.max(lis,dps[i]);
        }
        
        
        
        return n-lis;
	} 
}
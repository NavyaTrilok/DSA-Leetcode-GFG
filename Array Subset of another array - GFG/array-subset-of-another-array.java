// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long arr1[], long arr2[], long n, long m) {
        
           // int arr1[] = { 11, 1, 13, 21, 3, 7 };
            //int arr2[] = { 11, 3, 7, 1 };
            //int m=arr1.length;
           // int n=arr2.length;
          
            Set<Long> s = new HashSet<Long>();
            for (int i = 0; i < n; i++)
            {
              s.add(arr1[i]);
            }
            int p = s.size();
            for (int i = 0; i < m; i++)
            {
              s.add(arr2[i]);
            }
          
            if (s.size() == p)
            {
              //System.out.println("arr2[] is subset of arr1[] " + "\n");
              return "Yes";
            }
            else
            {
              //System.out.println("arr2[] is not subset of arr1[] " + "\n" );
              return "No";
            }
        
    }
}